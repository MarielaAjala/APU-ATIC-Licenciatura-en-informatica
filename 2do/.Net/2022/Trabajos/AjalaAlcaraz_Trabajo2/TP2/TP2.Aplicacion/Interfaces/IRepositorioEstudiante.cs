using TP2.Aplicacion.Entidades;

namespace TP2.Aplicacion.Interfaces;
public interface IRepositorioEstudiante{
    List<Estudiante> GetEstudiantes();
    Estudiante? GetEstudiante(int id);
    Estudiante? GetEstudianteDni(int dni);
    void ModificarEstudiante(Estudiante estudiante);
    void EliminarEstudiante(int id);
    void AgregarEstudiante(Estudiante estudiante);
    void ActualizarInscripciones(int id);
    List<Estudiante> GetInscriptos(int id);
    List<Estudiante> EstudiantesEnCurso();
    List<Estudiante> EstudiantesFinalizados();
}