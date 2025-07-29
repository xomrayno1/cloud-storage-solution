package com.app.model.enums;

import java.util.Objects;

import com.app.utils.ObjectUtils;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
//Them E extends Enum<E> fix loi
//Parameter 0 of constructor in com.app.utils.EnumConverter required a bean of type 'java.lang.Class' that could not be found.
public class EnumConverter<E extends Enum<E>, T> implements AttributeConverter<E, T> {

	private final Class<E> clazz;
	
	private static final String fieldName = "value";

	public EnumConverter(Class<E> clazz) {
		this.clazz = clazz;
	}

	@Override
	public T convertToDatabaseColumn(E enumType) {
		return (T) ObjectUtils.getter(enumType, fieldName);
	}

	@Override
	public E convertToEntityAttribute(T dbData) {
		E[] enums = clazz.getEnumConstants();

		for (E e : enums) {
			Object object = ObjectUtils.getter(e, fieldName);
			if (Objects.equals(object, dbData)) {
				return e;
			}
		}

		throw new UnsupportedOperationException();
	}

}