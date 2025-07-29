package com.app.service.impl;

import java.io.IOException;

import org.apache.tomcat.jni.FileInfo;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.account.repository.FileRepository;
import com.app.entity.MediaItem;
import com.app.model.enums.MediaType;
import com.app.model.response.FileData;
import com.app.model.response.FileResponse;
import com.app.repository.MediaRepository;
import com.app.service.FileService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class FileServiceImpl implements FileService{
	
	private final MediaRepository mediaRepository;
	
	private final FileRepository fileRepository;

	@Override
	public FileResponse upload(MultipartFile file){
		// Store file
        FileInfo fileInfo;
		try {
			fileInfo = fileRepository.store(file);
	        // Create file management info
	        MediaItem media = MediaItem.builder()
	        		.contentType(fileInfo.getContentType())
	        		.objectId(null)
	        		.objectType(null)
	        		.type(MediaType.IMAGE)
	        		.url(fileInfo.getUrl())
	        		.title(fileInfo.getName())
	        		.path(fileInfo.getPath())
	        		.build();

	        media = mediaRepository.save(media);
	        return FileResponse.builder()
	                .originalFileName(file.getOriginalFilename())
	                .url(fileInfo.getUrl())
	                .build();
		} catch (IOException e) {
			log.error("Error storing file", e);
		}
        return null;
	}

	@Override
	public FileData download(String fileName) {
		MediaItem media = mediaRepository.findByTitle(fileName)
				.orElseThrow(() -> new RuntimeException("File not found"));
		
		try {
			var fileData = fileRepository.read(media);
			return FileData.builder()
					.contentType(media.getContentType())
					.fileName(media.getTitle())
					.resource(fileData)
					.build();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
