package Testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Race.AthleteGrabber;
import Race.AthleteObserver;
import Race.CourseGrabber;
import Race.Subject;

public class SubjectTest {

	//AthleteObserver observer = new AthleteObserver(athleteGrabber);
	
	@Test
    public void testValidConstruction() throws Exception {   
		Subject sub = new CourseGrabber(); 
		Subject sub1 = new AthleteGrabber(); 
    }
	
	@Test
    public void testRegister() {   
		Subject sub = new CourseGrabber(); 
		AthleteObserver observer = new AthleteObserver(sub);
		sub.register(observer);
    }
	
	@Test
    public void testUnRegister() {   
		Subject sub = new CourseGrabber(); 
		AthleteObserver observer = new AthleteObserver(sub);
		sub.unregister(observer);
    }
	
	@Test
    public void testNotify() {   
		Subject sub = new CourseGrabber(); 
		Subject sub1 = new AthleteGrabber();
		sub.notify();
		sub1.notify();
    }
	
}
