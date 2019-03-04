package Race;

public class Athlete extends RaceStuff{
	
	public Updates updateType;
	private int bibNumber;
    private String dateAndTime;   
    private String firstName;
    private String lastName; 
    private String gender;   
    private int age;
	
    public Athlete(){		
		super();	
		bibNumber = 0;
		dateAndTime = "";
		firstName = "";
		lastName = "";
		gender = "";
		age = 0;
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

     
     public void setFirstName(String newFirstName){

         firstName = newFirstName;
   }

    
     public String getFirstName(){
     	return firstName;
     }
     
     
     public void setLastName(String newLastName){
         lastName = newLastName;
     }
     
     public String getLastName(){
     	return lastName;
     }
     
     public void setGender(String newGender){
         gender = newGender;
     }
     
     public String getGender(){
     	return gender;
     }
     
     public void setAge(int newAge){
         age = newAge;
   
     }

     public int getAge(){
     	return age;
     }
	
	
}
