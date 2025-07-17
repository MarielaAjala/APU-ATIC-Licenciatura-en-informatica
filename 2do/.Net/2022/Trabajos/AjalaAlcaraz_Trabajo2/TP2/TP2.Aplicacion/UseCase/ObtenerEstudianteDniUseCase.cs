using TP2.Aplicacion.Entidades;
using TP2.Aplicacion.Interfaces;
namespace TP2.Aplicacion.UseCases;
public class ObtenerEstudianteDniUseCase
{
 private readonly IRepositorioEstudiante _rEstudiante;
 public ObtenerEstudianteDniUseCase(IRepositorioEstudiante rEstudiante)
 {
 _rEstudiante = rEstudiante;
 }
 public Estudiante? Ejecutar(int dni)
 {
 return _rEstudiante.GetEstudianteDni(dni);
 }
}