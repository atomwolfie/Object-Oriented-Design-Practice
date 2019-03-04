package Testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Race.AthleteGrabber;
import Race.AthleteObserver;
import Race.CourseObserver;
import Race.Observer;

public class ObserverTest {

	@Test
    public void testUpdate() throws Exception {   
		AthleteGrabber athleteGrabber = new AthleteGrabber();		
		Observer observer = new CourseObserver(athleteGrabber); 
		
		observer.update(1234, "date", "first name", "last name", "male", 26);
		observer.updateCourse(43243, "54543534", 342235);		
    }
	
	
	

}
