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
    }
}