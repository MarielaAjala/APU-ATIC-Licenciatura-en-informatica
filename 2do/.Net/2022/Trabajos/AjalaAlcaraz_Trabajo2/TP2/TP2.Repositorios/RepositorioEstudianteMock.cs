using TP2.Aplicacion.Entidades;
using TP2.Aplicacion.Interfaces;
namespace TP2.Repositorios;
using Institucion;
public class RepositorioEstudianteMock : IRepositorioEstudiante
{

    private Estudiante Clonar(Estudiante c) //se van a devolver copias de los cliente guardados
    {
        return new Estudiante() {Dni= c.Dni, Nombre = c.Nombre, Apellido = c.Apellido};
     }
    public void AgregarEstudiante(Estudiante estudiante) {
        using (var db = new EscuelaContext())
        {   
            db.Add(estudiante);
            db.SaveChanges();
        }
 
    }

 public void EliminarEstudiante(int id) 
 {
    using (var db = new EscuelaContext())
    { 
         var c= (from d in db.Estudiantes
                where d.Id == id
                select d).First();
        if(c!= null){        
            db.Remove(c);
        }
        db.SaveChanges();
    }

 }
 public Estudiante? GetEstudiante(int id)
 {
  using (var db = new EscuelaContext())
    {
       Estudiante? estu= new Estudiante();
        var d= (from h in db.Estudiantes
                where h.Id== id
                select h).First();
        db.SaveChanges();
        return d;
    }
 }

 public Estudiante? GetEstudianteDni(int dni)
 {
  Estudiante? estu= null;
  using (var db = new EscuelaContext())
    {
        foreach(var r in db.Estudiantes)
        {
            if(r.Dni == dni){
               estu= r;
               return estu;
            }
            else
            {
                estu= null;
            };
        }
        return estu;
    }
 }

 public List<Estudiante> GetEstudiantes()
 {
    
    using (var db = new EscuelaContext())
    {
     List<Estudiante> lista = new List<Estudiante>();
        var d= from h in db.Estudiantes
                select h;
        lista= d.ToList();
        db.SaveChanges();
     return lista;
    }
 } 
  public void ModificarEstudiante(Estudiante estudiante)
 {
 using (var db = new EscuelaContext())
 {   
        var c= (from h in db.Estudiantes
                where h.Id == estudiante.Id
                select h).First();
        db.Remove(c);
        db.Add(estudiante);
        db.SaveChanges();
    }    
}
public void ActualizarInscripciones(int id){
    using (var db = new EscuelaContext())
    {         
        var c= from J in db.Inscripciones
                where J.EstudianteId == id
                select J; 
        List<Inscripcion> listaId= c.ToList();
        foreach(var f in listaId){
            db.Remove(f);
        }
        db.SaveChanges();

    }
}
public List<Estudiante> GetInscriptos(int id)
{
    List<Estudiante> lista= new List<Estudiante>();
    List<int> listaInt=new List<int>();
    using(var db= new EscuelaContext())
    {
       var f = from d in db.Inscripciones
            where d.CursoId == id
            select d.EstudianteId;
            listaInt = f.ToList();
        if(listaInt.Count()> 0)
        {
            for(int i=0; listaInt.Count()> i ;i ++)
            {
                var g = (from d in db.Estudiantes
                where d.Id == listaInt[i]
                select d).First();
                lista.Add(g);
            }
        }
        db.SaveChanges();
    }
    return lista;
}

public List<Estudiante> EstudiantesEnCurso(){
    Estudiante estudiante= new Estudiante();
    List<Estudiante> lista= new List<Estudiante>();
    List<int> listaCursosId = new List<int>();
    List<int> listaEstudiantesId= new List<int>();
    using(var db= new EscuelaContext())
    {
       var ins = from d in db.Inscripciones
            select d.CursoId;
        listaCursosId = ins.ToList();  
        var est = from d in db.Inscripciones
            select d.EstudianteId;
        listaEstudiantesId = est.ToList();
        if(listaCursosId.Count() == listaEstudiantesId.Count() )
        {
            for(int i=0; listaCursosId.Count()> i ; i++)
            {
                var g = (from d in db.Cursos
                where d.Id == listaCursosId[i]
                select d).First();
                if(g.FechaDeFin > DateTime.Now && g.FechaDeInicio < DateTime.Now)
                {
                    Estudiante? estu= GetEstudiante(listaEstudiantesId[i]);
                    if(estu != null)
                    lista.Add(estu);
                }
            }
        }
        db.SaveChanges();
    }
    
    return lista;
}

public List <Estudiante> EstudiantesFinalizados(){
    List<Estudiante> lista= new List<Estudiante>();
    List<int> listaCursosId= new List<int>();
    List<int> listaEstudiantesId= new List<int>();
    Estudiante estudiante= new Estudiante();
    using(var db= new EscuelaContext())
    {
       var ins = from d in db.Inscripciones
            select d.CursoId;
        var est = from d in db.Inscripciones
            select d.EstudianteId;
        listaCursosId = ins .ToList();         
        listaEstudiantesId = est.ToList();
        if(listaCursosId.Count()> 0)
        {
            for(int i=0; listaCursosId.Count()> i ;i ++)
            {
                var g = (from d in db.Cursos
                where d.Id == listaCursosId[i]
                select d.FechaDeFin).First();
                #nullable disable
                if(g < DateTime.Now){
                     estudiante=GetEstudiante(listaEstudiantesId[i]);
                     var cur = db.Cursos.Where(a => a.Id == listaCursosId[i]).SingleOrDefault();
                     estudiante.Email=  cur.Titulo;
                     lista.Add(estudiante);
                }
                #nullable disable     
            }
        }
        db.SaveChanges();
    }
    return lista;        
}
}
