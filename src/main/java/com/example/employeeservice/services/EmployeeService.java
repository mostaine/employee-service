package com.example.employeeservice.services;

import com.example.employeeservice.models.Employee;
import com.example.employeeservice.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

@Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> findAll() {
        return employeeRepository.findAll();

    }

    public Employee findById(String idEmployee) {
        return employeeRepository.findById(idEmployee).get();

    }

    public Employee insert(Employee e) {
        return employeeRepository.save(e);
    }


}
