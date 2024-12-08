package com.tejastv.springboot.employeecrud.rest;

import com.tejastv.springboot.employeecrud.entity.Employee;
import com.tejastv.springboot.employeecrud.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;

    public EmployeeRestController(EmployeeService employeeDService){
        employeeService = employeeDService;
    }

    @GetMapping("/employee")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

    @GetMapping("/employee/{empId}")
    public Optional<Employee> getEmployee(@PathVariable int empId) {
        if (employeeService.findById(empId) == null) {
            throw new RuntimeException("Employee id not found");
        }
        return employeeService.findById(empId);
    }

    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody Employee emp) {
        emp.setId(0);
        return employeeService.save(emp);
    }

    @PutMapping("/employee")
    public Employee updateEmployee(@RequestBody Employee emp) {
        return employeeService.save(emp);
    }

    @DeleteMapping("/employee/{empId}")
    public String deleteEmployee(@PathVariable int empId) {
        if (employeeService.findById(empId) == null) {
            throw new RuntimeException("Employee id not found");
        }
        employeeService.deleteById(empId);
        return "Deleted employee" + empId;
    }

}
