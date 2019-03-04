package Player;

public class Player {

	
	private String name;
	private double speed;
	private double positionX, positionY;
	private double amountDamage;
	private double attackRange;
	private double amtHealth;
	private double amtPoints;
	
	
	public Player(){
		
		setName("Player");
		setSpeed(3);
		setpositionX(0);
		setpositionY(0);
		setAmtDamage(2);
		setAttackRange(1);
		setAmtHealth(20);		
	}
	
	
	
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

	public double getAmtPoints(){return amtPoints;}
	public void setAmtPoints(double newPointAmt){amtPoints = newPointAmt;}
	
	
	public void shoot(){
		System.out.println("Player shoots at a zombie!");
	}
	
	public void run(){
		System.out.println("Player tries to run!");
	}
	
	public void move(int x, int y){
		
		if(x - positionX > speed  || y - positionY > speed){
			System.out.println("Invalid move, too far!");
		}
		else{
			setpositionX(x);
			setpositionY(y);			
			System.out.println("The player has moved to the following location: " + positionX + "," + positionY);
		}
	}
}
