using TP2.Aplicacion.Entidades;
using TP2.Aplicacion.Interfaces;
namespace TP2.Aplicacion.UseCases;
public class ObtenerCursoTituloUseCase
{
 private readonly IRepositorioCurso _rCurso;
 public ObtenerCursoTituloUseCase(IRepositorioCurso rCurso)
 {
 _rCurso = rCurso;
 }
 public Curso? Ejecutar(String titulo)
 {
 return _rCurso.ObtenerCursoTitulo(titulo);
 }
}