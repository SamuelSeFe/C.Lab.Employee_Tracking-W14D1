package com.codeclan.employelab.employeeManagementLab;

import com.codeclan.employelab.employeeManagementLab.models.Employee;
import com.codeclan.employelab.employeeManagementLab.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeManagementLabApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
		employeeRepository.deleteAll();
	}

	@Test
	public void createEmployee(){
		Employee employee = new Employee("Keith", 35, 12345, "keith@codeclan.com");
		employeeRepository.save(employee);
	}

}
