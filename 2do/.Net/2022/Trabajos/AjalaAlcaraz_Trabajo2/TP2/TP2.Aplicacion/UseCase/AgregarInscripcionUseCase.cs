using TP2.Aplicacion.Entidades;
using TP2.Aplicacion.Interfaces;

namespace TP2.Aplicacion.UseCases;

public class AgregarInscripcionUseCase{
    private readonly IRepositorioInscripcion _rInscripcion;
    public AgregarInscripcionUseCase(IRepositorioInscripcion rInscripcion){
        _rInscripcion= rInscripcion;
    }
    public void Ejecutar(Inscripcion Inscripcion){
        _rInscripcion.AgregarInscripcion(Inscripcion);
    }
}