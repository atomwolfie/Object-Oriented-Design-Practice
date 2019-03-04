package Testing.RoundTesting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class GoliathRoundTest {

	@Test
    public void testValidBasicConstruction()  {	        
	 	GoliathRound round = new GoliathRound();	       
    }

	@Test
    public void testValidBasicZombieAdd()  {	        
		GoliathRound round = new GoliathRound();
	 	round.addBasicZombie(1);
	 	round.addBasicZombie(132);
	 	round.addBasicZombie(-1);
	 	
	 	 try {
		 		assertEquals("Basic Zombie", round.zombies.get(0).getName());
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
    public void testValidExploderZombieAdd()  {	        
		GoliathRound round = new GoliathRound();
	 	round.addExploderZombie(1);
	 	round.addExploderZombie(3424);
	 	round.addExploderZombie(-1);
	 	
	 	 try {
		 		assertEquals("Exploder Zombie", round.zombies.get(0).getName());
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
    public void testValidFastZombieAdd()  {	        
		GoliathRound round = new GoliathRound();
	 	round.addFastZombie(1);
	 	round.addFastZombie(20);
	 	round.addFastZombie(-20);
	 	
	 	 try {
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
		GoliathRound round = new GoliathRound();
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
