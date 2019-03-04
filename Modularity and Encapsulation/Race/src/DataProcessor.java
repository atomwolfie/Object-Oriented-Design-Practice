package Race;
import java.util.ArrayList;
import java.util.Collections;

import Messages.AthleteUpdate;
import Racedata.IAthleteUpdateHandler;



public class DataProcessor implements IAthleteUpdateHandler {

	
	@Override
	public void ProcessUpdate(AthleteUpdate updateMessage) {
		
		//ArrayList<Double> leaderBoardDistances = Program.thisRace.getLeaderBoardDistances();
		
		RaceStuff race = Program.getRace();
		ArrayList<Double> leaderBoardDistances = race.getLeaderBoardDistances();
		
		// TODO: Do something to process the update message, depending on the concrete type of message
        // TODO: Note that the println does below here
		
		//if registered, create new athlete object
		
		String update = updateMessage.toString();
		
		String delims = "[,]";
		String[] tokens = update.split(delims);
		
		//Register a new Athlete
		if(tokens[0].equals("Registered")){
	       
			 AthleteGrabber athleteGrabber = new AthleteGrabber();
			
			new AthleteObserver(athleteGrabber);
			
			        athleteGrabber.setBibNumber(Integer.parseInt(tokens[1]));
			        athleteGrabber.setDateandTime(tokens[2]);   
			        athleteGrabber.setFirstName(tokens[3]);	
			        athleteGrabber.setLastName(tokens[4]);			        
			        athleteGrabber.setGender(tokens[5]);			        
			        athleteGrabber.setAge(Integer.parseInt(tokens[6]));			
		}
		
		
		if(tokens[0].equals("DidNotStart")){
			AthleteGrabber athleteGrabber = new AthleteGrabber();
			new AthleteObserver(athleteGrabber);
			athleteGrabber.setBibNumber(Integer.parseInt(tokens[1]));
			athleteGrabber.setDateandTime(tokens[2]);   
		}
		
		if(tokens[0].equals("Started")){
			AthleteGrabber athleteGrabber = new AthleteGrabber();
			new AthleteObserver(athleteGrabber);
			athleteGrabber.setBibNumber(Integer.parseInt(tokens[1]));
			athleteGrabber.setDateandTime(tokens[2]);			
		}
		
		
		if(tokens[0].equals("OnCourse")){
			
			
			CourseGrabber courseGrabber = new CourseGrabber();
			new CourseObserver(courseGrabber);
			
			courseGrabber.setBibNumber(Integer.parseInt(tokens[1]));
			courseGrabber.setDateandTime(tokens[2]);
			courseGrabber.setDistance(Double.parseDouble(tokens[3]));
										
			Double runDist = (Double.parseDouble(tokens[3])/race.getCourseDistance())*100;	
			Double runModified = round(runDist,2);			
			String runnerDistance =  Double.toString(runModified);
					
						
			leaderBoardDistances.add(Double.parseDouble(tokens[3]));
			leaderBoardDistances.add((double) runModified.intValue());
			
			if(Double.parseDouble(tokens[3]) > leaderBoardDistances.get(0) &&  leaderBoardDistances.size() > 1){
				System.out.println("We have a new leader! Runner# " + tokens[1]);				
			}
			
			Collections.sort(leaderBoardDistances);
			Collections.sort(leaderBoardDistances);
			Collections.reverse(leaderBoardDistances);
			Collections.reverse(leaderBoardDistances);
		}
		
		if(tokens[0].equals("Finished")){
			
			AthleteGrabber athleteGrabber = new AthleteGrabber();
			new AthleteObserver(athleteGrabber);
			athleteGrabber.setBibNumber(Integer.parseInt(tokens[1]));
			athleteGrabber.setDateandTime(tokens[2]);
		
			
			ArrayList<String> finishers = race.getFinishers();
			finishers.add(tokens[1]);
			race.setFinishers(finishers);
			
			ArrayList<String> finishersTimes = race.getFinishersTimes();
			finishersTimes.add(tokens[2]);
			race.setFinishersTimes(finishersTimes);
		}
		
		
		race.setLeaderBoardDistances(leaderBoardDistances);
		
		System.out.println(updateMessage.toString());
	}

	public static double round(double value, int places) {
	    if (places < 0) throw new IllegalArgumentException();

	    long factor = (long) Math.pow(10, places);
	    value = value * factor;
	    long tmp = Math.round(value);
	    return (double) tmp / factor;
	}
	
}

