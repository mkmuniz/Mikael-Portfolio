package com.io.github.com.mkmuniz.portfolio;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiProjectsApplication {
    public static void main(String[] args) {
        Dotenv dotenv = Dotenv.configure().load();

        System.setProperty("CLOUDINARY_CLOUD_NAME", dotenv.get("CLOUDINARY_CLOUD_NAME"));
        System.setProperty("CLOUDINARY_API_KEY", dotenv.get("CLOUDINARY_API_KEY"));
        System.setProperty("CLOUDINARY_API_SECRET", dotenv.get("CLOUDINARY_API_SECRET"));
        System.setProperty("MONGODB_URI", dotenv.get("MONGODB_URI"));

        SpringApplication.run(ApiProjectsApplication.class, args);
    }
} 