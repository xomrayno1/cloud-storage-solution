package com.app.model.enums;

import org.springframework.stereotype.Component;

import lombok.Getter;

@Getter
public enum Status {
	IN_ACTIVE(0), ACTIVE(1), DELETED(-1);

	private  int value;
	
	Status(int value) {
		this.value = value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}

	@Component
	public static class Converter extends EnumConverter<Status, Integer> {
		public Converter() {
			super(Status.class);
		}
	}
	
}