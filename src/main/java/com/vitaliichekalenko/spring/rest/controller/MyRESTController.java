package com.vitaliichekalenko.spring.rest.controller;

import com.vitaliichekalenko.spring.rest.entity.Employee;
import com.vitaliichekalenko.spring.rest.exceptionhandling.EmployeeIncorrectData;
import com.vitaliichekalenko.spring.rest.exceptionhandling.NoSuchEmployeeException;
import com.vitaliichekalenko.spring.rest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRESTController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> showAllEmployees() {
        List<Employee> allEmployees = employeeService.getAllEmployees();

        return allEmployees;
    }


    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable int id) throws NoSuchFieldException {

        Employee employee = employeeService.getEmployee(id);

        if (employee == null) {
            throw new NoSuchFieldException("There is no employee with ID = " + id + " in DataBase");
        }
        return employee;

    }

    @PostMapping("/employees")
    public Employee addNewEmployee(@RequestBody Employee employee){

        employeeService.saveEmployee(employee);

        return employee;
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee){

        employeeService.saveEmployee(employee);
        return employee;
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable int id){

        employeeService.deleteEmployee(id);
        return "Employee with id = " + id + " was deleted";

    }

}
