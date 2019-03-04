package Zombies;

public class BasicZombie extends Zombie{

	public BasicZombie(){
		
		setName("Basic Zombie");
		setSpeed(1);
		setpositionX(0);
		setpositionY(0);
		setAmtDamage(1);
		setAttackRange(1);
		setAmtHealth(1);
	}

	public BasicZombie(double positionX,  double positionY){
		
		setName("Basic Zombie");
		setSpeed(1);
		setpositionX(positionX);
		setpositionY(positionY);
		setAmtDamage(1);
		setAttackRange(1);
	}
	
}
