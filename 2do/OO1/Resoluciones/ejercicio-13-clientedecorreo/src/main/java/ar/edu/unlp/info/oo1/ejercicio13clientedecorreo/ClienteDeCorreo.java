package ar.edu.unlp.info.oo1.ejercicio13clientedecorreo;

import java.util.ArrayList;
import java.util.List;

public class ClienteDeCorreo {
	private String nombre;
	private Carpeta inbox;
	private List<Carpeta> carpetas;
	
	public ClienteDeCorreo(String nombre) {
		this.setNombre(nombre);
		inbox=new Carpeta("Inbox");
		carpetas=new ArrayList<Carpeta>();
	}
	public Carpeta crearCarpeta(String nombre) {
		Carpeta carpetaNueva=new Carpeta(nombre);
		this.carpetas.add(carpetaNueva);
		return carpetaNueva;
	}
	public void agregarEnCarpeta(Email email,Carpeta carpeta) {
		//if (this.carpetas.contains(carpeta)) {
			carpeta.agregarCorreo(email);
			//si no verifico nada es PASAMANOS, porque recibis un objeto por parametro y solamente delegas en el una accion. Pdoria entonces hacerla él directamente
		//}
	}
	public void recibir(Email email) {
		this.inbox.agregarCorreo(email);
	}
	public List<Carpeta> getCarpetas(){
		List<Carpeta> todas= carpetas;
		todas.add(inbox);
		return todas;
	}
	public List<Email> getInboxMails(){
		return this.inbox.getEmails();
	}
	public List<Email> buscar(String texto) {
		List<Email> resultado = new ArrayList<Email>();
		//resultado.addAll(this.inbox.buscar(texto));
		//this.getCarpetas().stream().flatMap(carpeta -> carpeta.buscar(texto).stream()).toList();
		
		this.getCarpetas().forEach(carpeta->resultado.addAll(carpeta.buscar(texto)));
		return resultado;
	}
	public String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int espacioOcupado() {
		//this.inbox.espacioOcupado()+
		return this.getCarpetas().stream().mapToInt(carpeta->carpeta.espacioOcupado()).sum();
	}
}
