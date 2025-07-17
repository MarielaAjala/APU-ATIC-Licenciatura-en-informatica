package ar.edu.unlp.info.oo1.ejercicio17alquilerdepropiedades;

import java.time.LocalDate;

import ar.edu.unlp.info.oo1.ejercicio14datelapse.DateLapse;


public class Reserva {
	private DateLapse periodo;
	private Usuario inquilino;
	
	public Reserva(DateLapse periodo, Usuario inquilino) {
		this.periodo = periodo;
		this.inquilino= inquilino;
	}
	
	public DateLapse getPeriodo() {
		return periodo;
	}

	public int getDuracion() {
		return this.periodo.sizeInDays();
	}
	
	public boolean esCancelable() {
		return !this.periodo.includesDate(LocalDate.now());
	}
	
	public double calcularPrecio( double precioNoche ) {
		return this.getDuracion() * precioNoche ;
	}
}
