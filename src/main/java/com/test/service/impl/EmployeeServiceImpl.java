package com.test.service.impl;

import com.test.entity.Employee;
import com.test.repository.EmployeeRepository;
import com.test.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.awt.image.BandCombineOp;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee addEmployee(Employee employee) {
        Employee savedEmployee = employeeRepository.saveAndFlush(employee);

        return savedEmployee;
    }

    @Override
    public void delete(long id) {
        employeeRepository.delete(id);
    }

    @Override
    public Employee getByName(String name) {
        return employeeRepository.findByName(name);
    }

    @Override
    public Employee editEmployee(Employee employee) {
        return employeeRepository.saveAndFlush(employee);
    }

    @Override
    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }
}
