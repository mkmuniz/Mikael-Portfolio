package com.io.github.com.mkmuniz.portfolio.projects.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.nio.file.Path;
import java.nio.file.Paths;

@Configuration
public class FileStorageConfig implements WebMvcConfigurer {
    private final Path uploadDir = Paths.get("uploads").toAbsolutePath().normalize();

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/uploads/**")
                .addResourceLocations("file:" + uploadDir.toString() + "/");
    }

    public String getUploadDir() {
        return uploadDir.toString();
    }
} 