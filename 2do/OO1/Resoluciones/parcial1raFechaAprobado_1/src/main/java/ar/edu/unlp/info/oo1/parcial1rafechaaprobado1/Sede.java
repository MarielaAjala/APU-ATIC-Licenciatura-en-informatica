package ar.edu.unlp.info.oo1.parcial1rafechaaprobado1;

public class Sede {
	private String nombre;
	private double precioEstadiaPorDia;
	private int diasDeEstadia;
	public Sede(String nombre,double precioEstadia,int diasEstadia) {
		this.nombre=nombre;
		this.precioEstadiaPorDia=precioEstadia;
		this.diasDeEstadia=diasEstadia;
	}
	public double getCostoEstadia() {
		return this.getPrecioEstadiaPorDia()*this.getDiasDeEstadia();
	}
	public String getNombre() {
		return nombre;
	}
	public double getPrecioEstadiaPorDia() {
		return precioEstadiaPorDia;
	}
	public int getDiasDeEstadia() {
		return diasDeEstadia;
	}
	
}
