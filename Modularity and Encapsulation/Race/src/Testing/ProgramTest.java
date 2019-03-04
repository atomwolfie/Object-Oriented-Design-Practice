package Testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Race.AthleteGrabber;
import Race.AthleteObserver;
import Race.Program;

public class ProgramTest {

	Program program;

	@Test
    public void testMain()  {   
		program.main(null);
    }
	
	@Test
    public void testGetCourse()  {   
		program.getCourse();
    }
	
	@Test
    public void testGetRace()  {   
		program.getRace();
    }
	
	@Test
    public void testGetAthlete()  {   
		program.getAthlete();
    }
	
	
}
