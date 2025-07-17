package ar.edu.unlp.info.oo1.ejercicio7redalumbrado;

import java.util.ArrayList;
import java.util.List;

public class Farola {
private boolean on;
private List<Farola> vecinas;

public Farola() {
	this.on=false;
	this.vecinas = new ArrayList<Farola>();
}

public void pairWithNeighbor (Farola farola) {
	if(!vecinas.contains(farola)){
		this.vecinas.add(farola);
		farola.pairWithNeighbor(this);
	}
}

public List<Farola> getNeighbors (){
	//PREGUNTA > No seria buena practica retornar una copia de la lista
	//en lugar de la lista original? Para que no pueda ser modificada...
	return this.vecinas;
}

public void turnOn () {
	if(this.isOff()) {
		this.on = true;
		this.vecinas.stream().forEach(vecino -> vecino.turnOn());
	}
}

public void turnOff() {
	if(this.isOn()) {
		this.on=false;
		this.vecinas.stream().forEach(vecino -> vecino.turnOff());
	}
}

public boolean isOn() {
	return this.on;
}

public boolean isOff() {
	return !this.isOn();
}
}
