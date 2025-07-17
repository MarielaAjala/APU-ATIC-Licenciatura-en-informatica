using TP2.Aplicacion.Entidades;

namespace TP2.Aplicacion.Interfaces;
public interface IRepositorioInscripcion{
    List<Inscripcion> GetInscripciones();
    Inscripcion? GetInscripcion(int id);
    void ModificarInscripcion(Inscripcion inscripcion);
    void EliminarInscripcion(int id);
    void AgregarInscripcion(Inscripcion inscripcion);
}