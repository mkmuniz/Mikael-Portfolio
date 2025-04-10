package com.io.github.com.mkmuniz.portfolio.projects;

import com.io.github.com.mkmuniz.portfolio.projects.model.Project;
import com.io.github.com.mkmuniz.portfolio.projects.repository.ProjectRepository;
import com.io.github.com.mkmuniz.portfolio.projects.service.ProjectService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import io.github.cdimascio.dotenv.Dotenv;
import io.github.cdimascio.dotenv.DotenvException;
import org.junit.jupiter.api.BeforeAll;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
@TestPropertySource(locations = "classpath:application-test.properties")
class ProjectServiceTest {
    @Mock
    private ProjectRepository projectRepository;

    @InjectMocks
    private ProjectService projectService;

    private Project mockProject;

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
        MockitoAnnotations.initMocks(this);

        mockProject = new Project(
            "1",
            "biblioteca-virtual",
            "Biblioteca Virtual",
            "Sistema de gerenciamento de biblioteca com controle de empréstimos e acervo digital",
            "Projeto completo de biblioteca virtual que permite cadastro de livros, controle de empréstimos, gestão de usuários e acervo digital. Inclui funcionalidades como busca avançada, renovação online e relatórios gerenciais.", 
            "https://github.com/mkmuniz/biblioteca-virtual",
            "https://biblioteca-virtual-demo.herokuapp.com",
            new String[]{"Java", "Spring Boot", "MongoDB", "React", "Docker"},
            Arrays.asList("https://res.cloudinary.com/demo/image/biblioteca/dashboard.jpg", "https://res.cloudinary.com/demo/image/biblioteca/catalogo.jpg")
        );
    }

    @Test
    void testFindAll() {
        when(projectRepository.findAll()).thenReturn(Arrays.asList(mockProject));

        List<Project> result = projectService.getAllProjects();

        assertEquals(1, result.size());
        assertEquals("Biblioteca Virtual", result.get(0).getTitle());
    }

    @Test
    void testFindBySlug() {
        String slug = "1";
        
        when(projectRepository.findBySlug(slug)).thenReturn(mockProject);
        Project result = projectService.getProjectBySlug(slug);

        assertEquals(mockProject, result);
    }

    @Test
    void testCreateProduct() {
        when(projectRepository.save(mockProject)).thenReturn(mockProject);

        Project result = projectService.createProject(mockProject);

        assertEquals(result, mockProject);
    } 

    @Test
    void testUpdateProject() {
        Project updatedProject = new Project(
            "1",
            "biblioteca-virtual",
            "Biblioteca Virtual De Livros Acadêmicos",
            "Sistema de gerenciamento de biblioteca com controle de empréstimos e acervo digital",
            "Projeto completo de biblioteca virtual que permite cadastro de livros, controle de empréstimos, gestão de usuários e acervo digital. Inclui funcionalidades como busca avançada, renovação online e relatórios gerenciais.", 
            "https://github.com/mkmuniz/biblioteca-virtual",
            "https://biblioteca-virtual-demo.herokuapp.com",
            new String[]{"Java", "Spring Boot", "MongoDB", "React", "Docker"},
            Arrays.asList("https://res.cloudinary.com/demo/image/biblioteca/dashboard.jpg", "https://res.cloudinary.com/demo/image/biblioteca/catalogo.jpg")
        );

        when(projectRepository.save(updatedProject)).thenReturn(updatedProject);

        Project result = projectService.updateProject("1", updatedProject);

        assertEquals(updatedProject, result);
    }

    @Test
    void testDeleteProject() {
        doNothing().when(projectRepository).deleteById("1");

        projectService.deleteProject("1");

        verify(projectRepository, times(1)).deleteById("1");
    }

    @Test
    void testUpdateProjectImages() {
        when(projectRepository.findById("1")).thenReturn(Optional.of(mockProject));

        projectService.updateProjectImages("1", Arrays.asList("https://res.cloudinary.com/demo/image/biblioteca/dashboard.jpg", "https://res.cloudinary.com/demo/image/biblioteca/catalogo.jpg"));

        verify(projectRepository, times(1)).save(mockProject);
    }
}