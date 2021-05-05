package com.example.mongodb.service;

import com.example.mongodb.model.Employee;
import com.example.mongodb.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee updateEmployee(String id, Employee employee) {
        Optional<Employee> employeeData = employeeRepository.findById(id);
        Employee updateEmployee = employeeData.get();
        updateEmployee.setName(employee.getName());
        updateEmployee.setEmail(employee.getEmail());
        updateEmployee.setSalary(employee.getSalary());
        return employeeRepository.save(updateEmployee);
    }

    @Override
    public void deleteEmployee(String id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public void deleteAllEmployee() {
        employeeRepository.deleteAll();
    }

    @Override
    public Optional<Employee> getEmployee(String id) {
        return employeeRepository.findById(id);
    }

    @Override
    public List<Employee> listEmployees() {
        return employeeRepository.findAll();
    }
}
