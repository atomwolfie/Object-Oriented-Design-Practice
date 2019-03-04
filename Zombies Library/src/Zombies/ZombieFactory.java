package Zombies;

public class ZombieFactory {

	
	public Zombie makeZombie(String newZombieType){
		
		Zombie newZombie = null;
		
		
		if(newZombieType.equals("B")){
			return new BasicZombie();
		}
		
		if(newZombieType.equals("E")){
			return new ExploderZombie();
		}
		
		if(newZombieType.equals("F")){
			return new FastZombie();
		}
		
		if(newZombieType.equals("G")){
			return new GoliathZombie();
		}
		
		else return null;
		
	}
	
	
}
