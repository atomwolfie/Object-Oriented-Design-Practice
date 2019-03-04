package Zombies;

public class FastZombie extends Zombie{

	
	
public FastZombie(){
		
		setName("Fast Zombie");
		setSpeed(4);
		setpositionX(0);
		setpositionY(0);
		setAmtDamage(1);
		setAttackRange(1);
		setAmtHealth(1);
	}

	public FastZombie(double positionX,  double positionY){
		
		setName("Fast Zombie");
		setSpeed(4);
		setpositionX(positionX);
		setpositionY(positionY);
		setAmtDamage(1);
		setAttackRange(1);
		setAmtHealth(1);
	}
	
	
}
