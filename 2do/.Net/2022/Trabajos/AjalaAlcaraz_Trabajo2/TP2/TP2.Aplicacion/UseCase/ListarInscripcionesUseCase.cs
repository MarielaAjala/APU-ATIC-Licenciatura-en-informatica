using TP2.Aplicacion.Entidades;
using TP2.Aplicacion.Interfaces;
namespace TP2.Aplicacion.UseCases;
public class ListarInscripcionesUseCase
{
 private readonly IRepositorioInscripcion _rInscripcion;
 public ListarInscripcionesUseCase(IRepositorioInscripcion rInscripcion)
 {
 _rInscripcion = rInscripcion;
 }
 public List<Inscripcion> Ejecutar()
 {
 return _rInscripcion.GetInscripciones();
 }
}
