package ar.edu.unlp.info.oo1.ejercicio24poolcar;

public class Conductor extends Usuario{
	private Vehiculo vehiculo;
	
	public Conductor(String nombre,Vehiculo vehiculo) {
		super(nombre);
		this.vehiculo=vehiculo;
	}
	
	public double bonificacion(double monto) {
		return(this.vehiculo.porcentajeValorMercado(0.001) * monto);
	}
	
	public double comision(double monto) {
		double comision = (monto + this.saldo) * 0.01; //Asumo que la comision es sobre (monto + saldo previo)
		if(!this.vehiculo.antiguedadMenorA5anios()) {
			comision *= 10; 
		}
		return comision;
	}
}
