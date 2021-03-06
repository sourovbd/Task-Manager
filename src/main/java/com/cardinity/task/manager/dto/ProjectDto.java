package com.cardinity.task.manager.dto;

import com.cardinity.task.manager.entity.Project;
import lombok.Data;

import java.io.Serializable;

@Data
public class ProjectDto implements Serializable {

    public static final long serialVersionUID = 1L;

    private String projectId;
    private String name;

    public Project to(ProjectDto projectDto) {

        Project project = new Project();
        project.setProjectId(Long.parseLong(projectDto.getProjectId()));
        project.setName(projectDto.getName());

        return project;
    }

    public ProjectDto from(Project project) {

        ProjectDto projectDto = new ProjectDto();
        projectDto.setProjectId(String.valueOf(project.getProjectId()));
        projectDto.setName(project.getName());

        return projectDto;
    }

    public Project update(Project project, ProjectDto projectDto) {

        project.setProjectId(Long.parseLong(projectDto.getProjectId()));
        project.setName(projectDto.getName());

        return project;
    }
}
