package ar.edu.unlp.info.oo1.ejercicio13clientedecorreo;

import java.util.ArrayList;
import java.util.List;

public class Email {
	private String titulo;
	private String cuerpo;
	private List<Archivo> adjuntos;
	public Email(String titulo,String cuerpo) {
		this.titulo=titulo;
		this.cuerpo=cuerpo;
	}
	public Email(String titulo,String cuerpo,Archivo adjunto) {
		this(titulo,cuerpo);
		this.adjuntos=new ArrayList<Archivo>();
		this.adjuntos.add(adjunto);
	}
	public Email(String titulo,String cuerpo,List<Archivo> adjuntos) {
		this(titulo,cuerpo);
		this.adjuntos=new ArrayList<Archivo>();
		this.adjuntos.addAll(adjuntos);
	}
	public int size() {
		return this.getTitulo().length() + this.getCuerpo().length() + (this.getAdjuntos()!=null?this.getAdjuntos().stream().mapToInt(a->a.size()).sum():0);
	}
	public String getTitulo() {
		return titulo;
	}
	public String getCuerpo() {
		return cuerpo;
	}
	public List<Archivo> getAdjuntos() {
		return adjuntos;
	}
	public Email buscar(String texto) {
		if (this.getTitulo().contains(texto) || this.getCuerpo().contains(texto)) {
			return this;
		}
		else return null;
	}
	public int espacioOcupado() {
		return this.size();
	}
}
