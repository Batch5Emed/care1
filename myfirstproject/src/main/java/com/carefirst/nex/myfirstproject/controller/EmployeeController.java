package com.carefirst.nex.myfirstproject.controller;
import com.carefirst.nex.myfirstproject.Employees;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carefirst.nex.myfirstproject.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService empservice;
	
	@RequestMapping("/myservice/employee")
    public List<Employees> getEmpList(){
    List<Employees> empController = empservice.getEmployees();
    Collections.sort(empController);
        return empController;
    }
	
    }

