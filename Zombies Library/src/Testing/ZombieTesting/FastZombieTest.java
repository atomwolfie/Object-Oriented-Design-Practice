package Testing.ZombieTesting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Zombies.BasicZombie;
import Zombies.FastZombie;

public class FastZombieTest {

	@Test
    public void testValidConstruction()  {	        
	 	FastZombie testZombie = new FastZombie();	       
    }

 
 @Test
    public void testGetName()  {
        
	 FastZombie testZombie = new FastZombie();
       assertSame("Fast Zombie", testZombie.getName());
    }
 	 
 @Test
    public void testSetName()  {
        
	 FastZombie testZombie = new FastZombie();
	 testZombie.setName("New Fast Zombie");
	 	assertSame("New Fast Zombie", testZombie.getName());
    }
 
 @Test
    public void testGetSpeed()  {
        
	 FastZombie testZombie = new FastZombie();
	 	assertEquals(4, testZombie.getSpeed(), 0);
    }
 	 
 @Test
    public void testSetSpeed()  {
        
	 FastZombie testZombie = new FastZombie();
	 testZombie.setSpeed(10);
	 	assertEquals(10, testZombie.getSpeed(), 0);
    }
 
 
 @Test
    public void testGetPositionX()  {
        
	 FastZombie testZombie = new FastZombie();
	 	assertEquals(0, testZombie.getpositionX(), 0);
    }
 	 
 @Test
    public void testSetPositionX()  {
        
	 FastZombie testZombie = new FastZombie();
	 testZombie.setpositionX(10);
	 	assertEquals(10, testZombie.getpositionX(), 0);
    }
 
 @Test
    public void testGetPositionY()  {
        
	 FastZombie testZombie = new FastZombie();
	 	assertEquals(0, testZombie.getpositionY(), 0);
    }
 	 
 @Test
    public void testSetPositionY()  {
        
	 FastZombie testZombie = new FastZombie();
	 testZombie.setpositionY(10);
	 	assertEquals(10, testZombie.getpositionY(), 0);
    }
 
 @Test
    public void testGetAmtDamag()  {
        
	 FastZombie testZombie = new FastZombie();
	 	assertEquals(1, testZombie.getAmtDamage(), 0);
    }
 	 
 @Test
    public void testSetAmtDamag()  {
        
	 FastZombie testZombie = new FastZombie();
	 testZombie.setAmtDamage(10);
	 	assertEquals(10, testZombie.getAmtDamage(), 0);
    }
 
 @Test
    public void testGetAttackRange()  {
        
	 FastZombie testZombie = new FastZombie();
	 	assertEquals(1, testZombie.getAttackRange(), 0);
    }
 	 
 @Test
    public void testSetAttackRange()  {
        
	 FastZombie testZombie = new FastZombie();
	 testZombie.setAttackRange(10);
	 	assertEquals(10, testZombie.getAttackRange(), 0);
    }
 
 @Test
    public void testGetAmtHealth()  {
        
	 FastZombie testZombie = new FastZombie();
	 	assertEquals(1, testZombie.getAmtHealth(), 0);
    }
 	 
 @Test
    public void testSetAmtHealth()  {
        
	 FastZombie testZombie = new FastZombie();
	 testZombie.setAmtHealth(100);
	 	assertEquals(100, testZombie.getAmtHealth(), 0);
    }
}
