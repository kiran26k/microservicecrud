package com.luxoft.microservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;

import com.luxoft.microservice.model.Employee;
import com.luxoft.microservice.repo.LuxoftRepository;

@Service
public class LuxoftService {

	@Autowired
	LuxoftRepository luxoftRepository;

	public List<Employee> getAllEmp() {
		return (List<Employee>) luxoftRepository.findAll();
	}

	public Employee saveEmp(@Validated @RequestBody Employee employee) {
		return luxoftRepository.save(employee);
	}
}
