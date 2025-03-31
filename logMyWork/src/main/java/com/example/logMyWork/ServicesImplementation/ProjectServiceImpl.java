
package com.example.logMyWork.ServicesImplementation;

import com.example.logMyWork.Entities.Project;
import com.example.logMyWork.Repositories.ProjectRepo;
import com.example.logMyWork.Services.ProjectService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepo projectRepo;

    public ProjectServiceImpl(ProjectRepo projectRepo) {
        this.projectRepo = projectRepo;
    }

    @Override
    public Project saveProject(Project project) {
        return projectRepo.save(project);
    }

    @Override
    public Optional<Project> updateProject(Project project) {
        if (project.getProjectId() != null && projectRepo.existsById(project.getProjectId())) {
            return Optional.of(projectRepo.save(project));
        }
        return Optional.empty();
    }

    @Override
    public void deleteProject(Integer projectId) {
        projectRepo.deleteById(projectId);
    }

    @Override
    public List<Project> getAllProjects() {
        return projectRepo.findAll();
    }

    @Override
    public Optional<Project> getProjectById(Integer projectId) {
        return projectRepo.findById(projectId);
    }

    @Override
    public List<Project> getProjectsByManagerId(Integer managerId) {
        return projectRepo.findByManagerEmpId(managerId);
    }
}
