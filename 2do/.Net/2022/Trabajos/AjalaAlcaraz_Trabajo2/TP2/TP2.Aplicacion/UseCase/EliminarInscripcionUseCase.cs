using TP2.Aplicacion.Interfaces;
namespace TP2.Aplicacion.UseCases;
public class EliminarInscripcionUseCase
{
 private readonly IRepositorioInscripcion  _rInscripcion;
 public EliminarInscripcionUseCase(IRepositorioInscripcion rInscripcion)
 {
 _rInscripcion = rInscripcion;
 }
 public void Ejecutar(int Dni)
 {
    _rInscripcion.EliminarInscripcion(Dni);
 }
}