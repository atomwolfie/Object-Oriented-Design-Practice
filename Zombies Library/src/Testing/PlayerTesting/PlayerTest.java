package Testing.PlayerTesting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Player.Player;


public class PlayerTest {

	 @Test
	    public void testValidConstruction()  {	        
		 	Player testPlayer = new Player();	       
	    }

	 	 	 
	 @Test
	    public void testGetName()  {
	        
		 	Player testPlayer = new Player();
	       assertSame("Player", testPlayer.getName());
	    }
	 	 
	 @Test
	    public void testSetName()  {
	        
		 	Player testPlayer = new Player();
		 	testPlayer.setName("newPlayer");
		 	assertSame("newPlayer", testPlayer.getName());
	    }
	 
	  
	 @Test
	    public void testGetSpeed()  {
	        
		 	Player testPlayer = new Player();
		 	assertEquals(3, testPlayer.getSpeed(), 0);
	    }
	 	 
	 @Test
	    public void testSetSpeed()  {
	        
		 	Player testPlayer = new Player();
		 	testPlayer.setSpeed(10);
		 	assertEquals(10, testPlayer.getSpeed(), 0);
		 	
		 	testPlayer.setSpeed(-10);
		 	assertEquals(-10, testPlayer.getSpeed(), 0);
	    }
	 
	 
	 @Test
	    public void testGetPositionX()  {
	        
		 	Player testPlayer = new Player();
		 	assertEquals(0, testPlayer.getpositionX(), 0);
	    }
	 	 
	 @Test
	    public void testSetPositionX()  {
	        
		 	Player testPlayer = new Player();
		 	testPlayer.setpositionX(10);
		 	assertEquals(10, testPlayer.getpositionX(), 0);
		 	
		 	testPlayer.setpositionX(-10);
		 	assertEquals(-10, testPlayer.getpositionX(), 0);
	    }
	 
	 @Test
	    public void testGetPositionY()  {
	        
		 	Player testPlayer = new Player();
		 	assertEquals(0, testPlayer.getpositionY(), 0);
	    }
	 	 
	 @Test
	    public void testSetPositionY()  {
	        
		 	Player testPlayer = new Player();
		 	testPlayer.setpositionY(10);
		 	assertEquals(10, testPlayer.getpositionY(), 0);
		 	
		 	testPlayer.setpositionY(-10);
		 	assertEquals(-10, testPlayer.getpositionY(), 0);
	    }
	 
	 @Test
	    public void testGetAmtDamag()  {
	        
		 	Player testPlayer = new Player();
		 	assertEquals(2, testPlayer.getAmtDamage(), 0);
	    }
	 	 
	 @Test
	    public void testSetAmtDamag()  {
	        
		 	Player testPlayer = new Player();
		 	testPlayer.setAmtDamage(10);
		 	assertEquals(10, testPlayer.getAmtDamage(), 0);
		 	
		 	testPlayer.setAmtDamage(-10);
		 	assertEquals(-10, testPlayer.getAmtDamage(), 0);
	    }
	 
	 @Test
	    public void testGetAttackRange()  {
	        
		 	Player testPlayer = new Player();
		 	assertEquals(1, testPlayer.getAttackRange(), 0);
	    }
	 	 
	 @Test
	    public void testSetAttackRange()  {
	        
		 	Player testPlayer = new Player();
		 	testPlayer.setAttackRange(10);
		 	assertEquals(10, testPlayer.getAttackRange(), 0);
		 	
		 	testPlayer.setAttackRange(-10);
		 	assertEquals(-10, testPlayer.getAttackRange(), 0);
	    }
	 
	 @Test
	    public void testGetAmtHealth()  {
	        
		 	Player testPlayer = new Player();
		 	assertEquals(20, testPlayer.getAmtHealth(), 0);
	    }
	 	 
	 @Test
	    public void testSetAmtHealth()  {
	        
		 	Player testPlayer = new Player();
		 	testPlayer.setAmtHealth(100);
		 	assertEquals(100, testPlayer.getAmtHealth(), 0);
		 	
		 	testPlayer.setAmtHealth(-100);
		 	assertEquals(-100, testPlayer.getAmtHealth(), 0);
	    }
	 
	 @Test
	    public void testGetAmtPoint()  {
	        
		 	Player testPlayer = new Player();
		 	assertEquals(0, testPlayer.getAmtPoints(), 0);
	    }
	 	 
	 @Test
	    public void testSetAmtPoint()  {
	        
		 	Player testPlayer = new Player();
		 	testPlayer.setAmtPoints(1000);
		 	assertEquals(1000, testPlayer.getAmtPoints(), 0);
		 	
		 	testPlayer.setAmtPoints(-1000);
		 	assertEquals(-1000, testPlayer.getAmtPoints(), 0);		 	
	    }	 
}
