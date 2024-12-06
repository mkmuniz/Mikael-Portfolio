package com.io.github.com.mkmuniz.portfolio.projects.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.unit.DataSize;

import javax.servlet.MultipartConfigElement;

@Configuration
public class MultipartConfig {

    @Value("${MAX_FILE_SIZE:10485760}") // 10MB em bytes
    private long maxFileSize;

    @Value("${MAX_REQUEST_SIZE:10485760}") // 10MB em bytes
    private long maxRequestSize;

    @Bean
    public MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        factory.setMaxFileSize(DataSize.ofBytes(maxFileSize));
        factory.setMaxRequestSize(DataSize.ofBytes(maxRequestSize));
        return factory.createMultipartConfig();
    }
} 