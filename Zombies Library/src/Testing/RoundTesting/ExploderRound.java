package Testing.RoundTesting;

import Zombies.BasicZombie;
import Zombies.ExploderZombie;
import Zombies.ZombieFactory;

public class ExploderRound extends Round{

	boolean gameWantsExploderZombie(){return true;}
	boolean gameWantsBasicZombie(){return false;}
	boolean gameWantsFastZombie(){return false;}
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
		System.out.println("adding " + roundNum + " exploder zombies to round...");
		
		for(int i = 0; i < roundNum; i++){						
			addToZombieList(zombieFactory.makeZombie("E"));
		}
		
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
