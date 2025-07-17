using TP2.Aplicacion.Interfaces;
namespace TP2.Aplicacion.UseCases;
public class ActualizarInscripcionesCursoUseCase
{
 private readonly IRepositorioCurso  _rCurso;
 public ActualizarInscripcionesCursoUseCase(IRepositorioCurso rCurso)
 {
 _rCurso = rCurso;
 }
 public void Ejecutar(int id)
 {
    _rCurso.ActualizarInscripcionesCurso(id);
 }
}