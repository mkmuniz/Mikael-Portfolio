using BackEnd.Models;

namespace BackEnd.Repositories.Interfaces
{
    public interface IProjectRepository
    {
        Task<List<ProjectModel>> GetAllProjects();
        Task<ProjectModel> GetProjectById(int id);
        Task<ProjectModel> GetProjectByName(string name);
        Task<ProjectModel> AddProject(ProjectModel project);
        Task<ProjectModel> UpdateProject(ProjectModel project, int id);
    }
}
