package ar.edu.unlp.info.oo1.ejercicio17alquilerdepropiedades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import ar.edu.unlp.info.oo1.ejercicio14datelapse.DateLapse;

public class Usuario {
	private String nombre;
	private String DNI;
	private String direccion;
	private List<PropiedadEnAlquiler> propiedades;
	
	public Usuario(String nombre, String dNI, String direccion) {
		this.nombre = nombre;
		this.DNI = dNI;
		this.direccion = direccion;
	}
	
	public Usuario(String nombre, String dNI, String direccion, List<PropiedadEnAlquiler> propiedades) {
		this(nombre,dNI,direccion);
		this.propiedades=propiedades;
	}
	
	public void agregarPropiedad(PropiedadEnAlquiler propiedad) {
		this.propiedades.add(propiedad);
	}
	protected List<PropiedadEnAlquiler>  getPropiedades() {
		return this.propiedades;
	}
	
	public double ingresos(DateLapse periodo) {
		if ( this.propiedades != null) {
			return this.propiedades.stream().mapToDouble( p -> p.dineroGenerado (periodo)).sum() * 0.75 ;
		}
		return 0;
	}

}
