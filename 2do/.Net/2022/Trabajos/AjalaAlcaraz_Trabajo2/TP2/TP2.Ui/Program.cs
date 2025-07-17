using Microsoft.AspNetCore.Components;
using Microsoft.AspNetCore.Components.Web;
using TP2.Ui.Data;
using Institucion;



using TP2.Repositorios;
using TP2.Aplicacion.UseCases;
using TP2.Aplicacion.Interfaces;
var builder = WebApplication.CreateBuilder(args);

using (var context = new EscuelaContext()){
    context.Database.EnsureCreated();
    //Inicializador.Inicializar(context);
}

builder.Services.AddRazorPages();
builder.Services.AddServerSideBlazor();
builder.Services.AddSingleton<WeatherForecastService>();


builder.Services.AddTransient<AgregarEstudianteUseCase>();
builder.Services.AddTransient<ListarEstudiantesUseCase>();
builder.Services.AddTransient<EliminarEstudianteUseCase>();
builder.Services.AddTransient<ModificarEstudianteUseCase>();
builder.Services.AddTransient<ObtenerEstudianteUseCase>();
builder.Services.AddTransient<ActualizarInscripcionesUseCase>();
builder.Services.AddTransient<ObtenerEstudianteDniUseCase>();
builder.Services.AddTransient<EstudiantesEnCursoUseCase>();
builder.Services.AddTransient<EstudiantesInscriptosUseCase>();
builder.Services.AddTransient<EstudiantesFinalizadosUseCase>();


builder.Services.AddTransient<AgregarCursoUseCase>();
builder.Services.AddTransient<ListarCursosUseCase>();
builder.Services.AddTransient<EliminarCursoUseCase>();
builder.Services.AddTransient<ModificarCursoUseCase>();
builder.Services.AddTransient<ObtenerCursoUseCase>();
builder.Services.AddTransient<ObtenerCursoTituloUseCase>();
builder.Services.AddTransient<ActualizarInscripcionesCursoUseCase>();
builder.Services.AddTransient<CursosInscriptosUseCase>();
builder.Services.AddTransient<ObtenerListasDeCursosUseCase>();

builder.Services.AddTransient<AgregarInscripcionUseCase>();
builder.Services.AddTransient<ListarInscripcionesUseCase>();
builder.Services.AddTransient<EliminarInscripcionUseCase>();
builder.Services.AddTransient<ModificarInscripcionUseCase>();
builder.Services.AddTransient<ObtenerInscripcionUseCase>();


builder.Services.AddScoped<IRepositorioInscripcion, RepositorioInscripcionMock>();
builder.Services.AddScoped<IRepositorioCurso, RepositorioCursoMock>();
builder.Services.AddScoped<IRepositorioEstudiante, RepositorioEstudianteMock>();


var app = builder.Build();


if (!app.Environment.IsDevelopment())
{
    app.UseExceptionHandler("/Error");
}


app.UseStaticFiles();

app.UseRouting();
app.MapBlazorHub();
app.MapFallbackToPage("/_Host");

app.Run();
