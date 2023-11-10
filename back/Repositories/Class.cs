using back.Models;
using back.Repositories.Interfaces;
using back.Data;
using Microsoft.EntityFrameworkCore;

namespace back.Repositories
{
    public class ProjectRepository : IProjectRepository
    {
        private readonly ProjectsSystemDBContext _dbContext;
        public ProjectRepository(ProjectsSystemDBContext projectsSystemDBContext)
        {
            _dbContext = projectsSystemDBContext;
        }

        public async Task<List<ProjectModel>> GetAllProjects()
        {
            return await _dbContext.Projects.ToListAsync();
        }
    }
}
