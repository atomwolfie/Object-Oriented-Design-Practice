package Testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Race.AthleteGrabber;
import Race.CourseGrabber;
import Race.CourseObserver;
import Race.Observer;
import Race.Subject;

public class CourseGrabberTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
    public void testValidConstruction() throws Exception {     
    	Subject courseGrabber = new CourseGrabber();
    }

	
	@Test
    public void testRegister() {
    	CourseGrabber courseGrabber = new CourseGrabber();	
		Observer observer = new CourseObserver(courseGrabber);   	
		courseGrabber.register(observer);   
    }
	
	 @Test
	    public void testUnregister() {
		 CourseGrabber courseGrabber = new CourseGrabber();		
			Observer observer = new CourseObserver(courseGrabber);
			courseGrabber.unregister(observer);   
	    }
	    
	    
	    @Test
	    public void testNotify() {
	    	CourseGrabber courseGrabber = new CourseGrabber();		
			courseGrabber.notifyObserver();
	    }
	    
	    
	    
	    public void testBib(){
	        	CourseGrabber courseGrabber = new CourseGrabber();
	        	courseGrabber.setBibNumber(Integer.MAX_VALUE);
	        	courseGrabber.setBibNumber(Integer.MIN_VALUE);
	        	courseGrabber.setBibNumber(Integer.SIZE);
	        	courseGrabber.setBibNumber(Integer.BYTES);
	        	courseGrabber.setBibNumber(5);
	        	assertEquals(5, courseGrabber.getBibNumber(), 0);
	      }
	      
	        
	      @Test
	        public void testDateAndTime(){
	    	  CourseGrabber courseGrabber = new CourseGrabber();	      	 
	    	  courseGrabber.setDateandTime("dwefwevwve");
	      	  assertSame("dwefwevwve", courseGrabber.getDateandTime());
	        }
	    
	    
	      public void testDistance(){
		        	CourseGrabber courseGrabber = new CourseGrabber();
		        	courseGrabber.setDistance(Double.POSITIVE_INFINITY);
		        	courseGrabber.setDistance(Double.NEGATIVE_INFINITY);
		        	courseGrabber.setDistance(Double.NaN);		        	
		        	courseGrabber.setDistance(5.26);
		        	assertEquals(5.26, courseGrabber.getDistance(), 0);
		      }
	    
	    
	    
	    
	    
}
