package Testing.RoundTesting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class MixedRoundTest {

	@Test
    public void testValidBasicConstruction()  {	        
	 	MixedRound round = new MixedRound();	
	 
    }

	@Test
    public void testValidBasicZombieAdd()  {	        
	 	MixedRound round = new MixedRound();
	 	round.addBasicZombie(1);
	 	round.addBasicZombie(132);
	 	round.addBasicZombie(-1);
	 	
	 	
	 	assertEquals("Basic Zombie", round.zombies.get(0).getName());
	 	assertEquals(1, round.zombies.get(0).getSpeed(),0);
	 	assertEquals(0, round.zombies.get(0).getpositionX(), 0);
	 	assertEquals(0, round.zombies.get(0).getpositionY(), 0);
	 	assertEquals(1, round.zombies.get(0).getAmtDamage(), 0);
	 	assertEquals(1, round.zombies.get(0).getAttackRange(), 0);
	 	assertEquals(1, round.zombies.get(0).getAmtHealth(), 0);
	 	
    }
	
	
	@Test
    public void testValidExploderZombieAdd()  {	        
	 	MixedRound round = new MixedRound();
	 	round.addExploderZombie(1);
	 	round.addExploderZombie(3424);
	 	round.addExploderZombie(-1);
	 	
	 	assertEquals("Exploder Zombie", round.zombies.get(0).getName());
	 	assertEquals(1, round.zombies.get(0).getSpeed(),0);
	 	assertEquals(0, round.zombies.get(0).getpositionX(), 0);
	 	assertEquals(0, round.zombies.get(0).getpositionY(), 0);
	 	assertEquals(3, round.zombies.get(0).getAmtDamage(), 0);
	 	assertEquals(5, round.zombies.get(0).getAttackRange(), 0);
	 	assertEquals(2, round.zombies.get(0).getAmtHealth(), 0);
    }
	
	
	@Test
    public void testValidFastZombieAdd()  {	        
	 	MixedRound round = new MixedRound();
	 	round.addFastZombie(1);
	 	round.addFastZombie(20);
	 	round.addFastZombie(-20);
	 	
	 	assertEquals("Fast Zombie", round.zombies.get(0).getName());
	 	assertEquals(4, round.zombies.get(0).getSpeed(),0);
	 	assertEquals(0, round.zombies.get(0).getpositionX(), 0);
	 	assertEquals(0, round.zombies.get(0).getpositionY(), 0);
	 	assertEquals(1, round.zombies.get(0).getAmtDamage(), 0);
	 	assertEquals(1, round.zombies.get(0).getAttackRange(), 0);
	 	assertEquals(1, round.zombies.get(0).getAmtHealth(), 0);
    }
	
	@Test
    public void testValidGoliathZombieAdd()  {	        
	 	MixedRound round = new MixedRound();
	 	round.addGoliathZombie(1);
	 	round.addGoliathZombie(1242);
	 	round.addGoliathZombie(-1);
	 	
		assertEquals("Goliath Zombie", round.zombies.get(0).getName());
	 	assertEquals(1, round.zombies.get(0).getSpeed(),0);
	 	assertEquals(0, round.zombies.get(0).getpositionX(), 0);
	 	assertEquals(0, round.zombies.get(0).getpositionY(), 0);
	 	assertEquals(2, round.zombies.get(0).getAmtDamage(), 0);
	 	assertEquals(1, round.zombies.get(0).getAttackRange(), 0);
	 	assertEquals(8, round.zombies.get(0).getAmtHealth(), 0);
    }
}
