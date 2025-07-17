package ar.edu.unlp.info.oo1.ejercicio12volumenysuperficie;

public class Esfera extends Pieza{
	private Integer radio;

	public Esfera(Integer radio,String color,String material) {
		super(material,color);
		this.radio=radio;
	}
	
	public Integer getRadio() {
		return radio;
	}

	protected void setRadio(Integer radio) {
		this.radio = radio;
	}

	@Override
	public double getVolumen() {
		return (4/3)* Math.PI * Math.pow(this.getRadio(),3);
	}

	@Override
	public double getSuperficie() {
		return 4 * Math.PI * Math.pow(this.getRadio(),2);
	}

}
