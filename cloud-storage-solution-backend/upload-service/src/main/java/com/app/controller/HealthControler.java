package com.app.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.service.HealthService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/v1/account/health")
@Slf4j
@RequiredArgsConstructor
public class HealthControler {

	private final HealthService healthService;

	@GetMapping
	public String health() {
		return "UP";
	}

}
