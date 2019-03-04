package Zombies;

public class GoliathZombie extends Zombie{

public GoliathZombie(){
		
		setName("Goliath Zombie");
		setSpeed(1);
		setpositionX(0);
		setpositionY(0);
		setAmtDamage(2);
		setAttackRange(1);
		setAmtHealth(8);
	}

	public GoliathZombie(double positionX,  double positionY){
		
		setName("Goliath Zombie");
		setSpeed(1);
		setpositionX(positionX);
		setpositionY(positionY);
		setAmtDamage(2);
		setAttackRange(1);
		setAmtHealth(8);
	}
	
}
