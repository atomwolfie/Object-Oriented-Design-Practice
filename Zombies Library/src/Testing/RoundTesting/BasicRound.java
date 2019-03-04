package Testing.RoundTesting;

import Zombies.ZombieFactory;

public class BasicRound extends Round{

	boolean gameWantsBasicZombie(){return true;}
	boolean gameWantsExploderZombie(){return false;}
	boolean gameWantsFastZombie(){return false;}
	boolean gameWantsGoliathZombie(){return false;}
	
	public ZombieFactory zombieFactory = new ZombieFactory();
	
	@Override
	public
	void addBasicZombie(int roundNum) {
		System.out.println("adding " + roundNum + " basic zombies to round...");
		
		for(int i = 0; i < roundNum; i++){			
			addToZombieList(zombieFactory.makeZombie("B"));
		}		
	}
	
	@Override
	public
	void addExploderZombie(int roundNum) {
		// do nothing
		
	}
	@Override
	public
	void addFastZombie(int roundNum) {
		// do nothing
		
	}
	@Override
	public
	void addGoliathZombie(int roundNum) {
		// do nothing
		
	}
	
}
