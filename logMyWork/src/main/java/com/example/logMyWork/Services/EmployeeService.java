package com.example.logMyWork.Services;

import java.util.List;
import java.util.Optional;

import com.example.logMyWork.Entities.Employee;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
  
    Optional<Employee> updateEmployee(Employee employee);

    void deleteEmployee(String email);

    void deleteEmployee(Employee employee);

    boolean employeeExist(String email);

    List<Employee> getAllEmployees();

    Optional<Employee> getEmployeeById(int id);
}