package com.example.mongodb.service;

import com.example.mongodb.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    Employee createEmployee(Employee employee);
    Employee updateEmployee(String id, Employee employee);
    void deleteEmployee(String id);
    void deleteAllEmployee();
    Optional<Employee> getEmployee(String id);
    List<Employee> listEmployees();
}
