using TP2.Aplicacion.Interfaces;
namespace TP2.Aplicacion.UseCases;
public class EliminarCursoUseCase
{
 private readonly IRepositorioCurso  _rCurso;
 public EliminarCursoUseCase(IRepositorioCurso rCurso)
 {
 _rCurso = rCurso;
 }
 public void Ejecutar(int id)
 {
    _rCurso.EliminarCurso(id);
 }
}