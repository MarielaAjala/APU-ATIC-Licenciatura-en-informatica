using TP2.Aplicacion.Entidades;
using TP2.Aplicacion.Interfaces;
namespace TP2.Aplicacion.UseCases;
public class ObtenerCursoUseCase
{
 private readonly IRepositorioCurso _rCurso;
 public ObtenerCursoUseCase(IRepositorioCurso rCurso)
 {
 _rCurso = rCurso;
 }
 public Curso? Ejecutar(int id)
 {
 return _rCurso.ObtenerCurso(id);
 }
}