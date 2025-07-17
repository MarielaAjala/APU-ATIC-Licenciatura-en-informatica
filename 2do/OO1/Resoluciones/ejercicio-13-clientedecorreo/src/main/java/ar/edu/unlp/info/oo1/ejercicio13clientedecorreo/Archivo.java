package ar.edu.unlp.info.oo1.ejercicio13clientedecorreo;

public class Archivo {
	private String nombre;
	public Archivo(String nombre) {
		this.nombre=nombre;
	}
	public String getNombre() {
		return this.nombre;
	}
	public int size() {
		return this.getNombre().length();
	}
	public int espacioOcupado() {
		return this.size();
	}
}
