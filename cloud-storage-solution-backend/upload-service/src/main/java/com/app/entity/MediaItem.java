package com.app.entity;

import com.app.model.enums.MediaType;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "media")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MediaItem extends BaseEntity {
	 
	private String title;
	@Enumerated(EnumType.STRING)
	private MediaType type;
	private String url;
	private String contentType;
	private Long objectId;
	private String path;
	private String thumbnailPath;
	private String thumbnailUrl;

}
