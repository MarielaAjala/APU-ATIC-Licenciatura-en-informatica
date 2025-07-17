package ar.edu.unlp.info.oo1.ejercicio17alquilerdepropiedades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import ar.edu.unlp.info.oo1.ejercicio14datelapse.DateLapse;

public class PropiedadEnAlquiler extends Propiedad{
	
	private double precio;
	private List<Reserva> reservas;
	
	public PropiedadEnAlquiler(String direccion, String nombreDescriptivo, double precio) {
		super(direccion, nombreDescriptivo);
		this.precio=precio;
		this.reservas=new ArrayList<Reserva>();
	}
	
	public boolean disponibilidad(DateLapse periodo) {
		return this.reservas.stream().noneMatch(r -> r.getPeriodo().overlaps(periodo));
	}
	
	public void reservar (DateLapse periodo, Usuario inquilino) {
		if( disponibilidad (periodo) ) {
			Reserva reserva = new Reserva(periodo,inquilino);
			this.reservas.add(reserva);
		}
	}
	
	public void cancelarReserva(Reserva reserva) {
		if(reserva.esCancelable()) {
			this.reservas.remove(reserva);
		}
	}
	
	public double dineroGenerado (DateLapse periodo) {
		if (this.reservas != null) {
			return this.reservas.stream().filter(r -> r.getPeriodo().overlaps(periodo)).mapToDouble(r -> r.calcularPrecio( this.precio )).sum();
		}
		return 0;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	protected List<Reserva>getReservas(){
		return this.reservas;
	}
}
