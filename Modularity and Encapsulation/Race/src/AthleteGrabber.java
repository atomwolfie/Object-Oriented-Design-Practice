package Race;
import java.util.ArrayList;


// Uses the Subject interface to update all Observers

public class AthleteGrabber implements Subject{

    private ArrayList<Observer> observers;

    Athlete athlete = new Athlete();
    

    public AthleteGrabber(){

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

            observer.update(athlete.getBibNumber(), athlete.getDateandTime(), athlete.getFirstName(), athlete.getLastName(), athlete.getGender(), athlete.getAge());

        }

    }

    // Change prices for all stocks and notifies observers of changes

    public void setBibNumber(int newBibNumber){
       athlete.setBibNumber(newBibNumber);
        notifyObserver();

    }
    
    public int getBibNumber(){
       return athlete.getBibNumber();
    }

    public void setDateandTime(String newDateAndTime){
        athlete.setDateandTime(newDateAndTime);
        notifyObserver();
    }
    
    public String getDateandTime(){
    	return athlete.getDateandTime();
    }

    
    public void setFirstName(String newFirstName){

    	athlete.setFirstName(newFirstName);
        notifyObserver();
  }

   
    public String getFirstName(){
    	return athlete.getFirstName();
    }
    
    
    public void setLastName(String newLastName){
    	athlete.setLastName(newLastName);
    	notifyObserver();
    }
    
    public String getLastName(){
    	return athlete.getLastName();
    }
    
    public void setGender(String newGender){
    	athlete.setGender(newGender);
        notifyObserver();
    }
    
    public String getGender(){
    	return athlete.getGender();
    }
    
    public void setAge(int newAge){
    	athlete.setAge(newAge);
        notifyObserver();
    }

    public int getAge(){
    	return athlete.getAge();
    }


}

