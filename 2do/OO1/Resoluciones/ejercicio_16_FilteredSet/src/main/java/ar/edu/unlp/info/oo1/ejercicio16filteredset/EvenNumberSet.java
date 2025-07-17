package ar.edu.unlp.info.oo1.ejercicio16filteredset;

import java.util.HashSet;
import java.util.Set;

public class EvenNumberSet {
	private Set <Integer> conjuntoDeNumerosPares;
	public EvenNumberSet() {
		this.conjuntoDeNumerosPares= new HashSet<Integer>();
	}
	public boolean add(Integer numero) {
		if(numero%2==0) {
			return this.conjuntoDeNumerosPares.add(numero);
		}
		return false;
	}
	public boolean contains(Integer numero) {
	return this.conjuntoDeNumerosPares.contains(numero);
}
}