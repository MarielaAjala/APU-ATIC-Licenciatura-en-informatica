package ar.edu.unlp.info.oo1.parcial1rafechaaprobado1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import ar.edu.unlp.info.oo1.ejercicio14datelapse.DateLapse;

public class Usuario {
	private String nombre;
	private List<Entrada> entradas;
	public Usuario(String nombre) {
		this.nombre=nombre;
		this.entradas= new ArrayList<Entrada>();
	}
	public Entrada comprarEntrada (Evento evento,boolean seguro) {
		Entrada entrada = new Entrada(evento,seguro);
		this.entradas.add(entrada);
		return entrada;
	}
	public double montoEntradasEnPeriodo(DateLapse dl) {
		return this.entradas.stream().filter(e->e.estaEnPeriodo(dl)).mapToDouble(e->e.getPrecio()).sum();
	}
	public Entrada entradaSiguienteEvento() {
		return this.entradas.stream().filter(e->e.getDiaHastaElEvento()>0).sorted((e1,e2)->e1.getFecha().compareTo(e2.getFecha())).limit(1).collect(Collectors.toList()).getFirst();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
