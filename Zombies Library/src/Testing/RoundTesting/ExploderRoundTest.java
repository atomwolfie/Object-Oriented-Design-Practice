package Testing.RoundTesting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ExploderRoundTest {

	@Test
    public void testValidBasicConstruction()  {	        
	 	ExploderRound round = new ExploderRound();	       
    }

	@Test
    public void testValidBasicZombieAdd()  {	        
		ExploderRound round = new ExploderRound();
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
	 	  fail("Expected exception not thrown");
    } catch (Exception e) {
        // ignore
    }
    }
	
	@Test
    public void testValidExploderZombieAdd()  {	        
		ExploderRound round = new ExploderRound();
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
		ExploderRound round = new ExploderRound();
	 	round.addFastZombie(1);
	 	round.addFastZombie(20);
	 	round.addFastZombie(-20);
	 	
	 	try{
	 	assertEquals("Fast Zombie", round.zombies.get(0).getName());
	 	assertEquals(4, round.zombies.get(0).getSpeed(),0);
	 	assertEquals(0, round.zombies.get(0).getpositionX(), 0);
	 	assertEquals(0, round.zombies.get(0).getpositionY(), 0);
	 	assertEquals(1, round.zombies.get(0).getAmtDamage(), 0);
	 	assertEquals(1, round.zombies.get(0).getAttackRange(), 0);
	 	assertEquals(1, round.zombies.get(0).getAmtHealth(), 0);
	 	  fail("Expected exception not thrown");
    } catch (Exception e) {
        // ignore
    }
    }
	
	@Test
    public void testValidGoliathZombieAdd()  {	        
		ExploderRound round = new ExploderRound();
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
