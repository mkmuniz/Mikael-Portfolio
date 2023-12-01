using BackEnd.Models;
using BackEnd.Repositories.Interfaces;
using Microsoft.AspNetCore.Mvc;

namespace BackEnd.Controllers
{
    [ApiController]
    [Route("/[controller]")]
    public class ProjectController : ControllerBase
    {
        private readonly IProjectRepository _projectRepository;

        [HttpGet()]
        public async Task<ActionResult<List<ProjectModel>>> GetAllProjects()
        {
            try
            {
                return await _projectRepository.GetAllProjects();
            } catch (Exception ex)
            {
                Console.WriteLine(ex);

                return new List<ProjectModel>();
            }
        }

        [HttpPost()]
        public async Task<ActionResult<ProjectModel>> AddProject([FromBody] ProjectModel project)
        {
            ProjectModel projectResult = await _projectRepository.AddProject(project);

            return Ok(projectResult);
        }
    }
}