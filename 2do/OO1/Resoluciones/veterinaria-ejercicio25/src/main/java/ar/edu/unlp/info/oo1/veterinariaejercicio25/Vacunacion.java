package ar.edu.unlp.info.oo1.veterinariaejercicio25;

public class Vacunacion extends ServicioMedicoVeterinario{
	private String nombreVacuna;
	private double costo;
	public Vacunacion(Medico medico,String nombreVacuna,double costo) {
		super(medico);
		this.nombreVacuna = nombreVacuna;
		this.costo=costo;
	}
	public double cargosAdicionales() {
		return this.plusDomingo() + this.descartables() + this.costo;
	}
	public String getNombreVacuna() {
		return nombreVacuna;
	}
	public double getCosto() { //Hice getters para sacar warning
		return costo;
	}
	public double descartables () {
		return 500;
	}
}
