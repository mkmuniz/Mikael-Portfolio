using back.Models;

namespace back.Repositories.Interfaces
{
    public interface IProjectRepository
    {
        Task<List<ProjectModel>> GetAllProjects();
    }
}
