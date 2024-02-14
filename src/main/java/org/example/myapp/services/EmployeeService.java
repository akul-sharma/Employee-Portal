package org.example.myapp.services;

import org.example.myapp.entities.Employee;

import java.util.List;

public interface EmployeeService {
    Employee getEmployeeById(int empId);

    List<Employee> getAllEmployees();
}
