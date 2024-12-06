package com.io.github.com.mkmuniz.portfolio.projects.service;

import com.io.github.com.mkmuniz.portfolio.projects.model.Project;
import com.io.github.com.mkmuniz.portfolio.projects.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    
    @Autowired
    private ProjectRepository projectRepository;

    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    public Project getProjectBySlug(String slug) {
        return projectRepository.findBySlug(slug);
    }

    public Project createProject(Project project) {
        return projectRepository.save(project);
    }

    public Project updateProject(String id, Project project) {
        project.setId(id);
        return projectRepository.save(project);
    }

    public void deleteProject(String id) {
        projectRepository.deleteById(id);
    }

    public void updateProjectImages(String projectId, List<String> imageUrls) {
        Project project = projectRepository.findById(projectId)
            .orElseThrow(() -> new RuntimeException("Projeto não encontrado com ID: " + projectId));
        
        project.setImages(imageUrls);
        projectRepository.save(project);
    }
} 