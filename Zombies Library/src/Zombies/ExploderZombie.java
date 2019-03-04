package Zombies;

public class ExploderZombie extends Zombie {

	
public ExploderZombie(){
		
		setName("Exploder Zombie");
		setSpeed(1);
		setpositionX(0);
		setpositionY(0);
		setAmtDamage(3);
		setAttackRange(5);
		setAmtHealth(2);
	}

	public ExploderZombie(double positionX,  double positionY){
		
		setName("Exploder Zombie");
		setSpeed(1);
		setpositionX(positionX);
		setpositionY(positionY);
		setAmtDamage(3);
		setAttackRange(5);
	}
	
}
