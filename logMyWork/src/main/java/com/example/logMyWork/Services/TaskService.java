package com.example.logMyWork.Services;

import com.example.logMyWork.Entities.Task;

import java.util.List;
import java.util.Optional;

public interface TaskService {

    Task saveTask(Task task);

    Optional<Task> updateTask(Task task);

    void deleteTask(Integer taskId);

    List<Task> getAllTasks();

    Optional<Task> getTaskById(Integer taskId);

    List<Task> getTasksByStatus(String status);

    List<Task> getTasksByProjectId(Integer projectId);

    List<Task> getTasksByEmployeeId(Integer employeeId);
}