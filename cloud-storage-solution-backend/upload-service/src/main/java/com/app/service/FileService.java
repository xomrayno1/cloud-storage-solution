package com.app.service;

import org.springframework.web.multipart.MultipartFile;

import com.app.model.response.FileData;
import com.app.model.response.FileResponse;

public interface FileService {
	
	FileResponse upload(MultipartFile file);
	
	FileData download(String fileName);
	

}
