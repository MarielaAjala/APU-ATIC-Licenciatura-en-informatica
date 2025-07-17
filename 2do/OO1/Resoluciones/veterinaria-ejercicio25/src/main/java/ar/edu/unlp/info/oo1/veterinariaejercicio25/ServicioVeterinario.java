package ar.edu.unlp.info.oo1.veterinariaejercicio25;

import java.time.LocalDate;

public abstract class ServicioVeterinario {
	private LocalDate fecha;
	public ServicioVeterinario() {
		this.fecha=LocalDate.now();
	}
	public LocalDate getFecha() {
		return this.fecha;
	}
	public abstract double costoServicio();
	public boolean esDomingo() {
		//return this.getFecha().getDayOfWeek().getValue()==7; //Forma usando primitivo
		Integer dia = this.getFecha().getDayOfWeek().getValue(); //Forma usando wrapper
		return dia.equals(7);
	}
	public double plusDomingo() {
		return (this.esDomingo()?200:0);//Forma corta y menos expresiva
//		double res = 0; 
//		if (this.esDomingo()) {
//			res = 200;
//		}
//		return res;
	}
}
