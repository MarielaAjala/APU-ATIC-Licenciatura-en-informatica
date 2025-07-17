package ar.edu.unlp.info.oo1.ejercicio15distribuidoraelectrica;

public class CuadroTarifario {
	private double precioKwh;

	public CuadroTarifario(double precioKwh) {
		super();
		this.precioKwh = precioKwh;
	}

	public double getPrecioKwh() {
		return precioKwh;
	}

	protected void setPrecioKwh(double precioKwh) {
		this.precioKwh = precioKwh;
	}
	protected void cambiarPrecioKwh (double variacionPorcentual) {
		this.precioKwh*=variacionPorcentual;
	}
}
