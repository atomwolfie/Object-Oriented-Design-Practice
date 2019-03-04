package examples.Testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import examples.shapes.Circle;
import examples.shapes.EmbeddedImage;
import examples.shapes.Point;
import examples.shapes.ShapeException;

public class EmbeddedImageTest {

	
	@Test
	public void testValidConstruction() throws ShapeException  {
	
		
	EmbeddedImage bitImage = new EmbeddedImage(0,0,700,700,"bitmap-image-icon.bmp");
		
		
	assertEquals(0, bitImage.getX(), 0);
	assertEquals(0, bitImage.getY(), 0);
	
	assertEquals(700,bitImage.getDimensionX(), 700);
	assertEquals(700,bitImage.getDimensionY(), 700);
	
	}
	
	
	@Test
    public void testInvalidConstruction() {


        try {
        	new EmbeddedImage(Double.POSITIVE_INFINITY,0,700,700,"bitmap-image-icon.bmp");
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
        
        try {
        	new EmbeddedImage(Double.NEGATIVE_INFINITY,0,700,700,"bitmap-image-icon.bmp");
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
        
        try {
        	new EmbeddedImage(Double.NaN,0,700,700,"bitmap-image-icon.bmp");
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
        try {
        	new EmbeddedImage(0,0,Double.POSITIVE_INFINITY,700,"bitmap-image-icon.bmp");
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
        try {
        	new EmbeddedImage(0,0,Double.NEGATIVE_INFINITY,700,"bitmap-image-icon.bmp");
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
        try {
        	new EmbeddedImage(0,0,Double.NaN,700,"bitmap-image-icon.bmp");
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
	}
	
	@Test
	public void testShowImage() throws ShapeException  {
	
	EmbeddedImage bitImage = new EmbeddedImage("bitmap-image-icon.bmp");
		
	bitImage.showImage();
	
	}

	
}
