package com.Docker.DockerPractice.Repository;

import com.Docker.DockerPractice.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository
        extends JpaRepository<Employee, Long> {
}
