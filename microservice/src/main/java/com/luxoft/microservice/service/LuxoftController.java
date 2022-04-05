package com.luxoft.microservice.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LuxoftController {

	@GetMapping("/limits")
	public String retriveLimitsFromConfigurations() {
		return "Test";
	}

}
