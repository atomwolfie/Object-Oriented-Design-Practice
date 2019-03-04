package Testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Messages.AthleteUpdate;
import Race.AthleteGrabber;
import Race.AthleteObserver;
import Race.DataProcessor;
import Race.SimController;
import Racedata.AthleteRaceStatus;
import Racedata.IAthleteUpdateHandler;
import Racedata.SimulatedDataSource;


public class DataProcessorTest {

	@Test
    public void testValidConstruction() throws Exception {   
		DataProcessor handler = new DataProcessor();		
    }

	@Test
    public void testProcessUpdate()  {   
		DataProcessor handler = new DataProcessor();
		//??????????	
		//handler.ProcessUpdate(updateMessage);
		
    }
	
	@Test
    public void testRound()  {   
		DataProcessor handler = new DataProcessor();
		assertEquals(34.5, handler.round(34.52, 1), 0);
    }
	
}
