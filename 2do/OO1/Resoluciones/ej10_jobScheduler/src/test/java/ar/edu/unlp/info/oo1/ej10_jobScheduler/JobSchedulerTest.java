package ar.edu.unlp.info.oo1.ej10_jobScheduler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JobSchedulerTest {
    protected JobDescription firstJob;
    protected JobDescription highestPriorityJob;
    protected JobDescription mostEffortJob;
    protected JobDescription lastJob;
    FIFOscheduler fifo;
    LIFOscheduler lifo;
    HighestPriorityScheduler highest;
    MostEffortScheduler most;

    private void initializeJobs(JobScheduler aJobScheduler) {
        firstJob = new JobDescription (1, 1, "Este es el primero");
        highestPriorityJob = new JobDescription (1, 100, "Este es el de más prioridad");
        mostEffortJob = new JobDescription (100, 1, "Este es el de más esfuerzo");
        lastJob = new JobDescription (1, 1, "Este es el último");
        this.scheduleJobsIn(aJobScheduler);
    }

    @BeforeEach
    void setUp() {
        fifo = this.newFifoScheduler();
        lifo = this.newLifoScheduler();
        highest = this.newPriorityScheduler();
        most = this.newEffortScheduler();
        this.initializeJobs(fifo);
        this.initializeJobs(lifo);
        this.initializeJobs(highest);
        this.initializeJobs(most);
    }

    private FIFOscheduler newFifoScheduler() {
        return new FIFOscheduler();
    }

    private LIFOscheduler newLifoScheduler() {
        return new LIFOscheduler();
    }

    private HighestPriorityScheduler newPriorityScheduler() {
        return new HighestPriorityScheduler();
    }

    private MostEffortScheduler newEffortScheduler() {
        return new MostEffortScheduler();
    }

    private void scheduleJobsIn(JobScheduler aJobScheduler) {
        aJobScheduler.schedule(firstJob);
        aJobScheduler.schedule(highestPriorityJob);
        aJobScheduler.schedule(mostEffortJob);
        aJobScheduler.schedule(lastJob);
    }

    @Test
    void testSchedule() {
        JobScheduler aScheduler = new HighestPriorityScheduler();
        aScheduler.schedule(highestPriorityJob);
        assertTrue(aScheduler.getJobs().contains(highestPriorityJob));
    }

    @Test
    void testUnschedule() {
        JobScheduler aScheduler = new HighestPriorityScheduler();
        this.scheduleJobsIn(aScheduler);
        aScheduler.unSchedule(firstJob);
        assertFalse(aScheduler.getJobs().contains(firstJob));
    }

    @Test
    void testNext() {
        JobDescription nextFifo = fifo.next();
        assertTrue(nextFifo.equals(firstJob));
        System.out.println(nextFifo.getDescription());
        assertEquals(3, fifo.getJobs().size());

        JobDescription nextLifo = lifo.next();
        assertTrue(nextLifo.equals(lastJob));
        System.out.println(nextLifo.getDescription());
        assertEquals(3, lifo.getJobs().size());

        JobDescription nextHighest = highest.next();
        assertTrue(nextHighest.equals(highestPriorityJob));
        System.out.println(nextHighest.getDescription());
        assertEquals(3, highest.getJobs().size());

        JobDescription nextMost = most.next();
        assertTrue(nextMost.equals(mostEffortJob));
        System.out.println(nextMost.getDescription());
        assertEquals(3, most.getJobs().size());
    }
}
