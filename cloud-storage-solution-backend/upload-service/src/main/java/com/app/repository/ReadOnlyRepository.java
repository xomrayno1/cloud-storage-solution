package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

@NoRepositoryBean
public interface ReadOnlyRepository<T> extends PagingAndSortingRepository<T, Long>, JpaSpecificationExecutor<T>, JpaRepository<T, Long> {
 
}
