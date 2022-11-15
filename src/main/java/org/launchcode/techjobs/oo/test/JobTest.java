package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1, job2);

    }

    @Test
    public void testJobConstructorSetsAllFields() {
        //Job job3 = new Job();
        Job job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(job3.getName().toString(),"Product tester");
        assertEquals(job3.getEmployer().toString(),"ACME");
        assertEquals(job3.getLocation().toString(),"Desert");
        assertEquals(job3.getPositionType().toString(),"Quality control");
        assertEquals(job3.getCoreCompetency().toString(),"Persistence");
        assertTrue(job3 instanceof Job);
        assertTrue(job3.getEmployer() instanceof Employer);
        assertTrue(job3.getLocation() instanceof Location);
        assertTrue(job3.getPositionType() instanceof PositionType);
        assertTrue(job3.getCoreCompetency() instanceof  CoreCompetency);

    }
    @Test
    public void testJobsForEquality() {
        Job job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertNotEquals(job3, job4);
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String jobString = job3.toString();
        assertEquals(jobString.charAt(0),'\n');
        assertEquals(jobString.charAt(jobString.length()-1),'\n');
        //System.out.println(jobString.charAt(0));
    }


}
