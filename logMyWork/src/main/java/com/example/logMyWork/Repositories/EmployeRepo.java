package com.example.logMyWork.Repositories;
 
import org.springframework.data.jpa.repository.JpaRepository;
 
import com.example.logMyWork.Entities.Employee;

import java.util.Optional;
 
public interface EmployeRepo extends JpaRepository<Employee,Integer>{
    Optional<Employee> findByEmail(String email);

}