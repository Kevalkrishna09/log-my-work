package com.example.logMyWork.ServicesImplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.logMyWork.Entities.Employee;
import com.example.logMyWork.Repositories.EmployeeRepo;
import com.example.logMyWork.Services.EmployeeService;

public class employeeImplementation implements EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public Optional<Employee> updateEmployee(Employee employee) {
        throw new UnsupportedOperationException("Unimplemented method 'updateEmployee'");
    }

    @Override
    public void deleteEmployee(String email) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteEmployee'");
    }

    @Override
    public void deleteEmployee(Employee employee) {
        employeeRepo.delete(employee);
    }

    @Override
    public boolean employeeExist(String email) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'employeeExist'");
    }

    @Override
    public List<Employee> getAllEmployees() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllEmployees'");
    }

}
