package ar.edu.unlp.info.oo1.ejercicio13clientedecorreo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Carpeta {
	private String nombre;
	private List<Email> emails;
	public Carpeta(String nombre) {
		this.nombre=nombre;
		emails = new ArrayList<Email>();
	}
	public String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int size() {
		return emails.stream().mapToInt(e->e.size()).sum();
	}
	public int espacioOcupado() {
		return this.size();
	}
	public void mover(Email email,Carpeta destino) {
		//ENUNCIADO DICE QUE SE ASUMA QUE EL MAIL ESTA EN LA CARPETA!!!!
		this.eliminarCorreo(email);
		destino.agregarCorreo(email);
	}
	public void eliminarCorreo(Email email) {
		this.emails.remove(email);
	}
	public void agregarCorreo(Email email) {
		this.emails.add(email);
	}
	public List<Email> getEmails(){
		return this.emails;
	}
	public List<Email> buscar(String texto) {
		List<Email> encontrados = this.getEmails().stream().filter(e->e.buscar(texto)!=null).collect(Collectors.toList());
		return encontrados;
	}
}
