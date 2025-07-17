using TP2.Aplicacion.Entidades;
namespace Institucion;
public class Inicializador
{
 public static void Inicializar(EscuelaContext context)
 {


 context.Add(new Estudiante() {Id= 1,Dni= 36645432, Nombre = "Juan",Apellido= "Gomez", Email= "juan@gmail.com" });
 context.Add(new Estudiante() {Id= 2,Dni= 36446857, Nombre = "Alberto",Apellido= "Gil", Email= "Gil@gmail.com" });
 context.Add(new Estudiante() {Id= 3,Dni= 24664685, Nombre = "Mario",Apellido= "Ortiz", Email= "Ortiz@gmail.com" });
 context.Add(new Estudiante() {Id= 4,Dni= 15656854, Nombre = "Laura",Apellido= "Fernandez", Email= "Garciaz@gmail.com" });
 context.Add(new Estudiante() {Id= 5,Dni= 17985784, Nombre = "Martin",Apellido= "Garcia", Email= "Garcian@gmail.com" });
 context.Add(new Estudiante() {Id= 6,Dni= 46743663, Nombre = "Nacho",Apellido= "Luhetti", Email= "Luhetti@gmail.com" });
 context.Add(new Estudiante() {Id= 7,Dni= 26757985, Nombre = "Esteban",Apellido= "Leal", Email= "Leal@gmail.com" });
 context.Add(new Estudiante() {Id= 8,Dni= 25357534, Nombre = "Roberto",Apellido= "Bolanios", Email= "Bolanios@gmail.com" });
 context.Add(new Estudiante() {Id= 9,Dni= 24774895, Nombre = "Inez",Apellido= "Hernandez", Email= "jHernandez@gmail.com" });
 context.Add(new Estudiante() {Id= 10,Dni= 47654456, Nombre = "Belen",Apellido= "Lopez", Email= "opez@gmail.com" });
 context.Add(new Estudiante() {Id= 11,Dni= 45512412, Nombre = "Martina",Apellido= "Fernandez", Email= "Fernandez@gmail.com" });
 context.Add(new Estudiante() {Id= 12,Dni= 53473453, Nombre = "Gabi",Apellido= "Barrios", Email= "Barrios@gmail.com" });
 context.Add(new Estudiante() {Id= 13,Dni= 64238423, Nombre = "Hector",Apellido= "Aparicio", Email= "Aparicio@gmail.com" });
 context.Add(new Estudiante() {Id= 14,Dni= 48741232, Nombre = "Maria",Apellido= "Gios", Email= "Gios@gmail.com" });
 context.Add(new Estudiante() {Id= 15,Dni= 12315123, Nombre = "Alicia",Apellido= "Rios", Email= "Rios@gmail.com" });
 context.Add(new Estudiante() {Id= 16,Dni= 51236123, Nombre = "Jose",Apellido= "Chazarreta", Email= "Chazarreta@gmail.com" });
 context.Add(new Curso { Id = 1, Titulo= "Herreria", Descripcion= "Rapida salida laboral",FechaDeInicio= DateTime.Parse("1/4/2020") , FechaDeFin=DateTime.Parse("10/12/2021")});
 context.Add(new Curso { Id = 2, Titulo= "Plomeria", Descripcion= "Rapida salida laboral",FechaDeInicio= DateTime.Parse("1/1/2019") , FechaDeFin=DateTime.Parse("4/10/2020")});
 context.Add(new Curso { Id = 3, Titulo= "Diesñador web", Descripcion= "Viajes al exterior",FechaDeInicio= DateTime.Parse("4/4/2018") , FechaDeFin=DateTime.Parse("4/10/2021")});
 context.Add(new Curso { Id = 4, Titulo= "Electricista", Descripcion= "Rapida salida laboral",FechaDeInicio= DateTime.Parse("1/1/2022") , FechaDeFin=DateTime.Parse("12/12/2022")});
 context.Add(new Curso { Id = 5, Titulo= "Programacion", Descripcion= "Viajes al exterior",FechaDeInicio= DateTime.Parse("4/4/2022") , FechaDeFin=DateTime.Parse("15/12/2022")});
 context.Add(new Curso { Id = 6, Titulo= "Manicura", Descripcion= "Trabajo en casa",FechaDeInicio= DateTime.Parse("1/1/2022") , FechaDeFin=DateTime.Parse("4/6/2022")});
 context.Add(new Curso { Id = 7, Titulo= "Maquillaje", Descripcion= "Rapida salida laboral",FechaDeInicio= DateTime.Parse("1/4/2022") , FechaDeFin=DateTime.Parse("4/8/2022")});
 context.Add(new Curso { Id = 8, Titulo= "Gasista", Descripcion= "",FechaDeInicio= DateTime.Parse("4/8/2022") , FechaDeFin=DateTime.Parse("4/12/2023")});
 context.Add(new Curso { Id = 9, Titulo= "Indumentaria", Descripcion= "Trabajo en casa",FechaDeInicio= DateTime.Parse("4/4/2022") , FechaDeFin=DateTime.Parse("4/12/2023")});
 context.Add(new Curso { Id = 10, Titulo= "Ventas", Descripcion= "Trabajo en casa",FechaDeInicio= DateTime.Parse("4/8/2024") , FechaDeFin=DateTime.Parse("4/12/2025")});
 context.Add(new Curso { Id = 11, Titulo= "Belleza", Descripcion= "Buena",FechaDeInicio= DateTime.Parse("4/9/2025") , FechaDeFin=DateTime.Parse("4/12/2026")});
 context.Add(new Curso { Id = 12, Titulo= "Aires Acondicionados", Descripcion= "Rapida salida laboral",FechaDeInicio= DateTime.Parse("4/4/2023") , FechaDeFin=DateTime.Parse("4/12/2024")});
 context.Add(new Curso { Id = 13, Titulo= "Seguridad Informatica", Descripcion= "Trabajo en casa",FechaDeInicio= DateTime.Parse("4/12/2023") , FechaDeFin=DateTime.Parse("4/12/2024")});
 context.Add(new Curso { Id = 14, Titulo= "Camaras de seguridad", Descripcion= "Rapida salida laboral",FechaDeInicio= DateTime.Parse("4/4/2022") , FechaDeFin=DateTime.Parse("4/12/2024")});
 context.Add(new Inscripcion{Id= 1, CursoId= 1, EstudianteId=1, FechaDeInscripcion= DateTime.Parse("1/3/2020")});
 context.Add(new Inscripcion{Id= 2, CursoId= 2, EstudianteId=12, FechaDeInscripcion= DateTime.Parse("1/1/2018")});
 context.Add(new Inscripcion{Id= 3, CursoId= 3, EstudianteId=13, FechaDeInscripcion= DateTime.Parse("4/4/2018")});
 context.Add(new Inscripcion{Id= 4, CursoId= 4, EstudianteId=14, FechaDeInscripcion= DateTime.Parse("1/1/2022")});
 context.Add(new Inscripcion{Id= 5, CursoId= 5, EstudianteId=15, FechaDeInscripcion= DateTime.Parse("4/4/2022")});
 context.Add(new Inscripcion{Id= 6, CursoId= 6, EstudianteId=6, FechaDeInscripcion= DateTime.Parse("1/1/2022")});
 context.Add(new Inscripcion{Id= 7, CursoId= 7, EstudianteId=7, FechaDeInscripcion= DateTime.Parse("1/4/2022")});
 context.Add(new Inscripcion{Id= 8, CursoId= 8, EstudianteId=8, FechaDeInscripcion= DateTime.Parse("4/12/2023")});
 context.Add(new Inscripcion{Id= 9, CursoId= 9, EstudianteId=9, FechaDeInscripcion= DateTime.Parse("4/4/2022")});
 context.Add(new Inscripcion{Id= 10, CursoId= 10 , EstudianteId=2, FechaDeInscripcion= DateTime.Parse("4/8/2024")});
 context.Add(new Inscripcion{Id= 11, CursoId= 11, EstudianteId=3, FechaDeInscripcion= DateTime.Parse("4/9/2025")});
 context.Add(new Inscripcion{Id= 12, CursoId= 12, EstudianteId=4, FechaDeInscripcion= DateTime.Parse("4/4/2023")});
 context.Add(new Inscripcion{Id= 13, CursoId= 13, EstudianteId=5, FechaDeInscripcion= DateTime.Parse("4/12/2023")});
 context.Add(new Inscripcion{Id= 14, CursoId= 14, EstudianteId=6, FechaDeInscripcion= DateTime.Parse("4/4/2022")});
 context.Add(new Inscripcion{Id= 15, CursoId= 14, EstudianteId=7, FechaDeInscripcion= DateTime.Parse("4/4/2022")});
 context.Add(new Inscripcion{Id= 16, CursoId= 12, EstudianteId=8, FechaDeInscripcion= DateTime.Parse("4/4/2023")});
 context.Add(new Inscripcion{Id= 17, CursoId= 13, EstudianteId=9, FechaDeInscripcion= DateTime.Parse("4/12/2023")});
 context.Add(new Inscripcion{Id= 18, CursoId= 1, EstudianteId=10, FechaDeInscripcion= DateTime.Parse("1/4/2020")});
 context.Add(new Inscripcion{Id= 19, CursoId= 12, EstudianteId=11, FechaDeInscripcion= DateTime.Parse("4/4/2023")});
 context.Add(new Inscripcion{Id= 20, CursoId= 12, EstudianteId=11, FechaDeInscripcion= DateTime.Parse("4/4/2023")});
 context.Add(new Inscripcion{Id= 21, CursoId= 4, EstudianteId=12, FechaDeInscripcion= DateTime.Parse("1/1/2022")});
 context.Add(new Inscripcion{Id= 22, CursoId= 6, EstudianteId=13, FechaDeInscripcion= DateTime.Parse("1/1/2022")});
 context.Add(new Inscripcion{Id= 23, CursoId= 8, EstudianteId=14, FechaDeInscripcion= DateTime.Parse("4/4/2022")});
 context.Add(new Inscripcion{Id= 24, CursoId= 3, EstudianteId=13, FechaDeInscripcion= DateTime.Parse("4/4/2018")});
 context.Add(new Inscripcion{Id= 25, CursoId= 8, EstudianteId=12, FechaDeInscripcion= DateTime.Parse("4/8/2022")});
 context.Add(new Inscripcion{Id= 26, CursoId= 7, EstudianteId=11, FechaDeInscripcion= DateTime.Parse("1/4/2022")});
 context.Add(new Inscripcion{Id= 27, CursoId= 5, EstudianteId=9, FechaDeInscripcion= DateTime.Parse("4/4/2022")});
 context.Add(new Inscripcion{Id= 28, CursoId= 12, EstudianteId=9, FechaDeInscripcion= DateTime.Parse("4/9/2025")});
 context.Add(new Inscripcion{Id= 29, CursoId= 11, EstudianteId=9, FechaDeInscripcion= DateTime.Parse("4/9/2025")});
 context.Add(new Inscripcion{Id= 30, CursoId= 14, EstudianteId=7, FechaDeInscripcion= DateTime.Parse("4/4/2022")});
 context.Add(new Inscripcion{Id= 31, CursoId= 14, EstudianteId=5, FechaDeInscripcion= DateTime.Parse("4/4/2022")});
 context.Add(new Inscripcion{Id= 32, CursoId= 1, EstudianteId=5, FechaDeInscripcion= DateTime.Parse("1/4/2020")});
 context.Add(new Inscripcion{Id= 33, CursoId= 1, EstudianteId=1, FechaDeInscripcion= DateTime.Parse("1/4/2020")});

 context.SaveChanges();
 }
}
