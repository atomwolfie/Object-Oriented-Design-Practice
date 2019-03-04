package Race;
import java.util.ArrayList;

public class RaceStuff {
	private String name;
	private String dateAndTime;
	private double courseDistance;
	private ArrayList<Double> leaderBoardIds = new ArrayList<Double>();
	private ArrayList<Double> leaderBoardDistances = new ArrayList<Double>();
	private ArrayList<Integer> leaderBoardPercentages = new ArrayList<Integer>();
	private static ArrayList<String> finishers;
	private static ArrayList<String> finishersTimes;
	public Updates updateType;
	
	public String getName(){
		return name;
		}	
	public void setName(String newName){
		name = newName;
	}
	
	public double getCourseDistance(){
		return courseDistance;
		}	
	public void setCourseDistance(double newCourseDistance){
		courseDistance = newCourseDistance;
	}
	
	public String getDateandTime(){
		return dateAndTime;
	}
	public void setDateandTime(String newDateandTime){
		dateAndTime = newDateandTime;
	}
	
	public ArrayList<Double> getLeaderboardIds(){
		return leaderBoardIds;
	}
	public void setLeaderBoardIds(ArrayList<Double> newLeaderBoardIds){
		leaderBoardIds = newLeaderBoardIds;
	}
	
		
	public ArrayList<Double> getLeaderBoardDistances(){
		return leaderBoardDistances;
	}
	public void setLeaderBoardDistances(ArrayList<Double> newLeaderBoardDistances){
		leaderBoardDistances = newLeaderBoardDistances;
	}
	
	public ArrayList<Integer> getLeaderBoardPercentages(){
		return leaderBoardPercentages;
	}
	public void setLeaderBoardPercentages(ArrayList<Integer> newLeaderBoardPercentages){
		leaderBoardPercentages = newLeaderBoardPercentages;
	}
		
	public ArrayList<String> getFinishers(){
		return finishers;
	}
	public void setFinishers(ArrayList<String> newFinishers){
		finishers = newFinishers;
	}
	
	public ArrayList<String> getFinishersTimes(){
		return finishersTimes;
	}
	public void setFinishersTimes(ArrayList<String> newFinishersTimes){
		finishersTimes = newFinishersTimes;
	}
	
	public void tryToUpdate(RaceStuff race, String newdateAndTime){
		 updateType.update(race,  newdateAndTime);
	}
	public void setUpdateType(Updates newUpdateType){
		updateType = newUpdateType;
	}
	
	
	
	
}
