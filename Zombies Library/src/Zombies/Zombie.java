package Zombies;

public abstract class Zombie {

	private String name;
	private double speed;
	private double positionX, positionY;
	private double amountDamage;
	private double attackRange;
	private double amtHealth;
	
	public String getName(){return name;}
	public void setName(String newName){ name = newName;}
	
	public double getSpeed(){return speed;}
	public void setSpeed(double newSpeed){speed = newSpeed;}
	
	public double getpositionX(){return positionX;}
	public void setpositionX(double newPosition){positionX = newPosition;}
	
	public double getpositionY(){return positionY;}
	public void setpositionY(double newPosition){positionY = newPosition;}
	
	public double getAmtDamage(){return amountDamage;}
	public void setAmtDamage(double newDamageAmt){ amountDamage = newDamageAmt;}
	
	public double getAttackRange(){return attackRange;}
	public void setAttackRange(double newRange){attackRange = newRange;}
	
	public double getAmtHealth(){return amtHealth;}
	public void setAmtHealth(double newHealthAmt){amtHealth = newHealthAmt;}
	
	
	public void chasePlayer(){
		System.out.println(getName() + "is chasing the player!");
	}
	

	public void zombieAttack(){
		System.out.println(getName() + "attacks the player and does" + getAmtDamage() + "damage!");
	}
	
	public void printAttributes(){
		System.out.println("Name: " + getName() + " \n Speed: " + getSpeed() 
		+ "\n X,Y position: " + getpositionX() + "," + getpositionY() 
		+ "\n Damage Ammount: " + getAmtDamage() + "\n Attack Range" + getAttackRange() + "\n Health Amount: " + getAmtHealth());
	}
	
	
	
}
