package proskyemployee25.service;

import proskyemployee25.model.Employee;

import java.util.Collection;

public interface EmployeeService {
    Employee addsEmployee(String firstName, String surName);

    Employee removeEmployee(String firstName, String surName);

    Employee findEmployee(String firstName, String lastName);

    Collection<Employee> findAll();
}