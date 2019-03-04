package Rounds;


import Zombies.ZombieFactory;

public class GoliathRound extends Round{

	boolean gameWantsGoliathZombie(){return true;}
	boolean gameWantsBasicZombie(){return false;}
	boolean gameWantsExploderZombie(){return false;}
	boolean gameWantsFastZombie(){return false;}
	
	private ZombieFactory zombieFactory = new ZombieFactory();
	
	@Override
	void addBasicZombie(int roundNum) {
		// do nothing
		
	}
	@Override
	void addExploderZombie(int roundNum) {
		// do nothing
		
	}
	@Override
	void addFastZombie(int roundNum) {
		// do nothing
		
	}
	@Override
	void addGoliathZombie(int roundNum) {
		System.out.println("adding " + roundNum + " goliath zombies to round...");
		
		for(int i = 0; i < roundNum; i++){			
			addToZombieList(zombieFactory.makeZombie("G"));
		}
		
	}
	
	
}
