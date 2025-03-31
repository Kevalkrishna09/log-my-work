package com.example.logMyWork.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.logMyWork.Entities.Task;

import java.util.List;

public interface TaskRepo extends JpaRepository<Task, Integer> {
    List<Task> findByStatus(String status);

    List<Task> findByProjectProjectId(Integer projectId);

    List<Task> findByEmployeeEmpId(Integer employeeId);
}