package com.app.controller;

import static org.springframework.http.HttpHeaders.CONTENT_LENGTH;
import static org.springframework.http.HttpHeaders.CONTENT_TYPE;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.app.entity.FileMetadataEntity;
import com.app.service.UploadServiceMinoService;
import com.app.utils.PathUtils;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(PathUtils.FILE_API_V1)
public class MinioController {

	private final UploadServiceMinoService uploadService;

    @Value("${upload.default-chunk-size}")
    public Integer defaultChunkSize;

    @PostMapping(PathUtils.FILE_UPLOAD_MINIO)
    public ResponseEntity<String> saveObject(@RequestParam("file") MultipartFile file) {
        String key = uploadService.save(file);
        return ResponseEntity.ok(key);
    }

    @GetMapping(PathUtils.FILE_GET_MINIO)
    public ResponseEntity<byte[]> fetchObject(
        @PathVariable UUID uuid) {

    	UploadServiceMinoService.ContentWithMetadata contentWithMetadata = uploadService.fetchFile(uuid);
        return ResponseEntity.status(HttpStatus.OK)
            .header(CONTENT_TYPE, contentWithMetadata.metadata().getHttpContentType())
            .header(CONTENT_LENGTH, String.valueOf(contentWithMetadata.metadata().getSize()))
            .body(contentWithMetadata.chunk());
    }
    
    @GetMapping("/metadata")
    public ResponseEntity<List<FileMetadataEntity>> fetchMetadata() {

        List<FileMetadataEntity> metadata = uploadService.getFileMetadata();
        return ResponseEntity.status(HttpStatus.OK)
            .body(metadata);
    }
	
}
