package Race;

public interface Updates {

	void update(RaceStuff race, String dateAndTime);
	
}

class ItUpdates implements Updates{
		
	public void update(RaceStuff race, String newdateAndTime){
		
		race.setDateandTime(newdateAndTime);
		
		System.out.println( "Updating info");
		
		//change information given in update
		//Athlete and race should change
	}

}

class CantUpdate implements Updates{
	
	public void update(RaceStuff race, String newdateAndTime){
		System.out.println( "Can't update info");
		
		//do nothing
		//Course information will not change
	}
		
}