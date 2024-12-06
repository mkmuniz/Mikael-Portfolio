package com.io.github.com.mkmuniz.portfolio.projects.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.util.List;

@Document(collection = "projects")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Project {
    @Id
    private String id;
    private String slug;
    private String title;
    private String excerpt;
    private String description;
    private String githubUrl;
    private String liveUrl;
    private String[] technologies;
    private List<String> images;
} 