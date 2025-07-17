package ar.edu.unlp.info.oo1.ejercicio6mamifero;

import java.util.Date;

public class Mamifero {
	private String identificador;
	private String especie;
	private Date fechaNacimiento;
	private Mamifero padre, madre;
	
public Mamifero() {
}

public Mamifero(String identificador) {
	this.identificador = identificador;
}

public String getIdentificador() {
	return identificador;
}

public void setIdentificador(String identificador) {
	this.identificador = identificador;
}

public String getEspecie() {
	return especie;
}

public void setEspecie(String especie) {
	this.especie = especie;
}

public Date getFechaNacimiento() {
	return fechaNacimiento;
}

public void setFechaNacimiento(Date fechaNacimiento) {
	this.fechaNacimiento = fechaNacimiento;
}

public Mamifero getPadre() {
	return padre;
}

public void setPadre(Mamifero padre) {
	this.padre = padre;
}

public Mamifero getMadre() {
	return madre;
}

public void setMadre(Mamifero madre) {
	this.madre = madre;
}

//public boolean tieneComoAncestroA(Mamifero mamifero) {
//	return (mamifero==this.madre || mamifero==this.padre)||(this.madre!=null?this.madre.tieneComoAncestroA(mamifero):false)||(this.padre!=null?this.padre.tieneComoAncestroA(mamifero):false);
//}

private boolean tienePadre() {
	return this.getPadre()!=null;
}
private boolean tieneMadre() {
	return this.getMadre()!=null;
}



//private boolean tieneComoAncestroPaterno(Mamifero mamifero) {
//	if(this==mamifero){return true;}
//	else if (this.getPadre()!=null){
//		return this.getPadre().tieneComoAncestroMaterno(mamifero)||this.getPadre().tieneComoAncestroPaterno(mamifero);
//	}else return false;
//}
/// return  (mi padre =! null && recursion) || (mi madre =! null && recursion)

public Mamifero getAbuelaMaterna() {
	Mamifero ret=null;
	if(this.madre!=null) {
		ret = this.getMadre().getMadre();
	}
	return ret;
}

public boolean tieneComoAncestroA(Mamifero mamifero) {
	return(this!=mamifero)&&
			(this.tieneComoAncestroPaterno(mamifero)||
			 this.tieneComoAncestroMaterno(mamifero));
}
/// yo != mamifero && ((mi padre =! null && recursion) || (mi madre =! null && recursion))

private boolean tieneComoAncestroPaterno(Mamifero mamifero) { 
	return this.getPadre()==mamifero ||((this.getPadre()!=null) && this.getPadre().tieneComoAncestroA(mamifero));
}

private boolean tieneComoAncestroMaterno(Mamifero mamifero) {
	return this.getMadre()==mamifero || this.getMadre()!=null && this.getMadre().tieneComoAncestroA(mamifero);
}

public Mamifero getAbuelaPaterna() {
	Mamifero ret=null;
	if(this.padre!=null) {
		ret = this.getPadre().getMadre();
	}
	return ret;
}

public Mamifero getAbueloMaterno() {
	Mamifero ret=null;
	if(this.madre!=null) {
		ret = this.getMadre().getPadre();
	}
	return ret;
}

public Mamifero getAbueloPaterno() {
	Mamifero ret=null;
	if(this.padre!=null) {
		ret = this.getPadre().getPadre();
	}
	return ret;
}
}
