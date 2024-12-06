package com.io.github.com.mkmuniz.portfolio.projects.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.io.github.com.mkmuniz.portfolio.projects.repository")
public class MongoConfig {
    // A configuração será feita automaticamente pelo Spring usando a URI do application.properties
} 