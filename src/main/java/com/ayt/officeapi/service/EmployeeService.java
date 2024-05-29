package com.ayt.officeapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ayt.officeapi.dao.EmployeeRepo;
import com.ayt.officeapi.entity.Employee;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;

    public List<Employee> getAllEmployees() {
        List<Employee> employees = employeeRepo.findAll();
        System.out.println("Fetched employees: " + employees.size()); // Simple debug log
        return employees;
    }
}
