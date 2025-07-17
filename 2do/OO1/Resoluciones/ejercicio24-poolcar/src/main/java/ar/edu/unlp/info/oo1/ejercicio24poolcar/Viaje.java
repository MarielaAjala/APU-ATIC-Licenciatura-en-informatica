package ar.edu.unlp.info.oo1.ejercicio24poolcar;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class Viaje {
	private String origen,destino;
	private double costoTotal;
	private LocalDate fechaViaje;
	private Vehiculo vehiculo;
	private List<Usuario> usuarios;
	
	public Viaje(String origen,String destino,double costo,LocalDate fecha,Vehiculo vehiculo) {
		this.origen=origen;
		this.destino=destino;
		this.costoTotal=costo;
		this.fechaViaje=fecha;
		this.vehiculo=vehiculo;
	}
	
	public LocalDate getFechaViaje () {
		return fechaViaje;
	}
	
	public boolean registrarPasajero(Pasajero p) {
		boolean registre = false;
		if(this.vehiculo.getCapacidad() > this.usuarios.size()) {
			if((Period.between(LocalDate.now(), fechaViaje).getDays() >= 2) &&(p.getSaldo() >= 0)) {
				this.usuarios.add(p);
				p.guardarViaje(this);
				registre = true;
			}
		}
		return registre;
	}
	
	public void procesarViaje() {
		this.usuarios.forEach(u -> u.abonarViaje(costoTotal / this.usuarios.size()));
	}
}
