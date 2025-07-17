package ar.edu.unlp.info.oo1.ejercicio9cuenta;

	public class CajaDeAhorro extends Cuenta{
		
	protected boolean puedeExtraer(double monto) {
		return this.getSaldo()>=(monto*1.02);
	}
	@Override
	public void depositar(double monto) {
		super.depositar(monto*.98);
	}
	@Override
	public boolean extraer(double monto) {
		return super.extraer(fondosNecesarios(monto));
	}
	@Override
	public boolean transferirACuenta(double monto,Cuenta cuentaDestino) {
		if (super.extraer(fondosNecesarios(monto))) {
			cuentaDestino.depositar(monto);
			return true;
		}
		return false;
	}
	private double fondosNecesarios(double monto) {
		return monto*1.02;
	}
}
