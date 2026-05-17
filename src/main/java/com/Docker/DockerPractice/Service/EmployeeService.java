package com.Docker.DockerPractice.Service;

import com.Docker.DockerPractice.Entity.Employee;


import java.util.List;

public interface EmployeeService {

    Employee saveEmployee(Employee employee);

    List<Employee> getAllEmployees();
}
