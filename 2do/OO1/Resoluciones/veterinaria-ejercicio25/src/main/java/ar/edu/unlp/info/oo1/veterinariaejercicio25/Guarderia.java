package ar.edu.unlp.info.oo1.veterinariaejercicio25;

public class Guarderia extends ServicioVeterinario{
	private Mascota mascota;
	private int cantDias;
	private double costoDiario;
	public Guarderia (int cantDias,Mascota mascota) {
		super();
		this.cantDias=cantDias;
		this.costoDiario=500;
		this.mascota=mascota;
	}
	public double porcentajeDescuentoCantServicios(Mascota mascota) {
		return (mascota.cantServicios()>=5?10:0)/100;
	}
	@Override
	public double costoServicio() {
		return ( 1- this.porcentajeDescuentoCantServicios(mascota) )*( this.costoDiario * this.cantDias) ;
	}
	
}
