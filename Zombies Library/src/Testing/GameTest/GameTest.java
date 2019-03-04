package Testing.GameTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Game.Game;
import Rounds.BasicRound;

public class GameTest {

	@Test
    public void testValidBasicConstruction()  {	        
	 	
		Game newGame = new Game();	       
    }
	
	@Test
    public void testGameDone()  {	        
	 	
		Game newGame = new Game();
		
		boolean trueTest = false;
		
		assertSame(trueTest, newGame.getGameDone());
		
		trueTest = true;
		newGame.setGameDone("done");
		       
		assertSame(trueTest, newGame.getGameDone());
    }
	
	@Test
    public void testRoundNumber()  {	        
	 	
		Game newGame = new Game();
		
		int roundNumber = 1;
		
		assertEquals(roundNumber,newGame.getRoundNumber());
		
		roundNumber = 10;
		newGame.setRoundNumber(10);
		assertEquals(roundNumber,newGame.getRoundNumber());
		
		roundNumber = -10;
		newGame.setRoundNumber(-10);
		assertEquals(roundNumber,newGame.getRoundNumber());

    }
	
}
