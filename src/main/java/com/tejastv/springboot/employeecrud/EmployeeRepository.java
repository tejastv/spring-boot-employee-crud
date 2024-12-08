package com.tejastv.springboot.employeecrud;

import com.tejastv.springboot.employeecrud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
