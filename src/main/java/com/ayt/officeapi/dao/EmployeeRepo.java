package com.ayt.officeapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ayt.officeapi.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
    
}
