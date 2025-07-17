package ar.edu.unlp.info.oo1.ejercicio12volumenysuperficie;

public class PrismaRectangular extends Pieza{
	private Integer ladoMayor,ladoMenor,altura;
		
	public PrismaRectangular(Integer ladoMayor,Integer ladoMenor,Integer altura,String color,String material) {
		super(material,color);
		this.ladoMayor= ladoMayor; 
		this.ladoMenor =ladoMenor;
		this.altura= altura;	
	}

	public Integer getLadoMayor() {
		return ladoMayor;
	}

	public Integer getLadoMenor() {
		return ladoMenor;
	}

	public Integer getAltura() {
		return altura;
	}

	@Override
	public double getVolumen() {
		return this.ladoMayor * this.ladoMenor * this.altura;
	}

	@Override
	public double getSuperficie() {
		return 2 * (this.ladoMayor * this.ladoMenor + this.ladoMayor * this.altura + this.ladoMenor * this.getAltura());
	}

}
