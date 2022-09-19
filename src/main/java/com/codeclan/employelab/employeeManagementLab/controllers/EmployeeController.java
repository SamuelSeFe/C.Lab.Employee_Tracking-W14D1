package com.codeclan.employelab.employeeManagementLab.controllers;

import com.codeclan.employelab.employeeManagementLab.models.Employee;
import com.codeclan.employelab.employeeManagementLab.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping(value = "/employeetracking")
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }
}
