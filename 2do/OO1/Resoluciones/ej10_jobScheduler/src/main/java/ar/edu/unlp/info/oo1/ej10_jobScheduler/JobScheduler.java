package ar.edu.unlp.info.oo1.ej10_jobScheduler;

import java.util.ArrayList;
import java.util.List;

public abstract class JobScheduler{
    protected List<JobDescription> jobs;

    public JobScheduler () {
        this.jobs = new ArrayList<JobDescription>();
    }

    public void schedule(JobDescription job) {
        this.jobs.add(job);
    }

    public void unSchedule(JobDescription job){
        this.jobs.remove(job);
    }

    public List<JobDescription> getJobs(){
        return jobs;
    }

    public abstract JobDescription next();
}
