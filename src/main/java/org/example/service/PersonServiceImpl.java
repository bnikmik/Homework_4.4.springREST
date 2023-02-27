package org.example.service;

import org.example.dao.EmployeeDao;
import org.example.model.Employee;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService{
    private EmployeeDao employeeDao;

    public PersonServiceImpl(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    @Transactional
    public void add(Employee employee) {
        employeeDao.add(employee);
    }

    @Override
    @Transactional
    public Employee getEmployeeById(int id) {
        return employeeDao.getEmployeeById(id);
    }

    @Override
    @Transactional
    public List<Employee> getEmployees() {
        return employeeDao.getEmployees();
    }

    @Override
    @Transactional
    public void updateEmployee(Employee employee) {
        employeeDao.updateEmployee(employee);
    }

    @Override
    @Transactional
    public void deleteEmployeeById(int id) {
        employeeDao.deleteEmployeeById(id);
    }
}
