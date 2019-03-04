package Testing.ZombieTesting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Player.Player;
import Zombies.BasicZombie;

public class BasicZombieTest {

	 @Test
	    public void testValidConstruction()  {	        
		 	BasicZombie testZombie = new BasicZombie();	       
	    }

	 @Test
	    public void testValidConstructionWPArameters()  {	        
		 	BasicZombie testZombie = new BasicZombie(10,10);	       
	    }
	 
	 @Test
	    public void testGetName()  {
	        
		 BasicZombie testZombie = new BasicZombie();
	       assertSame("Basic Zombie", testZombie.getName());
	    }
	 	 
	 @Test
	    public void testSetName()  {
	        
		 BasicZombie testZombie = new BasicZombie();
		 testZombie.setName("New Basic Zombie");
		 	assertSame("New Basic Zombie", testZombie.getName());
	    }
	 
	 @Test
	    public void testGetSpeed()  {
	        
		 BasicZombie testZombie = new BasicZombie();
		 	assertEquals(1, testZombie.getSpeed(), 0);
	    }
	 	 
	 @Test
	    public void testSetSpeed()  {
	        
		 BasicZombie testZombie = new BasicZombie();
		 testZombie.setSpeed(10);
		 	assertEquals(10, testZombie.getSpeed(), 0);
	    }
	 
	 
	 @Test
	    public void testGetPositionX()  {
	        
		 BasicZombie testZombie = new BasicZombie();
		 	assertEquals(0, testZombie.getpositionX(), 0);
	    }
	 	 
	 @Test
	    public void testSetPositionX()  {
	        
		 BasicZombie testZombie = new BasicZombie();
		 testZombie.setpositionX(10);
		 	assertEquals(10, testZombie.getpositionX(), 0);
	    }
	 
	 @Test
	    public void testGetPositionY()  {
	        
		 BasicZombie testZombie = new BasicZombie();
		 	assertEquals(0, testZombie.getpositionY(), 0);
	    }
	 	 
	 @Test
	    public void testSetPositionY()  {
	        
		 BasicZombie testZombie = new BasicZombie();
		 testZombie.setpositionY(10);
		 	assertEquals(10, testZombie.getpositionY(), 0);
	    }
	 
	 @Test
	    public void testGetAmtDamag()  {
	        
		 BasicZombie testZombie = new BasicZombie();
		 	assertEquals(1, testZombie.getAmtDamage(), 0);
	    }
	 	 
	 @Test
	    public void testSetAmtDamag()  {
	        
		 BasicZombie testZombie = new BasicZombie();
		 testZombie.setAmtDamage(10);
		 	assertEquals(10, testZombie.getAmtDamage(), 0);
	    }
	 
	 @Test
	    public void testGetAttackRange()  {
	        
		 BasicZombie testZombie = new BasicZombie();
		 	assertEquals(1, testZombie.getAttackRange(), 0);
	    }
	 	 
	 @Test
	    public void testSetAttackRange()  {
	        
		 BasicZombie testZombie = new BasicZombie();
		 testZombie.setAttackRange(10);
		 	assertEquals(10, testZombie.getAttackRange(), 0);
	    }
	 
	 @Test
	    public void testGetAmtHealth()  {
	        
		 BasicZombie testZombie = new BasicZombie();
		 	assertEquals(1, testZombie.getAmtHealth(), 0);
	    }
	 	 
	 @Test
	    public void testSetAmtHealth()  {
	        
		 BasicZombie testZombie = new BasicZombie();
		 testZombie.setAmtHealth(100);
		 	assertEquals(100, testZombie.getAmtHealth(), 0);
	    }	 
}
