package ar.edu.unlp.info.oo1.ejercicio15distribuidoraelectrica;

public class Domicilio {
private String calle,depto,ciudad,provincia; 
private int altura, piso;
public Domicilio(String calle,int altura,String ciudad,String provincia) {
	this.calle=calle.toUpperCase();
	this.altura=altura;
	this.ciudad=ciudad.toUpperCase();
	this.provincia=provincia.toUpperCase();
}
public Domicilio(String calle,int altura,int piso,String depto,String ciudad,String provincia) {
	this(calle,altura,ciudad,provincia);
	this.piso=piso;
	this.depto=depto.toUpperCase();;
}
public Domicilio(String calle,int altura) {
	this.calle=calle;
	this.altura=altura;
}
public Domicilio() {
}

public String getCalle() {
	return calle;
}
public int getAltura() {
	return altura;
}
public String getDepto() {
	return depto;
}
public String getCiudad() {
	return ciudad;
}
public String getProvincia() {
	return provincia;
}
public int getPiso() {
	return piso;
}
protected void setCalle(String calle) {
	this.calle = calle.toUpperCase();
}
protected void setAltura(int altura) {
	this.altura = altura;
}
protected void setDepto(String depto) {
	this.depto = depto.toUpperCase();
}
protected void setCiudad(String ciudad) {
	this.ciudad = ciudad.toUpperCase();
}
protected void setProvincia(String provincia) {
	this.provincia = provincia.toUpperCase();
}
protected void setPiso(int piso) {
	this.piso = piso;
}

}
