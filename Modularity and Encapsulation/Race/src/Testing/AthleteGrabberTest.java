package Testing;

import static org.junit.Assert.*;


import Race.AthleteGrabber;
import Race.AthleteObserver;
import Race.Observer;
import Race.Subject;

import org.junit.Test;

public class AthleteGrabberTest {

	
    @Test
    public void testValidConstruction() throws Exception {   
    	Subject athGrabber = new AthleteGrabber();
    }

    @Test
    public void testRegister() {
    	AthleteGrabber athleteGrabber = new AthleteGrabber();
		
		Observer observer = new AthleteObserver(athleteGrabber);   	
		athleteGrabber.register(observer);   
    }

   
    @Test
    public void testUnregister() {
    	AthleteGrabber athleteGrabber = new AthleteGrabber();		
		Observer observer = new AthleteObserver(athleteGrabber);
		athleteGrabber.unregister(observer);   
    }
    
    
    @Test
    public void testNotify() {
    	AthleteGrabber athleteGrabber = new AthleteGrabber();		
		athleteGrabber.notifyObserver();
    }
 
    @Test
  public void testBib(){
    //test the function
    	AthleteGrabber athleteGrabber = new AthleteGrabber();
    	athleteGrabber.setBibNumber(Integer.MAX_VALUE);
    	athleteGrabber.setBibNumber(Integer.MIN_VALUE);
    	athleteGrabber.setBibNumber(Integer.SIZE);
    	athleteGrabber.setBibNumber(Integer.BYTES);
    	athleteGrabber.setBibNumber(5);
    	assertEquals(5, athleteGrabber.getBibNumber(), 0);
  }
  
    
  @Test
    public void testDateAndTime(){
	  AthleteGrabber athleteGrabber = new AthleteGrabber();
  	  athleteGrabber.setDateandTime("dwefwevwve");
  	  assertSame("dwefwevwve", athleteGrabber.getDateandTime());
    }
    
  
  @Test
  public void testFirstName(){
	  AthleteGrabber athleteGrabber = new AthleteGrabber();
	  athleteGrabber.setFirstName("fbewfhweb");
	  assertSame("fbewfhweb", athleteGrabber.getFirstName());
  }
  
  @Test
  public void testLastName(){
	  AthleteGrabber athleteGrabber = new AthleteGrabber();
	  athleteGrabber.setLastName("fbewfhweb");
	  assertSame("fbewfhweb", athleteGrabber.getLastName());
  }	  
	  
  @Test
  public void testGender(){
	  AthleteGrabber athleteGrabber = new AthleteGrabber();
	  athleteGrabber.setGender("fbewfhweb");
	  assertSame("fbewfhweb", athleteGrabber.getGender());
}
    
  @Test
  public void testAge(){
	  AthleteGrabber athleteGrabber = new AthleteGrabber();
	  athleteGrabber.setAge(25);
	  assertEquals(5, athleteGrabber.getAge(), 0);
	athleteGrabber.setAge(Integer.MAX_VALUE);
  	athleteGrabber.setAge(Integer.MIN_VALUE);
  	athleteGrabber.setAge(Integer.SIZE);
  	athleteGrabber.setAge(Integer.BYTES);
}
  
  
//@Test
    //public void testFunction(){
    //test the function
    //}

}


