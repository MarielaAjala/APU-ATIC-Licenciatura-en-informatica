package ar.edu.unlp.info.oo1.ejercicio15distribuidoraelectrica;

import java.time.LocalDate;

public class Factura {
	private Usuario titular;
	private Consumo ultimoConsumoFacturado;
	private Consumo consumoActual;
	private LocalDate fechaDeEmision;
	private double montoFinal;
	private CuadroTarifario cuadroTarifario;
	public Factura(Usuario titular, Consumo ultimoConsumoFacturado, Consumo consumoActual, CuadroTarifario cuadroTarifario) {
		this.titular = titular;
		this.ultimoConsumoFacturado = ultimoConsumoFacturado;
		this.consumoActual = consumoActual;
		this.fechaDeEmision = LocalDate.now();
		this.cuadroTarifario=cuadroTarifario;
		this.setMontoFinal();
	}
	private int bonificacion() {
		if(this.factorDePotencia()>0.80)return 10;
		else return 0;
	}
	private double factorDePotencia() {
		return (this.ultimoConsumoFacturado.getEnergiaActiva_Kwh()/Math.sqrt(Math.pow(this.ultimoConsumoFacturado.getEnergiaActiva_Kwh(), 2)+(Math.pow(this.ultimoConsumoFacturado.getEnergiaReactiva_Kvarh(), 2))));
	}
	protected void setMontoFinal() {
		double parcial = this.consumoActual.getEnergiaActiva_Kwh()*this.cuadroTarifario.getPrecioKwh();
		this.montoFinal= (parcial)-(parcial*this.bonificacion()/100);
	}
	public double getMontoFinal() {
		return this.montoFinal;
	}
}
