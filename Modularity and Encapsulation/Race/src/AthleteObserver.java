package Race;
// Represents each Observer that is monitoring changes in the subject

public class AthleteObserver implements Observer {

    //int bibNumber, String firstName, String lastName, String gender, int age

	Athlete athlete = new Athlete();
	

    // Static used as a counter
    private static int observerIDTracker = 0;

    // Used to track the observers
    private int observerID;

    // Will hold reference to the StockGrabber object

    private Subject athleteGrabber;

    public AthleteObserver(Subject newAthleteGrabber){

        // Store the reference to the stockGrabber object so

        // I can make calls to its methods

        athleteGrabber = newAthleteGrabber;

        // Assign an observer ID and increment the static counter
        observerID = ++observerIDTracker;

        // Message notifies user of new observer

        System.out.println("New Observer " + observerID);

        // Add the observer to the Subjects ArrayList

        athleteGrabber.register(this);

    }

    // Called to update all observers

    public void update(int newBibNumber, String newDateAndTime, String newFirstName, String newLastName, String newGender, int newAge) {

    	//set athlete update type to cant update
    	
        athlete.setBibNumber(newBibNumber);

        athlete.setDateandTime(newDateAndTime);
                
        athlete.setFirstName(newFirstName);
        
        athlete.setLastName(newLastName);
        
        athlete.setGender(newGender);
        
        athlete.setAge(newAge);
        
        printTheAthletes();

        //set athlete update type back to can't update
    }

    public void printTheAthletes(){

        System.out.println(observerID + "\nRunner (bib number): " + 
        
        athlete.getBibNumber() + "\nDate and Time: " + athlete.getDateandTime() + "\nfirstName: " +

		athlete.getFirstName() + "\nlastName: " + athlete.getLastName() + 

		"\ngender: " + athlete.getGender() + "\nage: " + athlete.getAge() + "\n");
    }

    
   
   
	@Override
	public void updateCourse(int bibNumber, String dateAndTime, double distanceTraveled) {
		// TODO Auto-generated method stub
		
	}

}
