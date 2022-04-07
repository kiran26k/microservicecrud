package com.luxoft.microservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luxoft.microservice.model.Employee;
import com.luxoft.microservice.service.LuxoftService;

@RestController
public class LuxoftController {

	@Autowired
	LuxoftService luxoftService;

	@GetMapping("/emp")
	private List<Employee> getAllEmp() {
		return luxoftService.getAllEmp();
	}

	@PostMapping("/save")
	public Employee saveEmp(Employee employee) {
		return luxoftService.saveEmp(employee);
	}

}
