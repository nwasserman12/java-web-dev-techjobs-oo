package org.launchcode.techjobs_oo.Tests;


import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    Job test_jobId1;
    @Before
    public void createFirstJobObject(){
        test_jobId1 = new Job();
    }

    Job test_jobId2;
    @Before
    public void createSecondJobObject(){
       test_jobId2 = new Job();
    }

    Job test_job;
    @Before
    public void createJobObject(){
        test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Test
    public void testSettingJobId(){
        assertFalse(test_jobId1.getId() == test_jobId2.getId());
        assertTrue((test_jobId2.getId() - test_jobId1.getId()) == 1);
    }
    @Test
    public void testSettingJobName(){
        assertEquals("Product tester", test_job.getName());
    }
    @Test
    public void testSettingJobEmployer(){
        assertTrue(test_job.getEmployer() instanceof Employer);
//        assertEquals("ACME", test_job.getEmployer());
    }
    @Test
    public void testSettingJobLocation(){
        assertTrue(test_job.getLocation() instanceof Location);
//        assertEquals("Desert", test_job.getLocation());
    }
    @Test
    public void testSettingJobPositionType(){
        assertTrue(test_job.getPositionType() instanceof PositionType);
//        assertEquals("Quality control", test_job.getPositionType());
    }
    @Test
    public void testSettingJobCoreCompetency(){
        assertTrue((test_job.getCoreCompetency() instanceof CoreCompetency));
//        assertEquals("Persistence", test_job.getCoreCompetency());
    }
    @Test
    public void testJobsForEquality(){
        Job test_jobNewId = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(test_job.getId() == test_jobNewId.getId());
    }
    @Test
    public void testToString(){

    }
}
