import java.util.Random;

import Game.Game;
import Player.Player;
import Rounds.Round;
import Rounds.RoundTemplatePicker;

public class Main {

	public static void main(String[] args) {
		
		Game newGame = new Game();		
		Player player = new Player();
		RoundTemplatePicker roundPicker = new RoundTemplatePicker();

		System.out.println("The Game Starts: ");
		
		
		//GAME LOOP
		while(newGame.getGameDone() == false){
			
			System.out.println("\n Round: " + newGame.getRoundNumber());
			
						
			Random r = new Random();
			int randomNumber =  r.nextInt((5 - 1) + 1) + 1;
			
			Round newRound = roundPicker.makeRound(randomNumber, newGame.getRoundNumber());
			
			
			newGame.setRoundNumber(newGame.getRoundNumber() + 1);
			
			
			//arbitrary round limit for testing
			if(newGame.getRoundNumber() == 10){
				return;
			}
			
		}
		//END OF GAME LOOP
		
	}

	

}
