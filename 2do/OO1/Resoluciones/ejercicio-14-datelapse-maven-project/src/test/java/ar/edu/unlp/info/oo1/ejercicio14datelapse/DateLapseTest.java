package ar.edu.unlp.info.oo1.ejercicio14datelapse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DateLapseTest {
	
	DateLapseInterface lapse,lapseb;
	@BeforeEach
	void setUp() {
		LocalDate from = LocalDate.of(1972,12,15);
		LocalDate to =  LocalDate.of(2032,12,15);
		lapse = new DateLapse(from,to);
		int days = lapse.sizeInDays();
		lapseb = new DateLapse_b(from, days);
	}
	@Test
	public void sizeInDaysTest() {
		assertEquals(21915,lapse.sizeInDays());
		assertEquals(21915,lapseb.sizeInDays());
		DateLapse lapse_ = new DateLapse(LocalDate.now(),LocalDate.now());
		assertEquals(0,lapse_.sizeInDays());
	}
	@Test
	public void includesDateTest() {
		assertTrue(lapse.includesDate(LocalDate.now()));
		assertTrue(lapseb.includesDate(LocalDate.now()));
		DateLapse lapse2 = new DateLapse(LocalDate.now(),LocalDate.now());
		assertTrue(lapse2.includesDate(LocalDate.of(2025,06,16))); //OJO QUE LA FECHA DEL DIA DEL TEST ESTA HARDCODEADA!!!
		//ENTONCES, SI NO SE RETOCA CON CADA EJECUCION DA ROJOOOO!!!!
		assertTrue(lapse2.includesDate(LocalDate.now()));
		assertFalse(lapse2.includesDate(LocalDate.of(2024,11,28)));
	}
}
