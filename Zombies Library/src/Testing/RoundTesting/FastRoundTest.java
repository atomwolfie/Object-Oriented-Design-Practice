package Testing.RoundTesting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FastRoundTest {

	@Test
    public void testValidBasicConstruction()  {	        
	 	FastRound round = new FastRound();	       
    }

	@Test
    public void testValidBasicZombieAdd()  {	        
		FastRound round = new FastRound();
	 	round.addBasicZombie(1);
	 	round.addBasicZombie(132);
	 	round.addBasicZombie(-1);
	 	try{
	 	assertEquals("Basic Zombie", round.zombies.get(0).getName());
	 	assertEquals(1, round.zombies.get(0).getSpeed(),0);
	 	assertEquals(0, round.zombies.get(0).getpositionX(), 0);
	 	assertEquals(0, round.zombies.get(0).getpositionY(), 0);
	 	assertEquals(1, round.zombies.get(0).getAmtDamage(), 0);
	 	assertEquals(1, round.zombies.get(0).getAttackRange(), 0);
	 	assertEquals(1, round.zombies.get(0).getAmtHealth(), 0);
	}
 	catch (Exception e) {
        // ignore
    }
    }
	
	@Test
    public void testValidExploderZombieAdd()  {	        
		FastRound round = new FastRound();
	 	round.addExploderZombie(1);
	 	round.addExploderZombie(3424);
	 	round.addExploderZombie(-1);
	 	
	 	try{
	 	assertEquals("Exploder Zombie", round.zombies.get(0).getName());
	 	assertEquals(1, round.zombies.get(0).getSpeed(),0);
	 	assertEquals(0, round.zombies.get(0).getpositionX(), 0);
	 	assertEquals(0, round.zombies.get(0).getpositionY(), 0);
	 	assertEquals(3, round.zombies.get(0).getAmtDamage(), 0);
	 	assertEquals(5, round.zombies.get(0).getAttackRange(), 0);
	 	assertEquals(2, round.zombies.get(0).getAmtHealth(), 0);
	 	}
	 	catch (Exception e) {
	        // ignore
	    }
    }
	
	
	@Test
    public void testValidFastZombieAdd()  {	        
		FastRound round = new FastRound();
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
		FastRound round = new FastRound();
	 	round.addGoliathZombie(1);
	 	round.addGoliathZombie(1242);
	 	round.addGoliathZombie(-1);
	 	try{
	 	assertEquals("Goliath Zombie", round.zombies.get(0).getName());
	 	assertEquals(1, round.zombies.get(0).getSpeed(),0);
	 	assertEquals(0, round.zombies.get(0).getpositionX(), 0);
	 	assertEquals(0, round.zombies.get(0).getpositionY(), 0);
	 	assertEquals(2, round.zombies.get(0).getAmtDamage(), 0);
	 	assertEquals(1, round.zombies.get(0).getAttackRange(), 0);
	 	assertEquals(8, round.zombies.get(0).getAmtHealth(), 0);
	 	  fail("Expected exception not thrown");
    } catch (Exception e) {
        // ignore
    }
    }

}
