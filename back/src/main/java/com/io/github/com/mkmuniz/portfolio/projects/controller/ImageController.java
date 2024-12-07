package com.io.github.com.mkmuniz.portfolio.projects.controller;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class ImageController {

    @Autowired
    private Cloudinary cloudinary;

    @PostMapping("/images/upload/{projectId}")
    public ResponseEntity<List<String>> uploadImages(
            @PathVariable String projectId,
            @RequestParam("files") MultipartFile[] files) {
        
        List<String> imageUrls = new ArrayList<>();
        
        try {
            for (MultipartFile file : files) {
                Map uploadResult = cloudinary.uploader().upload(file.getBytes(), ObjectUtils.emptyMap());
                String imageUrl = (String) uploadResult.get("url");
                imageUrls.add(imageUrl);
            }
            
            return ResponseEntity.ok(imageUrls);
        } catch (IOException e) {
            return ResponseEntity.internalServerError().build();
        }
    }
} 