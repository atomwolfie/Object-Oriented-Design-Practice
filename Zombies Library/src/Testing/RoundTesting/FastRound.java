package Testing.RoundTesting;


import Zombies.ZombieFactory;

public class FastRound extends Round{

	boolean gameWantsFastZombie(){return true;}
	boolean gameWantsBasicZombie(){return false;}
	boolean gameWantsExploderZombie(){return false;}
	boolean gameWantsGoliathZombie(){return false;}
	
	private ZombieFactory zombieFactory = new ZombieFactory();
	
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
		System.out.println("adding " + roundNum + " fast zombies to round...");	
		
		for(int i = 0; i < roundNum; i++){
			addToZombieList(zombieFactory.makeZombie("F"));
		}
	}
	
	@Override
	public
	void addGoliathZombie(int roundNum) {
		//do nothing
		
	}
	
}
