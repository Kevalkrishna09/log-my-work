package com.example.logMyWork.ServicesImplementation;

import com.example.logMyWork.Entities.Task;
import com.example.logMyWork.Repositories.TaskRepo;
import com.example.logMyWork.Services.TaskService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepo taskRepo;

    public TaskServiceImpl(TaskRepo taskRepo) {
        this.taskRepo = taskRepo;
    }

    @Override
    public Task saveTask(Task task) {
        return taskRepo.save(task);
    }

    @Override
    public Optional<Task> updateTask(Task task) {
        if (task.getTaskId() != null && taskRepo.existsById(task.getTaskId())) {
            return Optional.of(taskRepo.save(task));
        }
        return Optional.empty();
    }

    @Override
    public void deleteTask(Integer taskId) {
        taskRepo.deleteById(taskId);
    }

    @Override
    public List<Task> getAllTasks() {
        return taskRepo.findAll();
    }

    @Override
    public Optional<Task> getTaskById(Integer taskId) {
        return taskRepo.findById(taskId);
    }

    @Override
    public List<Task> getTasksByStatus(String status) {
        return taskRepo.findByStatus(status);
    }

    @Override
    public List<Task> getTasksByProjectId(Integer projectId) {
        return taskRepo.findByProjectProjectId(projectId);
    }

    @Override
    public List<Task> getTasksByEmployeeId(Integer employeeId) {
        return taskRepo.findByEmployeeEmpId(employeeId);
    }
}