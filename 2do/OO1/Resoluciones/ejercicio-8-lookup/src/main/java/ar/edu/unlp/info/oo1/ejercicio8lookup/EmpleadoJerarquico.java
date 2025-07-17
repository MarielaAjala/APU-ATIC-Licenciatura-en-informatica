package ar.edu.unlp.info.oo1.ejercicio8lookup;

public class EmpleadoJerarquico extends Empleado{
	public EmpleadoJerarquico(String nombre) {
		super(nombre);
	}
	public double sueldoBasico() {
		//System.out.println("Ejecute sueldoBasico de EmpleadoJerarquico");
		return super.sueldoBasico()+this.bonoPorCategoria();
	}
	public double montoBasico() {
		//System.out.println("Ejecute montoBasico de EmpleadoJerarquico");
		return 45000;
	}
	public double bonoPorCategoria() {
		//System.out.println("Ejecute bonoPorCategoria de EmpleadoJerarquico");
		return 8000;
	}
}
