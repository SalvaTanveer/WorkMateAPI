package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.kodemp;
import com.example.demo.services.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	@Autowired
	EmployeeService service;
	
	@GetMapping("/emp/byid/{id}")
	public kodemp findEmpById(@PathVariable("id")int id) {
		return service.readEmployeeById(id);
	}
	
	@GetMapping("/emp/all")
	public List<kodemp> findAllEmp(){
		return service.readAllEmployees();
	}
	
	@PostMapping("/emp/onboard")
	public  kodemp onboardEmp(@RequestBody kodemp kod) {
		return service.onboardEmployee(kod);
	}
	
	@DeleteMapping("/emp/remove/{id}")
	public String deleteEmpById(@PathVariable("id") int id) {
		return service.deleteEmployeeById(id);
	}
	
	@PutMapping("/emp/update")
	public kodemp updateEmpById(@RequestBody kodemp emp) {
		return service.updateEmployee(emp);
	}
	
}
