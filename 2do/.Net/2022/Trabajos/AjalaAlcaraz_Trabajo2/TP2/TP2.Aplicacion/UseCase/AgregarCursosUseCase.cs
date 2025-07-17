using TP2.Aplicacion.Entidades;
using TP2.Aplicacion.Interfaces;

namespace TP2.Aplicacion.UseCases;

public class AgregarCursoUseCase{
    private readonly IRepositorioCurso _rCurso;
    public AgregarCursoUseCase(IRepositorioCurso rCurso){
        _rCurso= rCurso;
    }
    public void Ejecutar(Curso curso){
        _rCurso.AgregarCurso(curso);
    }
}