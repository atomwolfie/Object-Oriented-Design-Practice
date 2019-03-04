package Testing.ZombieTesting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Zombies.BasicZombie;
import Zombies.ExploderZombie;

public class ExploderZombieTest {

	@Test
    public void testValidConstruction()  {	        
	 	ExploderZombie testZombie = new ExploderZombie();	       
    }

 @Test
    public void testValidConstructionWPArameters()  {	        
	 ExploderZombie testZombie = new ExploderZombie(10,10);	       
    }
 
 @Test
    public void testGetName()  {
        
	 ExploderZombie testZombie = new ExploderZombie();
       assertSame("Exploder Zombie", testZombie.getName());
    }
 	 
 @Test
    public void testSetName()  {
        
	 ExploderZombie testZombie = new ExploderZombie();
	 testZombie.setName("New Basic Zombie");
	 	assertSame("New Basic Zombie", testZombie.getName());
    }
 
 @Test
    public void testGetSpeed()  {
        
	 ExploderZombie testZombie = new ExploderZombie();
	 	assertEquals(1, testZombie.getSpeed(), 0);
    }
 	 
 @Test
    public void testSetSpeed()  {
        
	 ExploderZombie testZombie = new ExploderZombie();
	 testZombie.setSpeed(10);
	 	assertEquals(10, testZombie.getSpeed(), 0);
    }
 
 
 @Test
    public void testGetPositionX()  {        
	 ExploderZombie testZombie = new ExploderZombie();
	 	assertEquals(0, testZombie.getpositionX(), 0);
    }
 	 
 @Test
    public void testSetPositionX()  {
        
	 ExploderZombie testZombie = new ExploderZombie();
	 testZombie.setpositionX(10);
	 	assertEquals(10, testZombie.getpositionX(), 0);
    }
 
 @Test
    public void testGetPositionY()  {
        
	 ExploderZombie testZombie = new ExploderZombie();
	 	assertEquals(0, testZombie.getpositionY(), 0);
    }
 	 
 @Test
    public void testSetPositionY()  {       
	 ExploderZombie testZombie = new ExploderZombie();
	 testZombie.setpositionY(10);
	 	assertEquals(10, testZombie.getpositionY(), 0);
    }
 
 @Test
    public void testGetAmtDamag()  {
        
	 ExploderZombie testZombie = new ExploderZombie();
	 	assertEquals(3, testZombie.getAmtDamage(), 0);
    }
 	 
 @Test
    public void testSetAmtDamag()  {
        
	 ExploderZombie testZombie = new ExploderZombie();
	 testZombie.setAmtDamage(10);
	 	assertEquals(10, testZombie.getAmtDamage(), 0);
    }
 
 @Test
    public void testGetAttackRange()  {
        
	 ExploderZombie testZombie = new ExploderZombie();
	 	assertEquals(5, testZombie.getAttackRange(), 0);
    }
 	 
 @Test
    public void testSetAttackRange()  {       
	 ExploderZombie testZombie = new ExploderZombie();
	 testZombie.setAttackRange(10);
	 	assertEquals(10, testZombie.getAttackRange(), 0);
    }
 
 @Test
    public void testGetAmtHealth()  {        
	 ExploderZombie testZombie = new ExploderZombie();
	 	assertEquals(2, testZombie.getAmtHealth(), 0);
    }
 	 
 @Test
    public void testSetAmtHealth()  {      
	 ExploderZombie testZombie = new ExploderZombie();
	 testZombie.setAmtHealth(100);
	 	assertEquals(100, testZombie.getAmtHealth(), 0);
    }

}
