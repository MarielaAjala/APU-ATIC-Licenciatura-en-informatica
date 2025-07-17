using TP2.Aplicacion.Entidades;
using TP2.Aplicacion.Interfaces;
namespace TP2.Repositorios;
using Institucion;
public class RepositorioInscripcionMock : IRepositorioInscripcion
{
    private Inscripcion Clonar(Inscripcion c) //se van a devolver copias de los cliente guardados
    {
        return new Inscripcion() {Id= c.Id, EstudianteId = c.EstudianteId, CursoId = c.CursoId, FechaDeInscripcion= c.FechaDeInscripcion};
    }
    
    public void AgregarInscripcion(Inscripcion inscripcion) {
        using (var db = new EscuelaContext())
        {
            db.Add(inscripcion);
            db.SaveChanges();
        }
    }

 public void EliminarInscripcion(int id) 
 {
    using (var db = new EscuelaContext())
    {
        
         var c= (from d in db.Inscripciones
                where d.Id == id
                select d).First();
        if(c!= null){        
            db.Remove(c);
        }
        db.SaveChanges();
    }

 }
 public Inscripcion? GetInscripcion(int id)
 {  List<Inscripcion> lista = new List<Inscripcion>();
  using (var db = new EscuelaContext())
    {   db.Database.EnsureCreated();
       Inscripcion? estu= new Inscripcion();
        var d= (from h in db.Inscripciones
                where h.Id== id
                select h).First();
        db.SaveChanges();
        return d;
    }
 }

 public List<Inscripcion> GetInscripciones()
 {
    List<Inscripcion> lista = new List<Inscripcion>();
    using (var db = new EscuelaContext())
    {   db.Database.EnsureCreated();
        var d= from h in db.Inscripciones
                select h;
        lista= d.ToList();
        db.SaveChanges();
         return lista;
    }
 } 
  public void ModificarInscripcion(Inscripcion inscripcion)
 {
 using (var db = new EscuelaContext())
    {
        db.Database.EnsureCreated();
        foreach(var r in db.Inscripciones)
        {
            if(r.Id == inscripcion.Id){
               db.Remove(r);
               db.Add(inscripcion); 
            }
        }
        db.SaveChanges();
    }
}

}
