using TP2.Aplicacion.Entidades;
using TP2.Aplicacion.Interfaces;
namespace TP2.Aplicacion.UseCases;
public class EstudiantesFinalizadosUseCase
{
 private readonly IRepositorioEstudiante _rEstudiante;
 public EstudiantesFinalizadosUseCase(IRepositorioEstudiante rEstudiante)
 {
 _rEstudiante = rEstudiante;
 }
 public List<Estudiante> Ejecutar()
 {
 return _rEstudiante.EstudiantesFinalizados();
 }
}
