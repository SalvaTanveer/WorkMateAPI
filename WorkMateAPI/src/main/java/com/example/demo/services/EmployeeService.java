package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.kodemp;
import com.example.demo.repositories.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository repository;
	
	public kodemp readEmployeeById(int id) {
		return repository.findById(id).orElse(null);
	}
	
	public List<kodemp> readAllEmployees(){
		return repository.findAll();
	}
	
	public kodemp onboardEmployee(kodemp employee) {
		return repository.save(employee);
	}
	
	public String deleteEmployeeById(int id) {
		repository.deleteById(id);
		return "Delete Successfull";
	}
	
	public kodemp updateEmployee(kodemp kod) {
		return repository.save(kod);
	}

	
}
