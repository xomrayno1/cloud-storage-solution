package com.app.model.response;

import org.springframework.core.io.Resource;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FileData {
	private String fileName;
	private String contentType;
	private Resource resource;

}
