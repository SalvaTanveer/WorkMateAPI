package com.example.demo.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class kodemp {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	public kodemp() {
		// TODO Auto-generated constructor stub
	}
	public kodemp(String name, String email, int salary, String designation) {
		super();
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.designation = designation;
	}

	public kodemp(int id, String name, String email, int salary, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.designation = designation;
	}

	@Column
	String name;
	
	@Column
	String email;
	
	@Column
	int salary;
	
	@Column
	String designation;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
}
