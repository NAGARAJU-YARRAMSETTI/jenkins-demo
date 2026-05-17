package com.Docker.DockerPractice.Controller;

import com.Docker.DockerPractice.Entity.Employee;
import com.Docker.DockerPractice.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository repository;

    @PostMapping("/post")
    public Employee saveEmployee(
            @RequestBody Employee employee) {

        return repository.save(employee);
    }

    @GetMapping("/get")
    public List<Employee> getAllEmployees() {

        return repository.findAll();
    }
}
