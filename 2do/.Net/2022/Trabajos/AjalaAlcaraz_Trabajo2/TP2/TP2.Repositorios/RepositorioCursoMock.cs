using TP2.Aplicacion.Entidades;
using TP2.Aplicacion.Interfaces;
namespace TP2.Repositorios;
using Institucion;
public class RepositorioCursoMock : IRepositorioCurso
{

    private Curso Clonar(Curso c) //se van a devolver copias de los cliente guardados
    {
        return new Curso() {Id= c.Id, Titulo = c.Titulo, Descripcion = c.Descripcion};
     }
    public void AgregarCurso(Curso curso) {
         using (var db = new EscuelaContext())
        {   
            db.Database.EnsureCreated();
            db.Add(curso);
            db.SaveChanges();
        }    
    }

 public void EliminarCurso(int id) 
 {   
    using (var db = new EscuelaContext())
    {   Console.WriteLine(id + "IDE QUE INGRESO ");    
        db.Database.EnsureCreated();
         var c= (from d in db.Cursos
                where d.Id == id
                select d).First();
        Console.WriteLine(c.Titulo);
        if(c!= null){        
            db.Remove(c);
        }
        db.SaveChanges();
    }   
 }
 public Curso? ObtenerCurso(int id)
 {
    using (var db = new EscuelaContext())
    {  db.Database.EnsureCreated();
       Curso? curso= new Curso();
        var d= (from h in db. Cursos
                where h.Id== id
                select h).First();
        db.SaveChanges();
        return d;
    }    

 }
 public Curso? ObtenerCursoTitulo(String titulo)
 {
    using (var db = new EscuelaContext())
    {   db.Database.EnsureCreated();
        Curso? curso= new Curso();
        var d= (from h in db. Cursos
                where h.Titulo== titulo
                select h).First();
        db.SaveChanges();
        return d;
    }   

 }

 public List<Curso> ListarCursos()
 {
    List<Curso> lista = new List<Curso>();
     using (var db = new EscuelaContext())
     {  db.Database.EnsureCreated();
        var d= from h in db. Cursos
                select h;
        lista= d.ToList();
        db.SaveChanges();
     }
     return lista;
 } 
  public void ModificarCurso(Curso curso)
 {
    using (var db = new EscuelaContext())
    {   db.Database.EnsureCreated();
        var c= (from h in db.Cursos
                where h.Id == curso.Id
                select h).First();
        db.Remove(c);
        db.Add(curso);
        db.SaveChanges(); 
    }
 }

public void ActualizarInscripcionesCurso(int id){
    using (var db = new EscuelaContext())
    {   
       var c= from J in db.Inscripciones
                where J.CursoId == id
                select J; 
        List<Inscripcion> listaId= c.ToList();
        foreach(var f in listaId){
            db.Remove(f);
        }
        db.SaveChanges();
    }
}

public List<Curso> CursosInscriptos(int id)
{   
    List<Curso> lista= new List<Curso>();
    List<int> listaInt= new List<int>();
    using(var db= new EscuelaContext())
    {  db.Database.EnsureCreated();
       var f = from d in db.Inscripciones
            where d.EstudianteId == id
            select d.CursoId;
        foreach(var e in f)
        listaInt = f.ToList();
        if(listaInt.Count()> 0)
        {
            for(int i=0; listaInt.Count()> i ;i ++)
            {
                var g = (from d in db.Cursos
                where d.Id == listaInt[i]
                select d).First();
                lista.Add(g);
            }
        }
        db.SaveChanges();
    }
    return lista;
}

public List<Curso> ObtenerListasDeCursos(string Titulo)
{
    
    using(var db= new EscuelaContext())
    {   db.Database.EnsureCreated();
        List<Curso> curso= new List<Curso>();
        var l= from d in db.Cursos
        where d.Titulo == Titulo
        select d;
        curso= l.ToList();
        db.SaveChanges();
        return curso;
        
    }
}

}


