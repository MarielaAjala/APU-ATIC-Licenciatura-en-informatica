using TP2.Aplicacion.Entidades;
using TP2.Aplicacion.Interfaces;
namespace TP2.Aplicacion.UseCases;
public class ListarCursosUseCase
{
 private readonly IRepositorioCurso _rCurso;
 public ListarCursosUseCase(IRepositorioCurso rCurso)
 {
 _rCurso = rCurso;
 }
 public List<Curso> Ejecutar()
 {
 return _rCurso.ListarCursos();
 }
}
