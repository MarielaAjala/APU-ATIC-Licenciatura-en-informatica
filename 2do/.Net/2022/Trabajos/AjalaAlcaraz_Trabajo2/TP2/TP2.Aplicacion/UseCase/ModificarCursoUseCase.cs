using TP2.Aplicacion.Entidades;
using TP2.Aplicacion.Interfaces;
namespace TP2.Aplicacion.UseCases;
public class ModificarCursoUseCase
{
 private readonly IRepositorioCurso _rCurso;
 public ModificarCursoUseCase(IRepositorioCurso rCurso)
 {
 _rCurso= rCurso;
 }
 public void Ejecutar(Curso curso)
 {
 _rCurso.ModificarCurso(curso);
 }
}