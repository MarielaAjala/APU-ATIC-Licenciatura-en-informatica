using TP2.Aplicacion.Entidades;
using TP2.Aplicacion.Interfaces;
namespace TP2.Aplicacion.UseCases;
public class CursosInscriptosUseCase
{
 private readonly IRepositorioCurso _rCurso;
 public CursosInscriptosUseCase(IRepositorioCurso rCurso)
 {
 _rCurso = rCurso;
 }
 public List<Curso> Ejecutar(int id)
 {
 return _rCurso.CursosInscriptos(id);
 }
}
