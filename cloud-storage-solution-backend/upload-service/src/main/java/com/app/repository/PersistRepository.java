package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface PersistRepository<T> extends CrudRepository<T, Long>, JpaRepository<T, Long> { 
 
}

