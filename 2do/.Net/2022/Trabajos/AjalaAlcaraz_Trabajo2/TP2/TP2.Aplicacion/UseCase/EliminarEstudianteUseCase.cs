using TP2.Aplicacion.Interfaces;
namespace TP2.Aplicacion.UseCases;
public class EliminarEstudianteUseCase
{
 private readonly IRepositorioEstudiante  _rEstudiante;
 public EliminarEstudianteUseCase(IRepositorioEstudiante rEstudiante)
 {
 _rEstudiante = rEstudiante;
 }
 public void Ejecutar(int Dni)
 {
    _rEstudiante.EliminarEstudiante(Dni);
 }
}