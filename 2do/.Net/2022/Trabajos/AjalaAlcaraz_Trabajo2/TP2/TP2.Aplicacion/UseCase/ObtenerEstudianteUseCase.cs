using TP2.Aplicacion.Entidades;
using TP2.Aplicacion.Interfaces;
namespace TP2.Aplicacion.UseCases;
public class ObtenerEstudianteUseCase
{
 private readonly IRepositorioEstudiante _rEstudiante;
 public ObtenerEstudianteUseCase(IRepositorioEstudiante rEstudiante)
 {
 _rEstudiante = rEstudiante;
 }
 public Estudiante? Ejecutar(int id)
 {
 return _rEstudiante.GetEstudiante(id);
 }
}