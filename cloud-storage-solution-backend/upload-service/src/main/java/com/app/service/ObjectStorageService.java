package com.app.service;

import java.io.InputStream;
import java.util.UUID;

import org.springframework.web.multipart.MultipartFile;

public interface ObjectStorageService {

	String save(MultipartFile file, UUID uuid) throws Exception;
	
	InputStream getInputStream(UUID uuid, long offset, long length) throws Exception;
	
}
