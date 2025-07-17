package ar.edu.unlp.info.oo1.ejercicio14datelapse;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;


public class DateLapse implements DateLapseInterface {
	private LocalDate from;
	private LocalDate to;
	public DateLapse(LocalDate from,LocalDate to) {
		if (from.isBefore(to)) {
			this.from = from;
			this.to = to;
		} else {
			this.from = to;
			this.to = from;
		}
	}

	public LocalDate getFrom() {
		return from;
	}
	public LocalDate getTo() {
		return to;
	}
	public int sizeInDays() {
		//o Period.between(getFrom(), getTo()).getDays()
		return (int) this.getFrom().until(this.getTo(),ChronoUnit.DAYS);
	}
	public boolean includesDate(LocalDate other) {
		return ( ! other.isBefore(this.getFrom()))
				&&
				( ! other.isAfter(this.getTo()) );
	}
	public boolean overlaps(DateLapse dl) {
		return (this.includesDate(dl.getFrom())	||	this.includesDate(this.getTo()))
				//this incluye inicio o fin de dl -> se superponen
				&&
				( ! this.getTo().equals(dl.getFrom()));
				//Pero tengo que chequear > que mi periodo de tiempo no termine en el momento de inicio del otro
				//o sea, que no termine this y el mismo dia inicie dl -> serian sucesivos y no superpuestos
	}
	
}
