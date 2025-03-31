package com.example.logMyWork.Repositories;

import com.example.logMyWork.Entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepo extends JpaRepository<Project, Integer> {

    List<Project> findByManagerEmpId(Integer managerId);
}