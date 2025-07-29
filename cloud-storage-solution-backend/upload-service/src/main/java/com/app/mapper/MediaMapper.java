package com.app.mapper;

import org.apache.tomcat.jni.FileInfo;
import org.mapstruct.Mapper;

import com.app.entity.MediaItem;

@Mapper(componentModel = "spring")
public interface MediaMapper {
	
    MediaItem toMedia(FileInfo fileInfo);

}
