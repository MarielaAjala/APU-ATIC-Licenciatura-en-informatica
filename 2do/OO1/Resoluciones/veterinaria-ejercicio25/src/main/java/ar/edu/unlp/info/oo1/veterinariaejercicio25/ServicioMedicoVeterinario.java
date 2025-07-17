package ar.edu.unlp.info.oo1.veterinariaejercicio25;

public abstract class ServicioMedicoVeterinario extends ServicioVeterinario{
	private Medico medico;
	public ServicioMedicoVeterinario(Medico medico) {
		super(); //Inicializa fecha
		this.medico=medico;
	}
	public Medico getMedico() {
		return this.medico;
	}
	public double getHonorariosMedicos() {
		return this.medico.getHonorariosPorAtencion();
	}
	
	public double costoServicio() {
		return this.getHonorariosMedicos() + cargosAdicionales();
	}
	
	public abstract double cargosAdicionales();
	
	public abstract double descartables ();
}
