package Race;
import java.util.ArrayList;
import java.util.Scanner;

import Exceptions.ApplicationException;



public class Program {
	
	private static SimController controller = new SimController();
	private static String inputFileName;
	private static RaceStuff course = new Course();
	private static RaceStuff race = new Race();
	private static RaceStuff athlete = new Athlete();
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//System.out.println("Enter Course Name: ");
		//String userCourseName = scan.nextLine();
		//courseName = userCourseName;
		System.out.println("Course Name: Utah");		
		course.setName("Utah");
		
		
		System.out.println("Enter Race Name: ");
		//String userRaceName = scan.nextLine();
		//raceName = userRaceName;
		race.setName("Top of Utah");
		System.out.println("Race Name: Top of Utah ");
		
		//16093.4
		//System.out.println("Enter Distance (example 16093.4): ");
		//String userDistance = scan.nextLine();
		double userDistance = 16093.4;
	
//		course.tryToUpdate(course, "8/30/18");
//		race.tryToUpdate(race, "8/30/18");
//		System.out.println("Course time: " + course.getDateandTime());
//		System.out.println("Race time: " + race.getDateandTime());
//		
//		course.tryToUpdate(course, "9/18/19");
//		System.out.println("Course time: " + course.getDateandTime());
//		System.out.println("Race time: " + race.getDateandTime());
		
		try{
		course.setCourseDistance(userDistance);;		
		}
		catch(NumberFormatException ignore){
			System.out.println("Invalid input for distance, closing program...");
			System.exit(0);
		}
		if(course.getCourseDistance() < 0.0){
			System.out.println("Distance value was below 0, invalid. closing program...");
			System.exit(0);
		}
		
//		System.out.println("Enter Input file name (example: Short Race Simulation.csv): ");
//		String userInput = scan.nextLine();
//		inputFileName = userInput;
		
//		System.out.println("Enter date and time of race:");
//		String userDate = scan.nextLine();
//		dateAndTime = userDate;
		
		System.out.println("Date and time of race: 8/30/18    7:00am");
		
		
		scan.close();
				//Race info
		    	//thisRace = new Race();				
								
		    	//Testing
		    	//Century Simulation-01.csv
		    	//SimulatedDataSourceTest.csv
		    	//Short Race Simulation-01.csv
		    	try {										
		    		inputFileName = "Century Simulation-01.csv";
		    		controller.Initialize(inputFileName);
				} catch (ApplicationException e) {
					e.printStackTrace();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
	}
	

	
    public static RaceStuff getCourse(){return course;}
    public void setCourse(RaceStuff newCourse){
    	course = newCourse;
    	}
    
    public static RaceStuff getRace(){return race;}
    public void setRace(RaceStuff newRace){
    	race = newRace;
    	}
    
    public static RaceStuff getAthlete(){return course;}
    public void setAthlete(RaceStuff newAthlete){
    	athlete = newAthlete;
    	}
    
    }
