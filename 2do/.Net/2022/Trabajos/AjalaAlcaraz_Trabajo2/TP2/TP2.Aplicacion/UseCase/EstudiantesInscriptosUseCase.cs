using TP2.Aplicacion.Entidades;
using TP2.Aplicacion.Interfaces;
namespace TP2.Aplicacion.UseCases;
public class EstudiantesInscriptosUseCase
{
 private readonly IRepositorioEstudiante _rEstudiante;
 public EstudiantesInscriptosUseCase(IRepositorioEstudiante rEstudiante)
 {
 _rEstudiante = rEstudiante;
 }
 public List<Estudiante> Ejecutar(int id)
 {
 return _rEstudiante.GetInscriptos(id);
 }
}
