package ar.edu.unlp.info.oo1.parcial1rafechaaprobado1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EventoPresencial extends Evento{
	private List<Sede> sedes;
	public EventoPresencial(String nombre,LocalDate fecha,String tema,double precioInscripcion,double precioRemera,Sede sede) {
		super(nombre,fecha,tema,precioInscripcion,precioRemera);
		this.sedes=new ArrayList<Sede>();
		this.sedes.add(sede);
	}
	public void agregarSede(Sede sede) {
		this.sedes.add(sede);
	}
	protected double getCargosAdicionales() {
		return this.sedes.stream().mapToDouble(sede->sede.getCostoEstadia()).sum();
	}
}
