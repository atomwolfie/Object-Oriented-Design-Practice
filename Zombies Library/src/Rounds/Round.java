package Rounds;

import java.util.ArrayList;

import Zombies.Zombie;

public abstract class Round {

	private ArrayList<Zombie> zombies = new ArrayList();
	
	final void makeRound(){	}
	
	//must be overridden by the extended classes
	abstract void addBasicZombie(int roundNum);
	abstract void addExploderZombie(int roundNum);
	abstract void addFastZombie(int roundNum);
	abstract void addGoliathZombie(int roundNum);
	
	
	//hooks
	boolean gameWantsBasicZombie(){return true;}
	boolean gameWantsExploderZombie(){return true;}
	boolean gameWantsFastZombie(){return true;}
	boolean gameWantsGoliathZombie(){return true;}
	
	
	public void addToZombieList(Zombie newZombie){
		zombies.add(newZombie);
	}
	
	public void printZombies(){
		for(int i = 0; i < zombies.size(); i++){
			System.out.println(zombies.get(i).getName());
		}
	}
}
