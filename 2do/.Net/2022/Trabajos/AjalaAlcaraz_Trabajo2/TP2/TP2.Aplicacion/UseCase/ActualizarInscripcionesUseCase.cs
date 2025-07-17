using TP2.Aplicacion.Interfaces;
namespace TP2.Aplicacion.UseCases;
public class ActualizarInscripcionesUseCase
{
 private readonly IRepositorioEstudiante  _rEstudiante;
 public ActualizarInscripcionesUseCase(IRepositorioEstudiante rEstudiante)
 {
 _rEstudiante = rEstudiante;
 }
 public void Ejecutar(int id)
 {
    _rEstudiante.ActualizarInscripciones(id);
 }
}