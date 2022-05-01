package com.example.employeeservice.controllers;

import com.example.employeeservice.models.Employee;
import com.example.employeeservice.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
@CrossOrigin(origins = "*", allowedHeaders = "*")
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
    public Employee insert( @RequestBody Employee employee ) {
      return employeeService.insert(employee);

    }

    @DeleteMapping("/{idEmployee}")
    public void deleteById(@PathVariable String idEmployee ) {

        employeeService.delete(idEmployee); ;
    }

    @PutMapping("/{idEmployee}")
    public void update(
            @PathVariable String idEmployee,
            @RequestBody Employee employee) {

            employeeService.update(idEmployee,employee);



        }

}
