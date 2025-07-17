package ar.edu.unlp.info.oo1.ejercicio8lookup;

public class Empleado {
	private String nombre;
public Empleado(String nombre) {
	this.nombre=nombre;
}
public double montoBasico() {
	//System.out.println("Ejecute montoBasico de Empleado");
	return 35000;
}
public double aportes() {
	//System.out.println("Ejecute aportes de Empleado");
	return 13500;
}
public double sueldoBasico() {
	//System.out.println("Ejecute sueldoBasico de Empleado");
	return this.montoBasico() + this.aportes();
}
}
