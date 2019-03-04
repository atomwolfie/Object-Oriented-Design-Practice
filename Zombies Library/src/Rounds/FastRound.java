package Rounds;


import Zombies.ZombieFactory;

public class FastRound extends Round{

	boolean gameWantsFastZombie(){return true;}
	boolean gameWantsBasicZombie(){return false;}
	boolean gameWantsExploderZombie(){return false;}
	boolean gameWantsGoliathZombie(){return false;}
	
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
		System.out.println("adding " + roundNum + " fast zombies to round...");	
		
		for(int i = 0; i < roundNum; i++){
			addToZombieList(zombieFactory.makeZombie("F"));
		}
	}
	
	@Override
	void addGoliathZombie(int roundNum) {
		//do nothing
		
	}
	
}
