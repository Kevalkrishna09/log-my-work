
package com.example.logMyWork.ServicesImplementation;

import com.example.logMyWork.Entities.Employee;
import com.example.logMyWork.Repositories.EmployeRepo;
import com.example.logMyWork.Services.EmployeeService;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeRepo employeRepo;

    public EmployeeServiceImpl(EmployeRepo employeRepo) {
        this.employeRepo = employeRepo;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeRepo.save(employee);
    }

    @Override
    public Optional<Employee> updateEmployee(Employee employee) {
        if (employeRepo.existsById(employee.getEmpId())) {
            return Optional.of(employeRepo.save(employee));
        }
        return Optional.empty();
    }

    @Override
    public void deleteEmployee(String email) {
        Optional<Employee> employee = employeRepo.findByEmail(email);
        employee.ifPresent(employeRepo::delete);
    }

    @Override
    public void deleteEmployee(Employee employee) {
        employeRepo.delete(employee);
    }

    @Override
    public boolean employeeExist(String email) {
        return employeRepo.findByEmail(email).isPresent();
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeRepo.findAll();
    }

    @Override
    public Optional<Employee> getEmployeeById(int id) {
        return employeRepo.findById(id);
    }
}