package ar.edu.unlp.info.oo1.parcial1rafechaaprobado1;

import java.time.LocalDate;
import java.time.Period;

import ar.edu.unlp.info.oo1.ejercicio14datelapse.*;

public abstract class Evento {
	private String nombre;
	private LocalDate fecha;
	private String tema;
	private double precioInscripcion;
	private double precioRemera;
	public Evento(String nombre,LocalDate fecha,String tema,double precioInscripcion,double precioRemera) {
		this.nombre=nombre;
		this.fecha=fecha;
		this.tema=tema;
		this.precioInscripcion=precioInscripcion;
		this.precioRemera=precioRemera;
	}
	public double getPrecioTotal() {
		return this.getPrecioInscripcion()+this.getPrecioRemera()+this.getCargosAdicionales();
	}
	protected abstract double getCargosAdicionales();
	public double consultarPrecio(LocalDate fecha) {
		int d = Period.between(fecha, this.getFecha()).getDays();
		if (d==0) {
			return this.getPrecioTotal()*(1+this.getRecargoMismoDia());
		}else {
			return this.getPrecioTotal();
		}
	}
	public double getRecargoMismoDia() {
		return 0.2;
	}
	public Integer diasRestantes() {
		int d=-1;
		LocalDate hoy = LocalDate.now();
		if(this.getFecha().isBefore(hoy)) {
			d = Period.between(this.getFecha(), hoy).getDays();
		}
		return d;
	}
	public LocalDate getFecha() {
		return this.fecha;
	}
	public String getNombre() {
		return nombre;
	}
	public String getTema() {
		return tema;
	}
	public double getPrecioInscripcion() {
		return precioInscripcion;
	}   
	public double getPrecioRemera() {
		return precioRemera;
	}
	public boolean estaEnPeriodo(DateLapse dl) {
		return dl.includesDate(this.getFecha());
	}
}
