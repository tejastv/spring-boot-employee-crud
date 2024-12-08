package com.tejastv.springboot.employeecrud.service;

import com.tejastv.springboot.employeecrud.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> findAll();
    Optional<Employee> findById(int empId);
    Employee save(Employee employee);
    void deleteById(int empId);
}
