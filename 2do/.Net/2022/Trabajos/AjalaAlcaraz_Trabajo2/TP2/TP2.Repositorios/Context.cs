using Microsoft.EntityFrameworkCore;
using TP2.Aplicacion.Entidades;
namespace Institucion;
public class EscuelaContext : DbContext
{
    #nullable disable
    public DbSet<Estudiante> Estudiantes { get; set; }
    public DbSet<Inscripcion> Inscripciones { get; set; }
    public DbSet<Curso> Cursos { get; set; }

    protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
    {
  
      optionsBuilder.UseSqlite("data source=Institucion.sqlite");
    }
    
    protected override void OnModelCreating(ModelBuilder modelBuilder){
       modelBuilder.Entity<Inscripcion>(entity => { entity.HasKey(e=> e.Id);});
     }

     

}
