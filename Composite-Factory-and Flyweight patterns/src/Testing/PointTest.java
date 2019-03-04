package examples.Testing;

import static org.junit.Assert.*;

import examples.shapes.Point;
import examples.shapes.ShapeException;
import examples.shapes.Point;


import org.junit.Before;
import org.junit.Test;

public class PointTest {

    @Test
    public void testValidConstruction() throws Exception {
       
    	Point point = new Point(1,1);
    	assertEquals(1, point.getX(), 0);
    	assertEquals(1, point.getY(), 0);       
    }

    @Test
    public void testInvalidConstruction() {

       

        try {
            new Point(Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
        try {
            new Point(Double.POSITIVE_INFINITY,Double.NEGATIVE_INFINITY);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
        try {
            new Point(Double.POSITIVE_INFINITY,Double.NaN);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
        try {
            new Point(Double.NEGATIVE_INFINITY,Double.POSITIVE_INFINITY);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
        try {
            new Point(Double.NEGATIVE_INFINITY,Double.NEGATIVE_INFINITY);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
        try {
            new Point(Double.NEGATIVE_INFINITY,Double.NaN);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
        try {
            new Point(Double.NaN,Double.POSITIVE_INFINITY);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
        try {
            new Point(Double.NaN,Double.NEGATIVE_INFINITY);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
        try {
            new Point(Double.NaN,Double.NaN);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
              
}

    @Test
    public void testMove() throws ShapeException {
    	Point point = new Point(1,1);
    	assertEquals(1, point.getX(), 0);
    	assertEquals(1, point.getY(), 0); 
    	
    	point.move(4, 3);
    	assertEquals(4, point.getX(), 0);
    	assertEquals(3, point.getY(), 0);
    	
    	point.move(-4, 3);
    	assertEquals(-4, point.getX(), 0);
    	assertEquals(3, point.getY(), 0);
    	
    	point.move(4, -3);
    	assertEquals(4, point.getX(), 0);
    	assertEquals(-3, point.getY(), 0);
    	
    	try {
    		point.move(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
    	try {
    		point.move(Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
    	try {
    		point.move(Double.POSITIVE_INFINITY, Double.NaN);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
    	try {
    		point.move(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
    	try {
    		point.move(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
    	try {
    		point.move(Double.NEGATIVE_INFINITY, Double.NaN);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
    	try {
    		point.move(Double.NaN, Double.NaN);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
    	try {
    		point.move(Double.NaN, Double.POSITIVE_INFINITY);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
    	try {
    		point.move(Double.NaN, Double.NEGATIVE_INFINITY);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
    }
    
    @Test
    public void testCopy() throws ShapeException {
    	Point point = new Point(1,1);
    	assertSame(point, point.copy());
    	
    	Point point1 = new Point(-1,1);
    	assertSame(point1, point1.copy());
    	
    	Point point2 = new Point(1,-1);
    	assertSame(point2, point2.copy());

    }
    
   
    
}
