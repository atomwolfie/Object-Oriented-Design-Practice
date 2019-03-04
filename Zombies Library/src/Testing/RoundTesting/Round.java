package Testing.RoundTesting;

import java.util.ArrayList;

import Zombies.Zombie;

public abstract class Round {

	public ArrayList<Zombie> zombies = new ArrayList();
	
	final void makeRound(){	}
	
	//must be overridden by the extended classes
	public abstract void addBasicZombie(int roundNum);
	public abstract void addExploderZombie(int roundNum);
	public abstract void addFastZombie(int roundNum);
	public abstract void addGoliathZombie(int roundNum);
	
	
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
