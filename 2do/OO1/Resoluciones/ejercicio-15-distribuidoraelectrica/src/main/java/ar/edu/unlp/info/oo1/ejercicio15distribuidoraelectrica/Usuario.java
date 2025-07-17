package ar.edu.unlp.info.oo1.ejercicio15distribuidoraelectrica;

public class Usuario {
private String nombre;
private Domicilio domicilio;
public Usuario(String nombre,Domicilio domicilio) {
	this(nombre);
	this.domicilio=domicilio;
}
public Usuario(String nombre) {
	this.nombre=nombre;
}


public String getNombre() {
	return nombre;
}
public Domicilio getDomicilio() {
	return domicilio;
}
protected void cambiarDomicilio(Domicilio nuevoDomicilio) {
	this.domicilio=nuevoDomicilio;
}
}
