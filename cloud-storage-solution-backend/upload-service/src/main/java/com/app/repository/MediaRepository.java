package com.app.repository;

import java.util.Optional;

import com.app.entity.MediaItem;

public interface MediaRepository extends BaseRepository<MediaItem>{
	
	Optional<MediaItem> findByTitle(String title);

}
