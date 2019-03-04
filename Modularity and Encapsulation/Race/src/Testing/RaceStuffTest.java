package Testing;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import Race.Athlete;
import Race.AthleteGrabber;
import Race.AthleteObserver;
import Race.Race;
import Race.RaceStuff;
import Race.Updates;

public class RaceStuffTest {

	RaceStuff raceStuff = new RaceStuff();

	@Test
    public void testName()  {   
		raceStuff.setName("Aaron");
		assertSame("Aaron", raceStuff.getName());
    }
	

	@Test
    public void testDistance()  {   
		raceStuff.setCourseDistance(1234);
		assertEquals(1234, raceStuff.getCourseDistance(), 0);		
		raceStuff.setCourseDistance(Double.POSITIVE_INFINITY);
		raceStuff.setCourseDistance(Double.NEGATIVE_INFINITY);
		raceStuff.setCourseDistance(Double.NaN);		
    }
	
	@Test
    public void testDateAndTime()  {   
		raceStuff.setDateandTime("8/30/18");
		assertSame("8/30/18", raceStuff.getDateandTime());
    }
	
	@Test
    public void testLeaderBoardIds()  {   
		ArrayList<Double> leaderboardIds = new ArrayList<Double>();
		raceStuff.setLeaderBoardIds(leaderboardIds);
		assertSame(leaderboardIds, raceStuff.getLeaderboardIds());
    }
	
	@Test
    public void testLeaderBoardDistances()  {   
		ArrayList<Double> leaderBoardDistances = new ArrayList<Double>();
		raceStuff.setLeaderBoardDistances(leaderBoardDistances);
		assertSame(leaderBoardDistances, raceStuff.getLeaderBoardDistances());
    }
	
	@Test
    public void testLeaderBoardPercentages()  {   
		ArrayList<Integer> leaderBoardPercentages = new ArrayList<Integer>();
		raceStuff.setLeaderBoardPercentages(leaderBoardPercentages);
		assertSame(leaderBoardPercentages, raceStuff.getLeaderBoardPercentages());
    }
	
	@Test
    public void testLeaderFinishers()  {   
		ArrayList<String> leaderBoardFinishers = new ArrayList<String>();
		raceStuff.setFinishers(leaderBoardFinishers);
		assertSame(leaderBoardFinishers, raceStuff.getFinishers());
    }
	
	@Test
    public void testFinisherTimes()  {   
		ArrayList<String> leaderFinisherTimes = new ArrayList<String>();
		raceStuff.setFinishersTimes(leaderFinisherTimes);
		assertSame(leaderFinisherTimes, raceStuff.getFinishersTimes());
    }
	
	@Test
    public void tryToUpdate()  {   
		RaceStuff race = new Athlete();
		raceStuff.tryToUpdate(race, "date");
    }
	
	@Test
    public void tryTryUpdate()  {   
		RaceStuff athlete = new Athlete();
		RaceStuff race = new Race();
		athlete.tryToUpdate(race, "vgcytcy");	
    }
	
	@Test
    public void trySetUpdate()  {   
		RaceStuff athlete = new Athlete();
		RaceStuff race = new Race();		
		athlete.setUpdateType(race.updateType);	
    }
	
}
