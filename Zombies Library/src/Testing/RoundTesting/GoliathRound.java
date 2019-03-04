package Testing.RoundTesting;


import Zombies.ZombieFactory;

public class GoliathRound extends Round{

	boolean gameWantsGoliathZombie(){return true;}
	boolean gameWantsBasicZombie(){return false;}
	boolean gameWantsExploderZombie(){return false;}
	boolean gameWantsFastZombie(){return false;}
	
	public ZombieFactory zombieFactory = new ZombieFactory();
	
	@Override
	public
	void addBasicZombie(int roundNum) {
		// do nothing
		
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
		System.out.println("adding " + roundNum + " goliath zombies to round...");
		
		for(int i = 0; i < roundNum; i++){			
			addToZombieList(zombieFactory.makeZombie("G"));
		}
		
	}
	
	
}
