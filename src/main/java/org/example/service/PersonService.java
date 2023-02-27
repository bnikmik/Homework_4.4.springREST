package org.example.service;

import org.example.model.Employee;

import java.util.List;

public interface PersonService {
    void add(Employee employee);

    Employee getEmployeeById(int id);

    List<Employee> getEmployees();

    void updateEmployee(Employee employee);

    void deleteEmployeeById(int id);
}
