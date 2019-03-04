package Race;

public class Course extends RaceStuff {


	
	private int bibNumber;
    private String dateAndTime; 
    private double distanceTraveled;
	
	public Course(){
		super();
		bibNumber = 0;
		dateAndTime = "";
		distanceTraveled = 0;
		updateType = new ItUpdates();
	}
	
	 public void setBibNumber(int newBibNumber){
	        bibNumber = newBibNumber;
	    }

	    public int getBibNumber(){
	        return bibNumber;
	     }
	    
	    public void setDateandTime(String newDateAndTime){
	        dateAndTime = newDateAndTime;
	    }
	    
	    public String getDateandTime(){
	    	return dateAndTime;
	    }
	 
	    
	    public void setDistance(double newDistance){
	        distanceTraveled = newDistance;
	    }

	    public double getDistance(){
	    	return distanceTraveled;
	    }

}
