package com.app.service;

import java.io.InputStream;
import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.app.entity.FileMetadataEntity;
import com.app.exception.StorageException;
import com.app.repository.FileMetadataRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class UploadServiceMinoService {

	private final ObjectStorageService storageService;

    private final FileMetadataRepository fileMetadataRepository;

    public List<FileMetadataEntity> getFileMetadata() {
        return fileMetadataRepository.findAll();
    }

    @Transactional
    public String save(MultipartFile file) {
        try {
            UUID uuid = UUID.randomUUID();
            FileMetadataEntity metadata = FileMetadataEntity.builder()
                .id(uuid.toString())
                .size(file.getSize())
                .dateUploaded(new Timestamp(System.currentTimeMillis()))
                .originalName(file.getOriginalFilename())
                .httpContentType(file.getContentType())
                .build();
            fileMetadataRepository.save(metadata);
            return storageService.save(file, uuid);
        } catch (Exception ex) {
            log.error("Exception occurred when trying to save the file", ex);
            throw new StorageException(ex);
        }
    }
    
    public ContentWithMetadata fetchFile(UUID uuid) {
        FileMetadataEntity fileMetadata = fileMetadataRepository.findById(uuid.toString()).orElseThrow();
        return new ContentWithMetadata(fileMetadata, readfile(uuid, fileMetadata.getSize()));
    }

    private byte[] readfile(UUID uuid, long fileSize) {
        long startPosition = 0;
        int chunkSize = (int) (fileSize - startPosition + 1);
        try (InputStream inputStream = storageService.getInputStream(uuid, startPosition, chunkSize)) {
            return inputStream.readAllBytes();
        } catch (Exception exception) {
            log.error("Exception occurred when trying to read file with ID = {}", uuid);
            throw new StorageException(exception);
        }
    }

    public record ContentWithMetadata(
        FileMetadataEntity metadata,
        byte[] chunk) {
    }
    
}
