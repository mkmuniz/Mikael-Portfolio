package com.io.github.com.mkmuniz.portfolio.projects.controller;

import com.io.github.com.mkmuniz.portfolio.projects.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = {
    "http://localhost:3000",
    "https://www.mkmuniz.dev"
})
public class ImageController {

    @Autowired
    private ImageService imageService;

    @PostMapping("/images/upload/{projectId}")
    public ResponseEntity<List<String>> uploadImages(
            @PathVariable String projectId,
            @RequestParam("files") MultipartFile[] files) {

        try {
            List<String> imageUrls = imageService.uploadImages(projectId, Arrays.asList(files));
            return ResponseEntity.ok(imageUrls);
        } catch (IOException e) {
            return ResponseEntity.internalServerError().build();
        }
    }
} 