package ar.edu.unlp.info.oo1.ejercicio11inversor;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo implements Inversion{
	private LocalDate fechaDeConstitucion;
	private double montoDepositado;
	private double porcentajeDeInteresDiario;

	public PlazoFijo(double montoDepositado,double porcentajeDeInteresDiario) {
		this.montoDepositado = montoDepositado;
		this.porcentajeDeInteresDiario = porcentajeDeInteresDiario;
		this.fechaDeConstitucion = LocalDate.of(2024,10,31); //Harcodeo fecha vieja para poder testear
	}
	public LocalDate getFechaDeConstitucion() {
		return fechaDeConstitucion;
	}
	public double getMontoDepositado() {
		return montoDepositado;
	}
	public double getPorcentajeDeInteresDiario() {
		return porcentajeDeInteresDiario;
	}

	public double valorActual() {
		LocalDate  hoy = LocalDate.now();
		long dias = Math.abs(ChronoUnit.DAYS.between(fechaDeConstitucion,hoy));
		return this.montoDepositado * dias * this.porcentajeDeInteresDiario / 100;
	}
}
