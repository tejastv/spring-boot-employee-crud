package com.tejastv.springboot.employeecrud.dao;

import com.tejastv.springboot.employeecrud.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
    Employee findById(int empId);
    Employee save(Employee employee);
    void deleteById(int empId);
}
