package ar.edu.unlp.info.oo1.ejercicio11inversor;

import java.util.ArrayList;
import java.util.List;

public class Inversor {
	private String nombre;
	private List<Inversion> inversiones;
	public Inversor(String nombre) {
		this.nombre = nombre;
		this.inversiones = new ArrayList<Inversion>();
	}
	public void agregarInversion(Inversion i) {
		this.inversiones.add(i);
	}
	public String getNombre() {
		return nombre;
	}
	public double valorActual() {
		return this.inversiones.stream().mapToDouble(t->t.valorActual()).sum();
	}
}
