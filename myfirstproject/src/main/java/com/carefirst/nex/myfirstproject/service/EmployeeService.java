package com.carefirst.nex.myfirstproject.service;
import com.carefirst.nex.myfirstproject.Employees;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
		 	 public List<Employees> getEmployees() {
		        List<Employees> emp = new ArrayList<>();
		        Employees emp1 = new Employees("Bhavesh",20000,23);
		        Employees emp2 = new Employees("Abhi",240000,29);
		        Employees emp3 = new Employees("anurag",22101,31);
		        Employees emp4 = new Employees("zayn",300000,36);
		        Employees emp5 = new Employees("nayan",40000,24);
		        emp.add(emp1);
		        emp.add(emp2);
		        emp.add(emp3);
		        emp.add(emp4);
		        emp.add(emp5);

		        return emp;
		    }
		 	


}