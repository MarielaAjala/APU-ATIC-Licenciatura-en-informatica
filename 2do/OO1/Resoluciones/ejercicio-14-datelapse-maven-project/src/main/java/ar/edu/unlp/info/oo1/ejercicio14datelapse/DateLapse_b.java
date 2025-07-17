    package ar.edu.unlp.info.oo1.ejercicio14datelapse;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import ar.edu.unlp.info.oo1.ejercicio14datelapse.DateLapse;

//import ar.edu.unlp.info.oo1.ejercicio14datelapse.DateLapse;

public class DateLapse_b implements DateLapseInterface {
	private LocalDate from;
	private int sizeInDays;

	public DateLapse_b(LocalDate from,int sizeInDays) {
		this.from=from;
		this.sizeInDays=sizeInDays;
	}
	public LocalDate getFrom() {
		return this.from;
	}
	
	public int sizeInDays() {
		return this.sizeInDays;
	}
	public boolean includesDate(LocalDate other) {
		return (this.getFrom().until(other,ChronoUnit.DAYS)<=this.sizeInDays());
	}
	@Override
	public LocalDate getTo() {
		return this.getFrom().plusDays(sizeInDays);
	}
	public boolean overlaps(DateLapse dl) {
		return (this.includesDate(dl.getFrom())||this.includesDate(this.getTo()))
				&& ( ! this.getTo().equals ( dl.getFrom()) );
	}
}
