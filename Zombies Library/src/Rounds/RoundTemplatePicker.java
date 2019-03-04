package Rounds;

public class RoundTemplatePicker {

	public RoundTemplatePicker(){}
	
	
	//creates random rounds types that scale in difficulty as the round number increases
	
	public Round makeRound(int random, int roundNumber){
		
		Round round = null;
		
		if(random == 1){
			System.out.println("Basic Zombie round....");
			BasicRound basicRound = new BasicRound();
			basicRound.addBasicZombie(roundNumber);
			return basicRound;
		}
		
		if(random == 2){
			System.out.println("Fast Zombie round....");
			FastRound fastRound = new FastRound();
			fastRound.addFastZombie(roundNumber);
			return fastRound;
		}
		
		if(random == 3){
			System.out.println("Exploder Zombie round....");
			ExploderRound exploderRound = new ExploderRound();
			exploderRound.addExploderZombie(roundNumber);
			return exploderRound;
		}
		
		if(random == 4){
			System.out.println("Galiath Zombie round....");
			GoliathRound goliathRound = new GoliathRound();
			goliathRound.addGoliathZombie(roundNumber);
			return goliathRound;
		}
		
		if(random == 5){
			System.out.println("Mixed Zombie round....");
			MixedRound mixedRound = new MixedRound();
			mixedRound.addBasicZombie(roundNumber);
			mixedRound.addFastZombie(roundNumber);
			mixedRound.addExploderZombie(roundNumber);
			mixedRound.addGoliathZombie(roundNumber);
					
			return mixedRound;
		}
		
		
		return round;
	}
	
	
}
