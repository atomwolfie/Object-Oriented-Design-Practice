package Race;

import java.util.ArrayList;

public class CourseGrabber implements Subject {

	  private ArrayList<Observer> observers;
	
	  Course course = new Course();
	   

	    public CourseGrabber(){

	        // Creates an ArrayList to hold all observers

	        observers = new ArrayList<Observer>();

	    }

	    public void register(Observer newObserver) {

	        // Adds a new observer to the ArrayList

	        observers.add(newObserver);

	    }

	    public void unregister(Observer deleteObserver) {

	        // Get the index of the observer to delete

	        int observerIndex = observers.indexOf(deleteObserver);

	        // Print out message (Have to increment index to match)

	        System.out.println("Observer " + (observerIndex+1) + " deleted");

	        // Removes observer from the ArrayList

	        observers.remove(observerIndex);

	    }

	    public void notifyObserver() {

	        // Cycle through all observers and notifies them of

	        // athlete changes

	        for(Observer observer : observers){
	            observer.updateCourse(course.getBibNumber(), course.getDateandTime(), course.getDistance());
	        }

	    }

	    // Change prices for all stocks and notifies observers of changes

	    public void setBibNumber(int newBibNumber){
	    	course.setBibNumber(newBibNumber);
	        notifyObserver();
	    }

	    public int getBibNumber(){
	        return course.getBibNumber();
	     }
	    
	    public void setDateandTime(String newDateAndTime){
	    	course.setDateandTime(newDateAndTime);
	        notifyObserver();
	    }
	    
	    public String getDateandTime(){
	    	return course.getDateandTime();
	    }
	 
	    
	    public void setDistance(double newDistance){
	    	course.setCourseDistance(newDistance);
	        notifyObserver();
	    }

	    public double getDistance(){
	    	return course.getCourseDistance();
	    }
	   

	    
	   
	
}
