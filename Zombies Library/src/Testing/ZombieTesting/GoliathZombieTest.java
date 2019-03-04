package Testing.ZombieTesting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Zombies.BasicZombie;
import Zombies.GoliathZombie;

public class GoliathZombieTest {

	 @Test
	    public void testValidConstruction()  {	        
		 	GoliathZombie testZombie = new GoliathZombie();	       
	    }

	 
	 @Test
	    public void testGetName()  {
	        
		 GoliathZombie testZombie = new GoliathZombie();
	       assertSame("Goliath Zombie", testZombie.getName());
	    }
	 	 
	 @Test
	    public void testSetName()  {
	        
		 GoliathZombie testZombie = new GoliathZombie();
		 testZombie.setName("New Goliath Zombie");
		 	assertSame("New Goliath Zombie", testZombie.getName());
	    }
	 
	 @Test
	    public void testGetSpeed()  {
	        
		 GoliathZombie testZombie = new GoliathZombie();
		 	assertEquals(1, testZombie.getSpeed(), 0);
	    }
	 	 
	 @Test
	    public void testSetSpeed()  {
	        
		 GoliathZombie testZombie = new GoliathZombie();
		 testZombie.setSpeed(10);
		 	assertEquals(10, testZombie.getSpeed(), 0);
	    }
	 
	 
	 @Test
	    public void testGetPositionX()  {
	        
		 GoliathZombie testZombie = new GoliathZombie();
		 	assertEquals(0, testZombie.getpositionX(), 0);
	    }
	 	 
	 @Test
	    public void testSetPositionX()  {
	        
		 GoliathZombie testZombie = new GoliathZombie();
		 testZombie.setpositionX(10);
		 	assertEquals(10, testZombie.getpositionX(), 0);
	    }
	 
	 @Test
	    public void testGetPositionY()  {
	        
		 GoliathZombie testZombie = new GoliathZombie();
		 	assertEquals(0, testZombie.getpositionY(), 0);
	    }
	 	 
	 @Test
	    public void testSetPositionY()  {
	        
		 GoliathZombie testZombie = new GoliathZombie();
		 testZombie.setpositionY(10);
		 	assertEquals(10, testZombie.getpositionY(), 0);
	    }
	 
	 @Test
	    public void testGetAmtDamag()  {
	        
		 GoliathZombie testZombie = new GoliathZombie();
		 	assertEquals(2, testZombie.getAmtDamage(), 0);
	    }
	 	 
	 @Test
	    public void testSetAmtDamag()  {
	        
		 GoliathZombie testZombie = new GoliathZombie();
		 testZombie.setAmtDamage(10);
		 	assertEquals(10, testZombie.getAmtDamage(), 0);
	    }
	 
	 @Test
	    public void testGetAttackRange()  {
	        
		 GoliathZombie testZombie = new GoliathZombie();
		 	assertEquals(1, testZombie.getAttackRange(), 0);
	    }
	 	 
	 @Test
	    public void testSetAttackRange()  {
	        
		 GoliathZombie testZombie = new GoliathZombie();
		 testZombie.setAttackRange(10);
		 	assertEquals(10, testZombie.getAttackRange(), 0);
	    }
	 
	 @Test
	    public void testGetAmtHealth()  {
	        
		 GoliathZombie testZombie = new GoliathZombie();
		 	assertEquals(8, testZombie.getAmtHealth(), 0);
	    }
	 	 
	 @Test
	    public void testSetAmtHealth()  {
	        
		 GoliathZombie testZombie = new GoliathZombie();
		 testZombie.setAmtHealth(100);
		 	assertEquals(100, testZombie.getAmtHealth(), 0);
	    }

}
