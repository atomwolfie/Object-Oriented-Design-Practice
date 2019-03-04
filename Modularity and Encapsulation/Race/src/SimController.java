package Race;
import Exceptions.ApplicationException;
import Racedata.IAthleteUpdateHandler;
import Racedata.SimulatedDataSource;

public class SimController {

	private SimulatedDataSource simData;
	
	public void Initialize(String inputFileName) throws ApplicationException, InterruptedException{
		simData = new SimulatedDataSource();
		IAthleteUpdateHandler handler = new DataProcessor();
		
		simData.setHandler(handler);
		simData.setInputFilename(inputFileName);
		
			
		simData.Start();  
        //Include threads in java
        Thread.sleep(180000);
        simData.Stop();
	}
	
}
