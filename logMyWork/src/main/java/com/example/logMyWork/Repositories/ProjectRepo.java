package com.example.logMyWork.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.logMyWork.Entities.Project;

public interface ProjectRepo extends JpaRepository<Project, Integer> {

}