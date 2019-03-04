package Testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Race.AthleteGrabber;
import Race.AthleteObserver;
import Race.Observer;
import Race.Subject;

public class AthleteObserverTest {

	@Test
    public void testValidConstruction() throws Exception {   
		AthleteGrabber athleteGrabber = new AthleteGrabber();		
		AthleteObserver observer = new AthleteObserver(athleteGrabber); 
    }

	
	@Test
    public void testUpdate()  {   
		AthleteGrabber athleteGrabber = new AthleteGrabber();
		AthleteObserver observer = new AthleteObserver(athleteGrabber);
		
		observer.update(1234, "date", "first name", "last name", "male", 26);
		assertEquals(1234, observer.getBibNumber(), 0);
		assertSame("date", observer.getDateandTime());
		assertSame("first name", observer.getFirstName());
		assertSame("last name", observer.getLastName());
		assertSame("male", observer.getGender());
		assertEquals(26, observer.getBibNumber(), 0);
		
		observer.update(Integer.MAX_VALUE, "date", "first name", "last name", "male", 26);
		observer.update(Integer.MIN_VALUE, "date", "first name", "last name", "male", 26);
		observer.update(Integer.SIZE, "date", "first name", "last name", "male", 26);
		observer.update(Integer.BYTES, "date", "first name", "last name", "male", 26);
		
		observer.update(1234, "date", "first name", "last name", "male", Integer.MAX_VALUE);
		observer.update(1234, "date", "first name", "last name", "male", Integer.MIN_VALUE);
		observer.update(1234, "date", "first name", "last name", "male", Integer.SIZE);
		observer.update(1234, "date", "first name", "last name", "male", Integer.BYTES);
    }
	
	@Test
    public void testPrint()  {   
		AthleteGrabber athleteGrabber = new AthleteGrabber();
		AthleteObserver observer = new AthleteObserver(athleteGrabber);	
		observer.update(1234, "date", "first name", "last name", "male", 26);		
		observer.printTheAthletes();
    }
	
	@Test
    public void testUpdateCourse()  {   
		AthleteGrabber athleteGrabber = new AthleteGrabber();
		AthleteObserver observer = new AthleteObserver(athleteGrabber);			
		observer.updateCourse(432432, "rt4t43t", 432543);
    }
}
