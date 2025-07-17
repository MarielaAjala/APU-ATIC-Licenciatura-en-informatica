package ar.edu.unlp.info.oo1.parcial1rafechaaprobado1;

import java.time.LocalDate;

public class EventoVirtual extends Evento{
	private double costoEnvio;
	public EventoVirtual(String nombre,LocalDate fecha,String tema,double precioInscripcion,double precioRemera,double costoEnvio) {
		super(nombre,fecha,tema,precioInscripcion,precioRemera);
		this.costoEnvio=costoEnvio;
	}
	@Override
	protected double getCargosAdicionales() {
		return this.getCostoEnvio();
	}
	public double getCostoEnvio() {
		return costoEnvio;
	}
	
}
