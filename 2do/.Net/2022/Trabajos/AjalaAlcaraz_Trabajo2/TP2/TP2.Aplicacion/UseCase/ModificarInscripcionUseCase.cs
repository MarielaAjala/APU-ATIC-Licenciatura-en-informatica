using TP2.Aplicacion.Entidades;
using TP2.Aplicacion.Interfaces;
namespace TP2.Aplicacion.UseCases;
public class ModificarInscripcionUseCase
{
 private readonly IRepositorioInscripcion _rInscripcion;
 public ModificarInscripcionUseCase(IRepositorioInscripcion rInscripcion)
 {
 _rInscripcion = rInscripcion;
 }
 public void Ejecutar(Inscripcion inscripcion)
 {
 _rInscripcion.ModificarInscripcion(inscripcion);
 }
}