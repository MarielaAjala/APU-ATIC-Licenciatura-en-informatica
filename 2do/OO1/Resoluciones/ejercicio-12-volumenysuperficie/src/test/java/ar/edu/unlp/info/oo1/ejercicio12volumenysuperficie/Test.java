package ar.edu.unlp.info.oo1.ejercicio12volumenysuperficie;

import java.time.LocalDate;

public class Test {
	String color1="blanco",color2="azul",color3 = "violeta";
	String material1="cromo",material2="hierro",material3="acero inoxidable";
	Pieza pieza1 = new Cilindro(2,3,color1,material1);
	Pieza pieza2 = new Esfera(3,color2,material2);
	Pieza pieza3 = new PrismaRectangular(4,5,6,color3,material3);
	Pieza pieza4 = new Cilindro(3,4,color1,material1);
	
	Pieza pieza5 = new Esfera(4,color2,material2);
	Pieza pieza6 = new PrismaRectangular(7,8,9,color3,material3);
	Pieza pieza7 = new Cilindro(4,5,color1,material1);
	Pieza pieza8 = new Esfera(5,color2,material2);
	Pieza pieza9 = new PrismaRectangular(9,10,11,color3,material3);
	double totalMaterial1REPORTE1 = pieza1.getVolumen() + pieza4.getVolumen();
	double totalMaterial2REPORTE2 = pieza5.getVolumen() + pieza8.getVolumen();
	double totalColor1REPORTE1 = pieza1.getSuperficie() + pieza4.getSuperficie();
	double totalColor2REPORTE2 = pieza5.getSuperficie() + pieza8.getSuperficie();
	

public static void main(String[] args) {
	Test test = new Test();
	System.out.println("Total volumen material1 de reporte1: "+test.totalMaterial1REPORTE1);
	System.out.println("Total volumen material2 de reporte2: "+test.totalMaterial2REPORTE2);
	System.out.println("Total superficie color1 de reporte1: "+test.totalColor1REPORTE1);
	System.out.println("Total superficie color2 de reporte2: "+test.totalColor2REPORTE2);
}
}