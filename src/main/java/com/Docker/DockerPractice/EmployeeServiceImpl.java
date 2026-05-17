package com.Docker.DockerPractice;

import com.Docker.DockerPractice.Entity.Employee;
import com.Docker.DockerPractice.Repository.EmployeeRepository;
import com.Docker.DockerPractice.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl
        implements EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    @Override
    public Employee saveEmployee(Employee employee) {

        // business logic

        if(employee.getDepartment() == null) {

            throw new RuntimeException(
                    "Department is required"
            );
        }

        return repository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {

        return repository.findAll();
    }
}
