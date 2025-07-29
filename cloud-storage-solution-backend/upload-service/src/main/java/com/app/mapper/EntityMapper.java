package com.app.mapper;

import java.util.List;

import org.mapstruct.BeanMapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Named;

public interface EntityMapper<E, D> {
	
	//@Mapping(target = "id", ignore = true) //DTO to entity ignore id
	//@Mapping(target = "uuid", expression = "java(UUID.randomUUID().toString())")
	E toEntity(D customerDTO);
	
	D toDTO(E customer);
	
	List<E> toEntities(List<D> customerDTOs);
	
	List<D> toDTOs(List<E> customers);
	
	
	/**
	 * mapping dto to entity
	 * **/
	@Named("partialUpdate")
	@BeanMapping(nullValuePropertyMappingStrategy = org.mapstruct.NullValuePropertyMappingStrategy.IGNORE) //check != null then update, if null then ignore
//	@Mapping(target = "uuid", ignore = true)//DTO to entity ignore uuid
//	@Mapping(target = "createdDate", ignore = true) //DTO to entity ignore createdDate
//	@Mapping(target = "lastModifiedDate", ignore = true) //DTO to entity ignore lastModifiedDate
	void partialUpdate(D dto, @MappingTarget  E entity);

}
