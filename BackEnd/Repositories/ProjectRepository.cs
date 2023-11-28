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

        public Task<ProjectModel> AddProject(ProjectModel project)
        {
            try
            {
                _dbContext.Projects.Add(project);
                _dbContext.SaveChanges();

                return Task.FromResult(project);
            } catch (Exception ex)
            {
                Console.WriteLine($"{ex.Message}");

                return null;
            }
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
