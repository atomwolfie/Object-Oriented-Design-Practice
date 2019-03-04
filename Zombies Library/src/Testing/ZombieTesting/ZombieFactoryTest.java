package Testing.ZombieTesting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Zombies.BasicZombie;
import Zombies.ExploderZombie;
import Zombies.FastZombie;
import Zombies.GoliathZombie;
import Zombies.Zombie;
import Zombies.ZombieFactory;

public class ZombieFactoryTest {


	@Test
    public void testBasicZombieCreation()  {	        
			System.out.println("\n Basic Zombie Test");     
			ZombieFactory zombieFactory = new ZombieFactory();
	 	      String zombieType = "B";
	 	     	 	      
	 	      Zombie zombie = null;
	 	      
	 	     zombie = zombieFactory.makeZombie(zombieType);
	 	     System.out.println("Zombie from Factory"); 
	 	     zombie.printAttributes();  
	 	    	 	    	 	     
	 	     BasicZombie basicZombie = new BasicZombie();
	 	     System.out.println("\n Basic Zombie Construtor: "); 
	 	     basicZombie.printAttributes();	 
	 	     	 	     
	 	     //assertSame(zombie,basicZombie);	 	    
	 	     // Not sure how to get assert tests to work when comparing the sameness of classes, did print test instead
    }
	
		
	@Test
    public void testExploderZombieCreation()  {	    
		  System.out.println("\n Exploder Zombie Test");
		  ZombieFactory zombieFactory = new ZombieFactory();
 	      String zombieType = "E";
 	     	 	      
 	      Zombie zombie = null;
 	      
 	     zombie = zombieFactory.makeZombie(zombieType);
 	     System.out.println("\n Zombie from Factory"); 
 	     zombie.printAttributes();  
 	    	 	    	 	     
 	     ExploderZombie exploderZombie = new ExploderZombie();
 	     System.out.println("\n Exploder Zombie Construtor: "); 
 	     exploderZombie.printAttributes();
    }
	
	
	@Test
    public void testGoliathZombieCreation()  {	        
		  System.out.println("\n Exploder Zombie Test");
		  ZombieFactory zombieFactory = new ZombieFactory();
	      String zombieType = "G";
	     	 	      
	      Zombie zombie = null;
	      
	     zombie = zombieFactory.makeZombie(zombieType);
	     System.out.println("\n Zombie from Factory"); 
	     zombie.printAttributes();  
	    	 	    	 	     
	     GoliathZombie goliathZombie = new GoliathZombie();
	     System.out.println("\n Goliath Zombie Construtor: "); 
	     goliathZombie.printAttributes();    
    }
	
	
	@Test
    public void testFastZombieCreation()  {	        
		  System.out.println("\n Fast Zombie Test");
		  ZombieFactory zombieFactory = new ZombieFactory();
	      String zombieType = "F";
	     	 	      
	      Zombie zombie = null;
	      
	     zombie = zombieFactory.makeZombie(zombieType);
	     System.out.println("\n Zombie from Factory"); 
	     zombie.printAttributes();  
	    	 	    	 	     
	     FastZombie fastZombie = new FastZombie();
	     System.out.println("\n Fast Zombie Construtor: "); 
	     fastZombie.printAttributes();        
    }
	
	
}
