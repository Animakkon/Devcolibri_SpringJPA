package com.test.service;

import com.test.entity.Employee;

import java.util.List;

public interface EmployeeService {
    Employee addEmployee(Employee employee);
    void delete(long id);
    Employee getByName(String name);
    Employee editEmployee(Employee employee);
    List<Employee> getAll();
}
