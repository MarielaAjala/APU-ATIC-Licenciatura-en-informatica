package ar.edu.unlp.info.oo1.ejercicio12volumenysuperficie;

public class Cilindro extends Pieza {
	private Integer radio,altura;

	public Integer getRadio() {
		return radio;
	}
	
	public Cilindro(Integer radio,Integer altura,String color,String material) {
		super(material,color);
		this.setRadio(radio);
		this.setAltura(altura);
	}
	private void setRadio(Integer radio) {
		this.radio = radio;
	}

	public Integer getAltura() {
		return altura;
	}

	private void setAltura(Integer altura) {
		this.altura = altura;
	}

	@Override
	public double getVolumen() {
		return Math.PI * Math.pow(this.getRadio(),2) * this.getAltura();
	}

	@Override
	public double getSuperficie() {
		return (2 * Math.PI * this.getRadio() * this.getAltura()) + (2 * Math.PI * Math.pow(this.getRadio(),2));
	}
	
}
