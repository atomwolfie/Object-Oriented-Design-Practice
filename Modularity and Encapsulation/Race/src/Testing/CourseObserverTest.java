package Testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Race.AthleteGrabber;
import Race.AthleteObserver;
import Race.CourseGrabber;
import Race.CourseObserver;

public class CourseObserverTest {

	@Test
    public void testValidConstruction() throws Exception {   
		CourseGrabber courseGrabber = new CourseGrabber();		
		CourseObserver observer = new CourseObserver(courseGrabber); 
    }

	@Test
    public void testUpdate()  {   
		CourseGrabber courseGrabber = new CourseGrabber();		
		CourseObserver observer = new CourseObserver(courseGrabber);
		
		observer.updateCourse(1234, "date", 1234);
		assertEquals(1234, observer.getBibNumber(), 0);
		assertSame("date", observer.getDateandTime());
		assertEquals(1234, observer.getDistance(), 0);
		
		observer.updateCourse(Integer.MAX_VALUE, "date", 1234);
		observer.updateCourse(Integer.MIN_VALUE, "date", 1234);
		observer.updateCourse(Integer.SIZE, "date", 1234);
		observer.updateCourse(Integer.BYTES, "date", 1234);
		
		observer.updateCourse(1234, "date", Double.POSITIVE_INFINITY);
		observer.updateCourse(1234, "date", Double.NEGATIVE_INFINITY);
		observer.updateCourse(1234, "date", Double.NaN);
	}

	@Test
    public void testPrint()  {   
		CourseGrabber courseGrabber = new CourseGrabber();
		CourseObserver observer = new CourseObserver(courseGrabber);	
		observer.update(1234, "date", "first name", "last name", "male", 26);		
		observer.printCourses();
    }
	
}
