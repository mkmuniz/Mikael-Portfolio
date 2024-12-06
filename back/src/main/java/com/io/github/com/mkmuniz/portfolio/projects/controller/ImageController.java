package com.io.github.com.mkmuniz.portfolio.projects.controller;

import com.io.github.com.mkmuniz.portfolio.projects.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/images")
@CrossOrigin(origins = "*")
public class ImageController {

    private final Path fileStorageLocation = Paths.get("uploads")
            .toAbsolutePath().normalize();

    @Autowired
    private ProjectService projectService;

    public ImageController() {
        try {
            Files.createDirectories(fileStorageLocation);
        } catch (IOException ex) {
            throw new RuntimeException("Não foi possível criar o diretório de upload", ex);
        }
    }

    @PostMapping("/upload/{projectId}")
    public ResponseEntity<List<String>> uploadImages(
            @PathVariable String projectId,
            @RequestParam("files") MultipartFile[] files) {
        
        List<String> fileNames = new ArrayList<>();
        
        try {
            for (MultipartFile file : files) {
                String fileName = UUID.randomUUID().toString() + "_" + file.getOriginalFilename();
                Path targetLocation = fileStorageLocation.resolve(fileName);
                Files.copy(file.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);
                fileNames.add(fileName);
            }

            // Atualiza o projeto com os caminhos das imagens
            projectService.updateProjectImages(projectId, fileNames);
            
            return ResponseEntity.ok(fileNames);
        } catch (IOException ex) {
            return ResponseEntity.internalServerError().build();
        }
    }

    @GetMapping("/{fileName:.+}")
    public ResponseEntity<Resource> getImage(@PathVariable String fileName) {
        try {
            Path filePath = fileStorageLocation.resolve(fileName).normalize();
            Resource resource = new UrlResource(filePath.toUri());
            
            if(resource.exists()) {
                return ResponseEntity.ok()
                        .contentType(MediaType.IMAGE_JPEG)
                        .body(resource);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (MalformedURLException ex) {
            return ResponseEntity.badRequest().build();
        }
    }
} 