package ar.edu.unlp.info.oo1.ej10_jobScheduler;

public class HighestPriorityScheduler extends JobScheduler {
	public JobDescription next() {
		JobDescription next = this.jobs.stream()
				.max((j1, j2) -> Double.compare(j1.getPriority(), j2.getPriority()))
				.orElse(null);
		this.unSchedule(next);
		return next;
	}
}

