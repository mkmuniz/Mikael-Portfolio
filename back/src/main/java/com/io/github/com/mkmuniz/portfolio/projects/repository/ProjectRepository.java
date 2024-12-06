package com.io.github.com.mkmuniz.portfolio.projects.repository;

import com.io.github.com.mkmuniz.portfolio.projects.model.Project;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProjectRepository extends MongoRepository<Project, String> {
    Project findBySlug(String slug);
} 