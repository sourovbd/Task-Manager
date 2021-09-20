package com.cardinity.task.manager.controller;

import com.cardinity.task.manager.dto.ProjectDto;
import com.cardinity.task.manager.entity.Project;
import com.cardinity.task.manager.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @PostMapping("/save")
    public Project save(@RequestBody ProjectDto projectDto) {
        return projectService.saveProject(projectDto.to(projectDto));
    }

    @GetMapping("/getAll")
    public List<ProjectDto> getAllProjects() {
        ProjectDto projectDto = new ProjectDto();
        List<ProjectDto> dtos = new ArrayList<>();
        List<Project> projects = projectService.getAllProjects();
        for(Project project : projects) {
            dtos.add(projectDto.from(project));
        }
        return dtos;
    }

    @GetMapping("/get-one/{projectId}")
    public ProjectDto getSingleProject(@PathVariable("projectId") long projectId) {
        ProjectDto projectDto = new ProjectDto();
        projectDto.from(projectService.getProjectByProjectId(projectId));
        return projectDto;
    }

    @GetMapping("/get-one/{projectName}")
    public ProjectDto getSingleProject(@PathVariable("projectName") String projectName) {
        ProjectDto projectDto = new ProjectDto();
        projectDto.from(projectService.getProjectByName(projectName));
        return projectDto;
    }

    @PutMapping("/update")
    public Project updateProject(@RequestBody ProjectDto projectDto) {
        Project project = projectService.getProjectByProjectId(Long.parseLong(projectDto.getProjectId()));
        return projectService.updateProject(projectDto.update(project, projectDto));
    }

    @DeleteMapping("/delete/{projectId}")
    public void deleteProject(@PathVariable("projectId") long projectId) {
        projectService.deleteProject(projectId);
    }
}
