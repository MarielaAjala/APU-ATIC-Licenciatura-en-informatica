using TP2.Aplicacion.Entidades;

namespace TP2.Aplicacion.Interfaces;
public interface IRepositorioCurso{
    List<Curso> ListarCursos();
    Curso? ObtenerCurso(int id);
    void ModificarCurso(Curso curso);
    void EliminarCurso(int id);
    void AgregarCurso(Curso curso);
    Curso? ObtenerCursoTitulo(string titulo);

    void ActualizarInscripcionesCurso(int id);

    List<Curso> CursosInscriptos(int id);
    List<Curso>ObtenerListasDeCursos(string Titulo);

}