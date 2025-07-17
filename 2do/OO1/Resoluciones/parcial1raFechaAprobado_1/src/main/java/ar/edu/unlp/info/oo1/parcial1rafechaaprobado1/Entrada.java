package ar.edu.unlp.info.oo1.parcial1rafechaaprobado1;

import java.time.LocalDate;
import java.time.Period;
import ar.edu.unlp.info.oo1.ejercicio14datelapse.*;

public class Entrada {
	private LocalDate fechaCompra;
	private boolean seguro;
	private Evento evento;
	public Entrada(Evento evento,boolean seguro) {
		this.evento=evento;
		this.fechaCompra=LocalDate.now();
		this.seguro=seguro;
	}
	public double getPrecio() {
		double precio = this.evento.getPrecioTotal();
		if (this.seguro) {
			precio+=this.getCostoSeguro();
		}
		return precio;
	}
	public double getMontoRecuperar() {
		double valor = (Period.between(this.fechaCompra, this.evento.getFecha())).getDays()>=30?this.evento.getPrecioTotal()/2:0;
		if(seguro) {
			valor+=this.evento.getPrecioTotal()*0.15;
		}
		return valor;
	}
	public Integer getDiaHastaElEvento() {
		return this.evento.diasRestantes();
	}
	public boolean estaEnPeriodo(DateLapse dl) {
		return dl.includesDate(this.fechaCompra);
	}
	private double getCostoSeguro() {
		return 500;
	}
	public LocalDate getFecha() {
		return this.evento.getFecha();
	}
}
