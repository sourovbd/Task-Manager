package com.cardinity.task.manager.service;

import com.cardinity.task.manager.entity.Project;
import com.cardinity.task.manager.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project saveProject(Project project) {
        return projectRepository.save(project);
    }

    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }
    public Project getProjectByName(String projectName) {
        return projectRepository.getByName(projectName);
    }

    public Project getProjectByProjectId(long projectId) {
        return projectRepository.getByProjectId(projectId);
    }

    public Project getProjectById(long id) {
        return projectRepository.getById(id);
    }
    public Project updateProject(Project project) {
        return projectRepository.save(project);
    }

    public void deleteProject(long projectId) {
        Project project = projectRepository.getByProjectId(projectId);
        projectRepository.delete(project);
    }
}
