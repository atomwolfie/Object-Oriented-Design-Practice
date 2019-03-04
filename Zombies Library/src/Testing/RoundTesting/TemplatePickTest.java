package Testing.RoundTesting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TemplatePickTest {

	@Test
    public void testValidBasicConstruction()  {	        
	 	RoundTemplatePicker picker = new RoundTemplatePicker(); 
    }

	@Test
    public void testBasic()  {	        
	 	RoundTemplatePicker picker = new RoundTemplatePicker();
	 	
	 	Round round = picker.makeRound(1, 0);	 	
	 	assertSame("basic", picker.roundType);
    }
	
	@Test
    public void testFast()  {	        
	 	RoundTemplatePicker picker = new RoundTemplatePicker(); 
	 	Round round = picker.makeRound(2, 0);	 	
	 	assertSame("fast", picker.roundType);
    }
	
	@Test
    public void testExploder()  {	        
	 	RoundTemplatePicker picker = new RoundTemplatePicker(); 
	 	Round round = picker.makeRound(3, 0);	 	
	 	assertSame("exploder", picker.roundType);
    }
	
	@Test
    public void testGoliath()  {	        
	 	RoundTemplatePicker picker = new RoundTemplatePicker(); 
	 	Round round = picker.makeRound(4, 0);	 	
	 	assertSame("goliath", picker.roundType);
    }
	
	@Test
    public void testMixed()  {	        
	 	RoundTemplatePicker picker = new RoundTemplatePicker(); 
	 	Round round = picker.makeRound(5, 0);	 	
	 	assertSame("mixed", picker.roundType);
    }
	
}
