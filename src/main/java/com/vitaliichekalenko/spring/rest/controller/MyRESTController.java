package com.vitaliichekalenko.spring.rest.controller;

import com.vitaliichekalenko.spring.rest.entity.Employee;
import com.vitaliichekalenko.spring.rest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.PathVariable;
=======
>>>>>>> origin/main
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRESTController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> showAllEmployees(){
        List<Employee> allEmployees = employeeService.getAllEmployees();

        return allEmployees;
    }
<<<<<<< HEAD

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable int id){

        Employee employee = employeeService.getEmployee(id);

        return employee;

    }
=======
>>>>>>> origin/main
}
