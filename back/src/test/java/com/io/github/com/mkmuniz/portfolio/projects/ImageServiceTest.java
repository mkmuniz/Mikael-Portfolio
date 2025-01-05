package com.io.github.com.mkmuniz.portfolio.projects;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.web.multipart.MultipartFile;

import io.github.cdimascio.dotenv.Dotenv;

import com.io.github.com.mkmuniz.portfolio.projects.repository.ImageRepository;
import com.io.github.com.mkmuniz.portfolio.projects.service.ImageService;

class ImageServiceTest {

    @Mock
    private ImageRepository imageRepository;

    @Mock
    private MultipartFile mockFile;

    @InjectMocks
    private ImageService imageService;

    @BeforeAll
       static void loadEnv() {
        if (Files.exists(Paths.get(".env"))) {
            Dotenv dotenv = Dotenv.configure().load();

            System.setProperty("CLOUDINARY_CLOUD_NAME", dotenv.get("CLOUDINARY_CLOUD_NAME"));
            System.setProperty("CLOUDINARY_API_KEY", dotenv.get("CLOUDINARY_API_KEY"));
            System.setProperty("CLOUDINARY_API_SECRET", dotenv.get("CLOUDINARY_API_SECRET"));
            System.setProperty("MONGODB_URI", dotenv.get("MONGODB_URI"));
        }
    }

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testUploadImage() throws Exception {
        String projectId = "1";
        List<MultipartFile> files = Arrays.asList(mockFile);
        List<String> expectedUrls = Arrays.asList("https://res.cloudinary.com/demo/image/biblioteca/dashboard.jpg");

        when(imageRepository.uploadImages(files)).thenReturn(expectedUrls);

        List<String> result = imageService.uploadImages(projectId, files);
        assertEquals(expectedUrls, result);
    }
}
