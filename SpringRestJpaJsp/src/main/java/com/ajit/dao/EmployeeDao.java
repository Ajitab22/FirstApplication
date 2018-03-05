package com.ajit.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ajit.model.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer>{

}
