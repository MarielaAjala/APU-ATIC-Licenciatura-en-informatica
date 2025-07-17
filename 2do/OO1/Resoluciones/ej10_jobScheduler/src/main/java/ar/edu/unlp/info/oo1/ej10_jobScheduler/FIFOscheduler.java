package ar.edu.unlp.info.oo1.ej10_jobScheduler;

public class FIFOscheduler extends JobScheduler {
	public JobDescription next() {
		if (!this.jobs.isEmpty()) {
			JobDescription nextJob = this.jobs.remove(0);
			super.unSchedule(nextJob);
			return nextJob;
		}
		return null;
	}
}
