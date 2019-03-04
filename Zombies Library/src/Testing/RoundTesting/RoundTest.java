package Testing.RoundTesting;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import Rounds.BasicRound;
import Rounds.ExploderRound;
import Rounds.FastRound;
import Rounds.GoliathRound;
import Rounds.MixedRound;
import Rounds.Round;
import Zombies.BasicZombie;
import Zombies.Zombie;

public class RoundTest {

	 @Test
	    public void testValidBasicConstruction()  {	        
		 	BasicRound round = new BasicRound();	       
	    }

	 @Test
	    public void testValidExploderConstruction()  {	        
		 	ExploderRound round = new ExploderRound();	       
	    }
	 
	 @Test
	    public void testValidFastConstruction()  {	        
		 	FastRound round = new FastRound();	       
	    }
	 
	 @Test
	    public void testValidGoliathConstruction()  {	        
		 	GoliathRound round = new GoliathRound();	       
	    }
	 
	 @Test
	    public void testValidMixedConstruction()  {	        
		 	MixedRound round = new MixedRound();	       
	    }
	 
	 
	 @Test
	    public void testAddZombie()  {	        
		 	
		 	BasicZombie basic = new BasicZombie();		 	
		 	Round round = new BasicRound();	
		 	round.addToZombieList(basic);	
	    }
	 
}
