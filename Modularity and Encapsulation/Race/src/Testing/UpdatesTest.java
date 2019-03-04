package Testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Race.AthleteGrabber;
import Race.AthleteObserver;
import Race.Race;
import Race.RaceStuff;
import Race.Updates;

public class UpdatesTest {

	@Test
    public void testValidConstruction() throws Exception {   
		
		RaceStuff race = new Race();	
		race.tryToUpdate(race, "tgernkgjre");
		
		race.setUpdateType(new CantUpdate());
		race.setUpdateType(new ItUpdates());
    }


}
