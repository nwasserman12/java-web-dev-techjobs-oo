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
        assertEquals("ACME", test_job.getEmployer().getValue());
    }
    @Test
    public void testSettingJobLocation(){
        assertTrue(test_job.getLocation() instanceof Location);
        assertEquals("Desert", test_job.getLocation().getValue());
    }
    @Test
    public void testSettingJobPositionType(){
        assertTrue(test_job.getPositionType() instanceof PositionType);
        assertEquals("Quality control", test_job.getPositionType().getValue());
    }
    @Test
    public void testSettingJobCoreCompetency(){
        assertTrue((test_job.getCoreCompetency() instanceof CoreCompetency));
        assertEquals("Persistence", test_job.getCoreCompetency().getValue());
    }
    @Test
    public void testJobsForEquality(){
        Job test_jobNewId = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(test_job.getId() == test_jobNewId.getId());
    }
    @Test
    public void testToStringBlankSpaces(){
        String toString = test_job.toString();
        assertTrue(toString.contains("Id: "+ test_job.getId() + "\n"));
    }
    @Test
    public void testToStringHasLabelForEachOnOwnLine(){
        String toString = test_job.toString();
        assertTrue(toString.contains("Id: " + test_job.getId() + '\n' + "Name: " + test_job.getName()
                + '\n' + "Employer: " + test_job.getEmployer() +'\n' + "Location: " +
                test_job.getLocation() + '\n' + "Position Type: " +test_job.getPositionType()
                + '\n' + "Core Competency: " + test_job.getCoreCompetency() + '\n'));
    }
    @Test
    public void testToStringDataNotAvailable(){
        Job testJobMissingData = new Job("", new Employer(""), new Location("Location"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(testJobMissingData.toString(), "Id: 7" + "\n" + "Name: Data not available" + "\n" +
                "Employer: Data not available" + "\n" + "Location: Location" + "\n" + "Position Type: Quality control"
                +"\n" + "Core Competency: Persistence" + "\n");
    }

//    @Test(expected = IllegalArgumentException.class)
//    public void testToStringThrowsErrorOnlyId(){
//        test_jobId1.toString();
//        fail("OOPS! This job does not seem to exist.");
//    }
}
