package ar.edu.unlp.info.oo1.ejercicio14datelapse;

import java.time.LocalDate;

import ar.edu.unlp.info.oo1.ejercicio14datelapse.DateLapse;

//import ar.edu.unlp.info.oo1.ejercicio14datelapse.DateLapse;

public interface DateLapseInterface {
	
	public LocalDate getFrom();
	public LocalDate getTo();
	public int sizeInDays();
	public boolean includesDate(LocalDate other);
	public boolean overlaps(DateLapse dl);
}
