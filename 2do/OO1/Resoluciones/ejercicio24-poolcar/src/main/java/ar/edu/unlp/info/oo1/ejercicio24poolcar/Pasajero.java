package ar.edu.unlp.info.oo1.ejercicio24poolcar;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.Period;


public class Pasajero extends Usuario{
	private List<Viaje> misViajes;

	public Pasajero(String nombre) {
		super(nombre);
		this.misViajes = new ArrayList<Viaje>();
	}

	public void guardarViaje(Viaje viaje) {
		this.misViajes.add(viaje);
	}
	
	public double bonificacion(double monto) {
		double bonificacion = 0;
		if(this.misViajes.size()>0) {
			bonificacion = 500;
		}
		return bonificacion;
	}

	public double comision(double monto) {
		double comision = 0;
		boolean viajeReciente = (this.misViajes.stream().anyMatch( v -> (Period.between(v.getFechaViaje(),LocalDate.now()).getDays() <= 30)));
		if (! viajeReciente) {
			comision = monto * 0.1;
		}
		return comision;
	}
}
