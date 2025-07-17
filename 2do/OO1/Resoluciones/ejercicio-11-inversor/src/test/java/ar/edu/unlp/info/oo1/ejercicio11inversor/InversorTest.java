package ar.edu.unlp.info.oo1.ejercicio11inversor;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class InversorTest {
	private Inversor inversor1,inversor2;
	PlazoFijo pf1;
	PlazoFijo pf2;
	InversionEnAcciones acc1;
	PlazoFijo pf3;
	InversionEnAcciones acc2;
	PlazoFijo pf4;

	@BeforeEach
	void setUp () {
		inversor1 = new Inversor("Juan");
		inversor2 = new Inversor("Pedro");
		pf1 = new PlazoFijo(10000,1);
		acc1 = new InversionEnAcciones ("Leliq",10,10);
		pf2 = new PlazoFijo(1000, 1);
		inversor1.agregarInversion(pf1);	
		inversor1.agregarInversion(acc1);
		inversor1.agregarInversion(pf2);
		
		pf3 = new PlazoFijo(100000,1);
		acc2 = new InversionEnAcciones ("AL30",10,30);
		pf4 = new PlazoFijo(2000, 0.5);
		inversor2.agregarInversion(acc2);
		inversor2.agregarInversion(pf3);	
		inversor2.agregarInversion(pf4);
	}
	@Test
	void testValorActual () {
		assertEquals(100 + (11000 * Math.abs(ChronoUnit.DAYS.between(LocalDate.now(), pf1.getFechaDeConstitucion())) * pf1.getPorcentajeDeInteresDiario() / 100),inversor1.valorActual());
		assertEquals(300 + (100000 * Math.abs(ChronoUnit.DAYS.between(LocalDate.now(), pf3.getFechaDeConstitucion())) * pf3.getPorcentajeDeInteresDiario() / 100) +
						(2000 * Math.abs(ChronoUnit.DAYS.between(LocalDate.now(), pf4.getFechaDeConstitucion())) * pf4.getPorcentajeDeInteresDiario() / 100)
				,inversor2.valorActual());
	}
}
