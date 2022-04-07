package com.luxoft.microservice.repo;

import org.springframework.data.repository.CrudRepository;

import com.luxoft.microservice.model.Employee;

public interface LuxoftRepository extends CrudRepository<Employee, Integer> {

}
