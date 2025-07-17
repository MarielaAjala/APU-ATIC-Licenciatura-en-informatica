using TP2.Aplicacion.Entidades;
using TP2.Aplicacion.Interfaces;
namespace TP2.Aplicacion.UseCases;
public class ModificarEstudianteUseCase
{
 private readonly IRepositorioEstudiante _rEstudiante;
 public ModificarEstudianteUseCase(IRepositorioEstudiante rEstudiante)
 {
 _rEstudiante = rEstudiante;
 }
 public void Ejecutar(Estudiante estudiante)
 {
 _rEstudiante.ModificarEstudiante(estudiante);
 }
}