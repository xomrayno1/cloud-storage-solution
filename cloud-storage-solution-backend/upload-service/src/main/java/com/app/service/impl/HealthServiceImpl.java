package com.app.service.impl;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.app.service.HealthService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class HealthServiceImpl implements HealthService {

	@Override
	@Async//("threadPoolTaskExecutor")
	public void healthCheck() {
		log();
	}

	public void log() {
		log.info("health check log async");
	}
	
}
