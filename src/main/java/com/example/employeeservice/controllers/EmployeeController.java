package com.example.employeeservice.controllers;

import com.example.employeeservice.models.Employee;
import com.example.employeeservice.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;


    @GetMapping
    public List<Employee> getAll() {

        return employeeService.findAll();
    }

    @GetMapping("/{idEmployee}")
    public Employee getById(@PathVariable String idEmployee ) {

        return employeeService.findById(idEmployee) ;
    }

    @PostMapping
    public List<Employee> insert( @RequestBody Employee employee ) {
      return employeeService.findAll();

    }



}
