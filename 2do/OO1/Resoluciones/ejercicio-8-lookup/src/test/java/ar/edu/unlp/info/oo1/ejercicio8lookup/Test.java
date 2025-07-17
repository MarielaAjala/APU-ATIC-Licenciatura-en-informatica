package ar.edu.unlp.info.oo1.ejercicio8lookup;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente alan = new Gerente("Alan Turing");
		double aportesDeAlan = alan.aportes();
		System.out.println("Aportes de Alan: "+aportesDeAlan);
		double sueldoBasicoDeAlan = alan.sueldoBasico();
		System.out.println("Sueldo basico: "+sueldoBasicoDeAlan);
	}

}
