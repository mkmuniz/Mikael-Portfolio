package com.io.github.com.mkmuniz.portfolio.projects.service;

import com.io.github.com.mkmuniz.portfolio.projects.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class ImageService {

    @Autowired
    private ImageRepository imageRepository;

    public List<String> uploadImages(String projectId, List<MultipartFile> files) throws IOException {
        return imageRepository.uploadImages(files);
    }
} 