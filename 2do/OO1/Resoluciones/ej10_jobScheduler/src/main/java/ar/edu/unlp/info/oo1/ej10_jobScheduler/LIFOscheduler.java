package ar.edu.unlp.info.oo1.ej10_jobScheduler;

public class LIFOscheduler extends JobScheduler{
	public JobDescription next() {
		if (!this.jobs.isEmpty()) {
			JobDescription nextJob = this.jobs.remove(this.jobs.size() - 1);
			this.unSchedule(nextJob);
			return nextJob;
		}
		return null;
	}
}
