package ar.edu.unlp.info.oo1.veterinariaejercicio25;

public class ConsultaMedica extends ServicioMedicoVeterinario{
	public ConsultaMedica(Medico medico) {
		super(medico);
	}
	public double cargosAdicionales() {
		return this.getMedico().getAniosAntiguedad()*100 + this.plusDomingo()+ this.descartables();
	}
	public double descartables () {
		return 300;
	}
}
