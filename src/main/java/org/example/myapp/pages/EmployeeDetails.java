package org.example.myapp.pages;

import org.apache.tapestry5.annotations.Property;
import org.example.myapp.entities.Employee;

public class EmployeeDetails {

    @Property
    private Employee employee;

    void onActive(int empId){
        System.out.println("onActive working");
        EmployeeList employeeList=new EmployeeList();
        employee=employeeList.getEmployeeById(empId);
    }

}
