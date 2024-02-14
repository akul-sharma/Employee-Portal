package org.example.myapp.pages;

import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.example.myapp.entities.Employee;
import org.example.myapp.services.EmployeeService;

public class EmployeeDetails {

    @Property
    private Employee employee;

    @Inject
    private EmployeeService employeeService;

    void onActivate(int empId){
        System.out.println("onActive working");
        employee=employeeService.getEmployeeById(empId);
    }


}
