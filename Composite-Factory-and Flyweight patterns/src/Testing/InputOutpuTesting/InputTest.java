package examples.Testing.InputOutpuTesting;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import examples.InputOutput.Input;
import examples.shapes.ShapeException;



public class InputTest {

	   
	   @Test
       public void testReadTxt() throws IOException, ShapeException  {
           
		   String stringGivenByUser = "ABC.txt";
		    		  		   
		   Input inputGuy = new Input();
		   inputGuy.readFile(stringGivenByUser);	   				   
		   //need asserts
       }
	   
	   @Test
       public void testReadBmp() throws IOException, ShapeException  {
           
		   String stringGivenByUser = "bitmap-image-icon.bmp";
		    		  		   
		   Input inputGuy = new Input();
		   inputGuy.readFile(stringGivenByUser);	   				   
		   //need asserts
       }

}
