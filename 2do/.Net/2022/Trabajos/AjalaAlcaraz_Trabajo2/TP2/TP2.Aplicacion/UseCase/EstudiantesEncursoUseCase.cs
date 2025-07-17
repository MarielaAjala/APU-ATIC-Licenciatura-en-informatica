using TP2.Aplicacion.Entidades;
using TP2.Aplicacion.Interfaces;
namespace TP2.Aplicacion.UseCases;
public class EstudiantesEnCursoUseCase
{
 private readonly IRepositorioEstudiante _rEstudiante;
 public EstudiantesEnCursoUseCase(IRepositorioEstudiante rEstudiante)
 {
 _rEstudiante = rEstudiante;
 }
 public List<Estudiante> Ejecutar()
 {
 return _rEstudiante.EstudiantesEnCurso();
 }
}
