package org.example.myapp.services;

import org.apache.tapestry5.annotations.Service;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.example.myapp.entities.Employee;
import org.example.myapp.pages.EmployeeList;

import java.util.List;

public class LoginServiceImpl implements LoginService{

    @Inject
    private EmployeeService employeeService;

    @Override
    public boolean isValidLogin(String enteredUsername, String enteredPassword) {
        System.out.println("getting : "+enteredUsername+" "+enteredPassword);
        List<Employee> employees = employeeService.getAllEmployees();

        // Check if entered credentials match any employee in the list
        return employees.stream()
                .anyMatch(employee -> employee.getUsername().equals(enteredUsername)
                        && employee.getPassword().equals(enteredPassword));

    }
}
