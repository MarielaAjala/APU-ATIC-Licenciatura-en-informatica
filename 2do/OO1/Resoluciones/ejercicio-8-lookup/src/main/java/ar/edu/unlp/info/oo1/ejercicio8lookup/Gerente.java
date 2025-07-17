package ar.edu.unlp.info.oo1.ejercicio8lookup;

public class Gerente extends EmpleadoJerarquico{
	public Gerente(String nombre) {
		super(nombre);
	}
	public double aportes() {
		//System.out.println("Ejecute aportes  de Gerente");
		return this.montoBasico()*0.05d;
	}
	public double montoBasico() {
		//System.out.println("Ejecute montoBasico  de Gerente");
		return 57000;
	}
}
