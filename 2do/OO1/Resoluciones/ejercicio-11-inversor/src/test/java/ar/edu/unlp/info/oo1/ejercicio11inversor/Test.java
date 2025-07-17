package ar.edu.unlp.info.oo1.ejercicio11inversor;

import java.time.LocalDate;
import java.time.temporal.*;
import java.util.HashMap;
import java.util.Map;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		LocalDate fechaAntigua =  LocalDate.of(2024,10,30);
//		LocalDate fechaInicio =  LocalDate.of(1972,12,15);
//		//LocalDate fechaIntermedia =  LocalDate.of(2024,10,30);
//		LocalDate fechaPosterior =  LocalDate.of(2032,12,15);
//		long dias = ChronoUnit.DAYS.between(LocalDate.now(),fechaAntigua );
//		long dias2=fechaAntigua.until(LocalDate.now(), ChronoUnit.DAYS);
//		long diasNeg=LocalDate.now().until(fechaAntigua, ChronoUnit.DAYS);
//		System.out.println("Hoy es: "+LocalDate.now());
//		System.out.println("La diferencia en dias entre hoy y fechaAntigua es: "+Math.abs(dias));//28
//		System.out.println("La diferencia en dias entre hoy y fechaAntigua es: "+dias2);//28
//		System.out.println("La diferencia en dias entre fechaAntigua yhoy es: "+diasNeg);//-28
//		long meses=fechaAntigua.until(LocalDate.now(), ChronoUnit.MONTHS);
//		long mesesNeg=LocalDate.now().until(fechaAntigua, ChronoUnit.MONTHS);
//		System.out.println("La diferencia en meses entre hoy y fechaAntigua es: "+meses);//0
//		System.out.println("La diferencia en meses entre fechaAntigua yhoy es: "+mesesNeg);//0
//		//System.out.println("La diferencia en dias entre fechaAntigua y hoy es: "+(fechaAntigua.compareTo(LocalDate.now())));
//		long anios=fechaAntigua.until(LocalDate.now(), ChronoUnit.YEARS);//0
//		long aniosNeg=LocalDate.now().until(fechaAntigua, ChronoUnit.YEARS);//0
//		System.out.println("La diferencia en meses entre hoy y fechaAntigua es: "+anios);
//		System.out.println("La diferencia en meses entre fechaAntigua yhoy es: "+aniosNeg);
//		boolean booleano = (fechaInicio.until(LocalDate.now(),ChronoUnit.DAYS)>=0)&&(LocalDate.now().until(fechaPosterior,ChronoUnit.DAYS)>=0);
//		System.out.println("La fecha de hoy se encuentra entre 15/12/1972 y 15/12/2032 > "+booleano);
//		System.out.println("Diferencia en dias entre 15/12/1972 y 15/12/2032: "+fechaInicio.until(fechaPosterior, ChronoUnit.DAYS));
		Map<String,Integer> mapa = new HashMap<String,Integer>();
		mapa.put("Lionel Messi", 111);
		mapa.put("Gabriel Batistuta", 56);
		mapa.put("Kun Agüero", 42);
		mapa.remove("Kun Agüero");
		mapa.replace("Lionel Messi",111,112);
		mapa.put("Gabriel Batistuta", 57);
		int totalGoles=0;
		mapa.remove("Alias");
		for(Map.Entry<String,Integer> par: mapa.entrySet()) {
			System.out.println(par.getKey()+"-"+par.getValue());;
			totalGoles+=par.getValue();
		}
		System.out.println(totalGoles);
	}

}
