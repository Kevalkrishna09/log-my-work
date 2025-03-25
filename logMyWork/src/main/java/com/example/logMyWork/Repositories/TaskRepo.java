package com.example.logMyWork.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.logMyWork.Entities.Task;

public interface TaskRepo extends JpaRepository<Task, Integer> {

}