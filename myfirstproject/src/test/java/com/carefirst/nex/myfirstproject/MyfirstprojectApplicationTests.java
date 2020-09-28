package com.carefirst.nex.myfirstproject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.carefirst.nex.myfirstproject.service.EmployeeService;

@SpringBootTest
class MyfirstprojectApplicationTests {
	@Autowired
	EmployeeService emi;
	

	@Test
	void contextLoads() {
		assertEquals(Arrays.asList("Bhavesh", 20000, 23), emi.getEmployees());
	}

}
