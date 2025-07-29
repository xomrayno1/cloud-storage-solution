package com.app.config;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.data.auditing.AuditingHandler;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.app.entity.BaseEntity;

import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

public class CustomAuditingEntityListener extends AuditingEntityListener{
	
	public CustomAuditingEntityListener(ObjectFactory<AuditingHandler> handler) {
		super.setAuditingHandler(handler);
	}
	
	@Override
	@PrePersist
	public void touchForCreate(Object target) {
		BaseEntity entity = (BaseEntity) target;
		if(entity.getCreatedBy() == null) {
			super.touchForCreate(target);
		}
	}

	@Override
	@PreUpdate
	public void touchForUpdate(Object target) {
		BaseEntity entity = (BaseEntity) target;
		if(entity.getUpdatedBy() == null) {
			super.touchForUpdate(target);
		}
	}
	
}
