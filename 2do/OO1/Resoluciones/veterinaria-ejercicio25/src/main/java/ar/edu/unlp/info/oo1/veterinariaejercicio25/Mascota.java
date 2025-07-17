package ar.edu.unlp.info.oo1.veterinariaejercicio25;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Mascota {
	private String nombre,especie;
	private LocalDate fechaNacimiento;
	private List<ServicioVeterinario> servicios;
	public Mascota (String nombre,LocalDate fechaNacimiento, String especie) {
		this.nombre=nombre;
		this.fechaNacimiento=fechaNacimiento;
		this.especie=especie;
		this.servicios = new ArrayList<ServicioVeterinario>();
	}
	public void agregarServicio(ServicioVeterinario servicio) {
		this.servicios.add(servicio);
	}
	
	public int cantServicios() {
		return this.servicios.size();
	}
	public double recaudacionFecha(LocalDate fecha) {
		return this.servicios.stream().filter(s->s.getFecha().equals(fecha)).mapToDouble(s->s.costoServicio()).sum();
	}
}
