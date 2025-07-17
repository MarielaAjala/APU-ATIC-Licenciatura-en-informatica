package ar.edu.unlp.info.oo1.ejercicio24poolcar;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Vehiculo {
	
	private String descripcion;
	private int capacidad;
	private int anioFabricacion;
	private double valorMercado;
	
	public Vehiculo(String descripcion,int cupo, int anioFabric,double valor) {
		this.descripcion=descripcion;
		this.capacidad=cupo;
		this.anioFabricacion=anioFabric;
		this.valorMercado=valor;
	}
	
	public double porcentajeValorMercado(double porc) {
		return this.valorMercado * porc;
	}
	
	public boolean antiguedadMenorA5anios() {
		return ((LocalDate.now().getYear() - this.anioFabricacion) < 5);
	}

	public int getCapacidad() {
		return capacidad;
	}
	
}
