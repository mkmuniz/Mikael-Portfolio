using back.Data;
using back.Models;
using back.Repositories;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;

namespace back.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class ProjectController : ControllerBase
    {
        [HttpGet] ActionResult <List<ProjectModel>> getAllProjects()
        {
            try
            {
                var data = GetAllProj();

                return data;
            } catch (Exception e)
            {
                Console.WriteLine(e.ToString());

                return null;
            }
        }
    }
}
