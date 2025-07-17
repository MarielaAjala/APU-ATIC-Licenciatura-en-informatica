package ar.edu.unlp.info.oo1.ejercicio11inversor;

public class InversionEnAcciones implements Inversion{
	private String nombre;
	private int cantidad;
	private double valorUnitario;
	public InversionEnAcciones(String nombre,int cantidad,double valorUnitario) {
		this.nombre=nombre;
		this.cantidad=cantidad;
		this.valorUnitario=valorUnitario;
	}
	public String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCantidad() {
		return cantidad;
	}
	protected void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getValorUnitario() {
		return valorUnitario;
	}
	protected void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	public double valorActual() {
		return this.cantidad * this.valorUnitario;
	}
}
