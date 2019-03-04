package Game;

public class Game {

	private boolean gameDone;
	private int roundNumber;
	
	
	public Game(){
		gameDone = false;
		roundNumber = 1;
	}
	
	public boolean getGameDone(){return gameDone;}
	
	public void setGameDone(String done){
		if(done.equals("done")){
			gameDone = true;
		}
		else{
			gameDone = false;
		}
	}
	
	public void setRoundNumber(int newNumber){roundNumber = newNumber;}
	public int getRoundNumber(){return roundNumber;}
}
