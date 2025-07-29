package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.FileMetadataEntity;

public interface FileMetadataRepository extends JpaRepository<FileMetadataEntity, String> {
}
