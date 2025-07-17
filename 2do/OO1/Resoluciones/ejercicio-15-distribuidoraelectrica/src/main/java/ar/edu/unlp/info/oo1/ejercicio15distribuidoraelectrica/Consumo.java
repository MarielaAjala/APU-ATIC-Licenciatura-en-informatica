package ar.edu.unlp.info.oo1.ejercicio15distribuidoraelectrica;

public class Consumo {
	private double energiaActiva_Kwh;
	private double energiaReactiva_Kvarh;
	public Consumo(double energiaActiva,double energiaReactiva) {
		this.energiaActiva_Kwh=energiaActiva;
		this.energiaReactiva_Kvarh=energiaReactiva;
	}
	public double getEnergiaActiva_Kwh() {
		return energiaActiva_Kwh;
	}
	public double getEnergiaReactiva_Kvarh() {
		return energiaReactiva_Kvarh;
	}
	protected void setEnergiaActiva_Kwh(double energiaActiva_Kwh) {
		this.energiaActiva_Kwh = energiaActiva_Kwh;
	}
	protected void setEnergiaReactiva_Kvarh(double energiaReactiva_Kvarh) {
		this.energiaReactiva_Kvarh = energiaReactiva_Kvarh;
	}
	
}
