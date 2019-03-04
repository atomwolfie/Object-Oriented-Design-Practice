package Testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Race.AthleteGrabber;
import Race.AthleteObserver;
import Race.SimController;

public class SimControllerTest {

	@Test
    public void testValidConstruction() throws Exception {   
		SimController controller = new SimController();
    }

	@Test
    public void testInitialize() throws Exception {   
		SimController controller = new SimController();
		controller.Initialize("Century Simulation-01.csv");
    }
	
	
}
