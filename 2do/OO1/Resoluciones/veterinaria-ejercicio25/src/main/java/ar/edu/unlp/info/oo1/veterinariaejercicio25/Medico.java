package ar.edu.unlp.info.oo1.veterinariaejercicio25;

import java.time.LocalDate;
import java.time.Period;

public class Medico {
	private String nombre;
	private LocalDate fechaIngreso;
	private double honorariosPorAtencion;
	public Medico (String nombre,LocalDate fechaIngreso,double honorariosPorAtencion) {
		this.nombre=nombre;
		this.fechaIngreso=fechaIngreso;
		this.honorariosPorAtencion=honorariosPorAtencion;
	}
	public LocalDate getFeechaIngreso() {
		return this.fechaIngreso;
	}
	public double getHonorariosPorAtencion() {
		return this.honorariosPorAtencion;
	}
	public int getAniosAntiguedad() {
		return Period.between(fechaIngreso, LocalDate.now()).getYears();
	}
}
