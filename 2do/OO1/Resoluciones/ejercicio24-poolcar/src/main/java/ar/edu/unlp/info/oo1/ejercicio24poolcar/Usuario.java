package ar.edu.unlp.info.oo1.ejercicio24poolcar;

public abstract class Usuario {
	
	protected String nombre;
	protected double saldo;
	
	public Usuario(String nombre) {
		this.nombre=nombre;
		this.saldo=0;
	}
	
	public void cargarSaldo(double monto) {
		this.saldo+=(monto-this.comision(monto));
	}
	
	public boolean abonarViaje(double costo) {
		return ((costo-this.bonificacion(costo))>=0);
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public abstract double bonificacion(double monto);
	public abstract double comision(double monto);
	
}
