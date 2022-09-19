package com.codeclan.employelab.employeeManagementLab.repositories;

import com.codeclan.employelab.employeeManagementLab.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
