using BackEnd.Data;
using BackEnd.Models;
using BackEnd.Repositories.Interfaces;
using Microsoft.EntityFrameworkCore;

namespace BackEnd.Repositories
{
    public class ProjectRepository : IProjectRepository
    {
        private readonly ProjectsDBContext _dbContext;
        public ProjectRepository(ProjectsDBContext dbContext)
        {
            _dbContext = dbContext;
        }

        public async Task<ProjectModel> AddProject(ProjectModel project)
        {
                ProjectModel projectModel = new ProjectModel{
                    Id = 0,
                    Name = "Mikael",
                    Description = "Testando"
                };

                _dbContext.Projects.Add(projectModel);
                _dbContext.SaveChanges();

                return project;
        }

        public async Task<List<ProjectModel>?> GetAllProjects()
        {
            try
            {
                return await _dbContext.Projects.ToListAsync();
            } catch (Exception ex)
            {
                Console.WriteLine($"{ex.Message}");

                return null;
            }
        }

        public Task<ProjectModel> GetProjectById(int id)
        {
            throw new NotImplementedException();
        }

        public Task<ProjectModel> GetProjectByName(string name)
        {
            throw new NotImplementedException();
        }

        public Task<ProjectModel> UpdateProject(ProjectModel project, int id)
        {
            throw new NotImplementedException();
        }
    }
}
