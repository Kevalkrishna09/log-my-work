package com.example.logMyWork.Services;

import com.example.logMyWork.Entities.Project;

import java.util.List;
import java.util.Optional;

public interface ProjectService {

    Project saveProject(Project project);

    Optional<Project> updateProject(Project project);

    void deleteProject(Integer projectId);

    List<Project> getAllProjects();

    Optional<Project> getProjectById(Integer projectId);

    List<Project> getProjectsByManagerId(Integer managerId);
}