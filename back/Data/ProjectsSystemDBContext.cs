using back.Models;
using back.Models;
using Microsoft.EntityFrameworkCore;

namespace back.Data
{
    public class ProjectsSystemDBContext: DbContext
    {
        public ProjectsSystemDBContext(DbContextOptions<ProjectsSystemDBContext> options) : base(options) { 

        }
        public DbSet<ProjectModel> Projects { get; set; }
        protected override void OnModelCreating(ModelBuilder modelBuilder)
        {
            base.OnModelCreating(modelBuilder);
        }
    }
}
