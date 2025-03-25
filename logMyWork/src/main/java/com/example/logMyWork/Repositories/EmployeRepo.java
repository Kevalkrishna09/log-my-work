package com.example.logMyWork.Repositories;
 
import org.springframework.data.jpa.repository.JpaRepository;
 
import com.example.logMyWork.Entities.Employee;
 
public interface EmployeRepo extends JpaRepository<Employee,Integer>{
   
}