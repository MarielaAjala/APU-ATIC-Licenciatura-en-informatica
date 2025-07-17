using TP2.Aplicacion.Entidades;
using TP2.Aplicacion.Interfaces;
namespace TP2.Aplicacion.UseCases;
public class ObtenerListasDeCursosUseCase
{
 private readonly IRepositorioCurso _rCurso;
 public ObtenerListasDeCursosUseCase(IRepositorioCurso rCurso)
 {
 _rCurso = rCurso;
 }
 public List<Curso> Ejecutar(string titulo)
 {
 return _rCurso.ObtenerListasDeCursos(titulo);
 }
}
