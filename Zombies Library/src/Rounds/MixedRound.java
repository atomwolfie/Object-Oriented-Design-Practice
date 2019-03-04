package Rounds;

import Zombies.BasicZombie;
import Zombies.ExploderZombie;
import Zombies.FastZombie;
import Zombies.GoliathZombie;
import Zombies.ZombieFactory;

public class MixedRound extends Round{

	
	boolean gameWantsGoliathZombie(){return true;}
	boolean gameWantsBasicZombie(){return true;}
	boolean gameWantsExploderZombie(){return true;}
	boolean gameWantsFastZombie(){return true;}
	
	private ZombieFactory zombieFactory = new ZombieFactory();

	
	@Override
	void addBasicZombie(int roundNum) {
		System.out.println("adding " + roundNum + " basic zombies to round...");
		
		for(int i = 0; i < roundNum; i++){						
			addToZombieList(zombieFactory.makeZombie("B"));
		}
	}

	@Override
	void addExploderZombie(int roundNum) {
		System.out.println("adding " + roundNum + " exploder zombies to round...");
		
		for(int i = 0; i < roundNum; i++){						
			addToZombieList(zombieFactory.makeZombie("E"));
		}
		
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
		System.out.println("adding " + roundNum + " goliath zombies to round...");
		
		for(int i = 0; i < roundNum; i++){			
			addToZombieList(zombieFactory.makeZombie("G"));
		}
		
	}

}
