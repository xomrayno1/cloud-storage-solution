package com.app.service.impl;

import java.io.InputStream;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.app.config.MinioConfig;
import com.app.service.ObjectStorageService;

import io.minio.GetObjectArgs;
import io.minio.MinioClient;
import io.minio.ObjectWriteResponse;
import io.minio.PutObjectArgs;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@RequiredArgsConstructor
public class ObjectStorageServiceImpl implements ObjectStorageService{
	
    private final MinioClient minioClient;

    @Value("${minio.put-object-part-size}")
    private Long putObjectPartSize;
    
    @Value("${minio.url}")
    private String minioUrl;

	@Override
	public String save(MultipartFile file, UUID uuid) throws Exception {
		log.info("Saving file with UUID: {}, contentType: {}", uuid, file.getContentType());
		 
		String key = 2025 + "/"+ uuid.toString() +"_" + file.getOriginalFilename();
		
		ObjectWriteResponse objectWriterResponse = minioClient.putObject(
	                PutObjectArgs
	                .builder()
	                .bucket(MinioConfig.UPLOAD_BUCKET_NAME)
	                .object(key)
	                .contentType(file.getContentType())
	                .stream(file.getInputStream(), file.getSize(), putObjectPartSize)
	                .build());
		 
	    String fileUrl = minioUrl + "/" + MinioConfig.UPLOAD_BUCKET_NAME + "/" + key;

		return fileUrl;
	}

	@Override
	public InputStream getInputStream(UUID uuid, long offset, long length) throws Exception {
		log.info("Retrieving file with UUID: {} from offset: {} with length: {}", uuid, offset, length);
		return minioClient.getObject(
                GetObjectArgs
                        .builder()
                        .bucket(MinioConfig.UPLOAD_BUCKET_NAME)
                        .offset(offset)
                        .length(length)
                        .object(uuid.toString())
                        .build());
	}

}
