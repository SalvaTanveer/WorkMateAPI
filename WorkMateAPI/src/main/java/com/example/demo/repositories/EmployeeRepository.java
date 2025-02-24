package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.kodemp;
@Repository
public interface EmployeeRepository extends JpaRepository<kodemp, Integer>{

}
