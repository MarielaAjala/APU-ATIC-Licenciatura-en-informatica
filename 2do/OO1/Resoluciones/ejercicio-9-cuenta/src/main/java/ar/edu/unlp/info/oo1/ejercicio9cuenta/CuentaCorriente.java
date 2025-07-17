package ar.edu.unlp.info.oo1.ejercicio9cuenta;

public class CuentaCorriente extends Cuenta{
	private double limiteDescubierto;
	public CuentaCorriente() {
		super();
		this.limiteDescubierto=0;
	} 
	protected boolean puedeExtraer(double monto) {
		return (this.getSaldo()+this.getLimiteDescubierto())>=(monto);
	}
	public double getLimiteDescubierto() {
		return limiteDescubierto;
	}
	public void setLimiteDescubierto(double limiteDescubierto) {
		this.limiteDescubierto = limiteDescubierto;
	}

}
