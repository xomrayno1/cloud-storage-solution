package com.app.utils;

import java.util.Locale;
import java.util.Objects;

public class StringUtils {
	public static final String EMPTY_STRING = "";

	private StringUtils() {
		throw new IllegalArgumentException("StringUtils is uitl class");
	}

	public static boolean isNullOrEmpty(String value) {
		return value == null || value.trim().isEmpty() || EMPTY_STRING.equals(value.trim());
	}

	/**
	 * In hoa ký tự đầu tiên
	 * **/
	public static String capitalize(String value) {
		if (!isNullOrEmpty(value) && value.length() > 1) {
			if (value.length() > 1) {
				return value.substring(0, 1).toUpperCase(Locale.ENGLISH).concat(value.substring(1));
			}
			return value.substring(0, 1).toUpperCase(Locale.ENGLISH);
		}
		return null;
	}

	public static String wrapTextSearchFullLike(String text) {
		return isNullOrEmpty(text) ? null : "%" + text.trim().toUpperCase() + "%";
	}
	
	public static String ifValueEqualThen(String src, String equal, String desc) {
		return Objects.equals(src, equal) ? desc : src;
	}
	
}
