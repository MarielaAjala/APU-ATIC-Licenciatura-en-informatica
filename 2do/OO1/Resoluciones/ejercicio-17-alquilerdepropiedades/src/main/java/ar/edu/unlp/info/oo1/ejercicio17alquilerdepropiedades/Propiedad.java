package ar.edu.unlp.info.oo1.ejercicio17alquilerdepropiedades;

public class Propiedad {
	private String direccion;
	private String nombreDescriptivo;
	public Propiedad(String direccion, String nombreDescriptivo) {
		this.direccion = direccion;
		this.nombreDescriptivo = nombreDescriptivo;
	}
	public String getDireccion() {
		return direccion;
	}
	public String getNombreDescriptivo() {
		return nombreDescriptivo;
	}
}
