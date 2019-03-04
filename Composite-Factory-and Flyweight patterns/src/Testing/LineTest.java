package examples.Testing;

import static org.junit.Assert.*;

import examples.shapes.Point;
import examples.shapes.ShapeException;

import examples.shapes.Line;

import org.junit.Before;
import org.junit.Test;

public class LineTest {

    @SuppressWarnings("deprecation")
	@Test
    public void testValidConstruction() throws Exception {
       
    	Point point1 = new Point(1.0,1.0);
    	Point point2 = new Point(3.0,3.0);
    	
    	

        
        //Line(double x1, double y1, double x2, double y2)
        Line myLine = new Line(1.0,1.0,3.0,3.0);
       
        assertEquals(point1.getX(), myLine.getX1());
        assertEquals(point1.getY(), myLine.getX2());
        assertEquals(point2.getX(), myLine.getY1());
        assertEquals(point2.getY(), myLine.getY2());
        
    }

    @Test
    public void testInvalidConstruction() {

    

        try {
            new Line(Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
        try {
            new Line(Double.NEGATIVE_INFINITY,Double.NEGATIVE_INFINITY,Double.NEGATIVE_INFINITY,Double.NEGATIVE_INFINITY);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
        try {
            new Line(Double.NaN,Double.NaN,Double.NaN,Double.NaN);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
        try {
            new Line(Double.POSITIVE_INFINITY,1,3,3);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
        
        try {
            new Line(1,Double.POSITIVE_INFINITY,3,3);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
        try {
            new Line(1,1,Double.POSITIVE_INFINITY,3);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
        try {
            new Line(1,1,3,Double.POSITIVE_INFINITY);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
        try {
            new Line(Double.NEGATIVE_INFINITY,1,3,3);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
        
        try {
            new Line(1,Double.NEGATIVE_INFINITY,3,3);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
        try {
            new Line(1,1,Double.NEGATIVE_INFINITY,3);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
        try {
            new Line(1,1,3,Double.NEGATIVE_INFINITY);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
        try {
            new Line(Double.NaN,1,3,3);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
        
        try {
            new Line(1,Double.NaN,3,3);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
        try {
            new Line(1,1,Double.NaN,3);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
        try {
            new Line(1,1,3,Double.NaN);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
        
        //Like the triangle test, not sure how deep I'm supposed to go here       
}

    @SuppressWarnings("deprecation")
	@Test
    public void testMove() throws ShapeException {
    	Line myLine = new Line(1,1,3,3);
    	Point point1 = new Point(1,1);
    	Point point2 = new Point(3,3);   	
    	assertEquals(point1.getX(), myLine.getX1());
    	assertEquals(point1.getY(), myLine.getX2());
    	assertEquals(point2.getX(), myLine.getY1());
    	assertEquals(point2.getY(), myLine.getY2());
    	
    	myLine.move(2, 2);
    	Point point3 = new Point(3,3);
    	Point point4 = new Point(5,5);
    	assertEquals(point3.getX(), myLine.getX1());
    	assertEquals(point3.getY(), myLine.getX2());
    	assertEquals(point4.getX(), myLine.getY1());
    	assertEquals(point4.getY(), myLine.getY2());
    	
    	   	
    	Line myLine1 = new Line(1,1,3,3);
    	Point point5 = new Point(3,-1);
    	Point point6 = new Point(5,1);
    	myLine1.move(2, -2);
    	assertEquals(point5.getX(), myLine.getX1());
    	assertEquals(point5.getY(), myLine.getX2());
    	assertEquals(point6.getX(), myLine.getY1());
    	assertEquals(point6.getY(), myLine.getY2());
    	
    	Line myLine2 = new Line(1,1,3,3);
    	Point point7 = new Point(1,3);
    	Point point8 = new Point(3,7);
    	myLine2.move(-2, 2);
    	assertEquals(point7.getX(), myLine.getX1());
    	assertEquals(point7.getY(), myLine.getX2());
    	assertEquals(point8.getX(), myLine.getY1());
    	assertEquals(point8.getY(), myLine.getY2()); 
    	
    	try {
    		myLine.move(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
    	try {
    		myLine.move(Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
    	try {
    		myLine.move(Double.POSITIVE_INFINITY, Double.NaN);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
    	try {
    		myLine.move(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
    	try {
    		myLine.move(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
    	try {
    		myLine.move(Double.NEGATIVE_INFINITY, Double.NaN);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
    	try {
    		myLine.move(Double.NaN, Double.NaN);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
    	try {
    		myLine.move(Double.NaN, Double.POSITIVE_INFINITY);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
    	try {
    		myLine.move(Double.NaN, Double.NEGATIVE_INFINITY);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
    }
    
    @Test
    public void testLength() throws ShapeException {
    	Line myLine = new Line(1,1,3,3);
    	assertEquals(2.828, myLine.computeLength(), 0.0001);
    	
    	Line myLine1 = new Line(1.312,1.321,3.847,3.332);
    	assertEquals(3.2357, myLine1.computeLength(), 0.0001);
    	
    	Line myLine2 = new Line(-1,-1,3,3);
    	assertEquals(5.6568, myLine2.computeLength(), 0.0001);
    }
    
    @Test
    public void testSlope() throws ShapeException {
    	Line myLine = new Line(1,1,3,3);
    	assertEquals(1, myLine.computeSlope(), 0.0001);
    	
    	Line myLine1 = new Line(1.312,1.321,3.847,3.332);
    	assertEquals(0.7932, myLine1.computeSlope(), 0.0001);
    	
    	Line myLine2 = new Line(-1,-1,3,3);
    	assertEquals(1, myLine2.computeSlope(), 0.0001);  
    }
    
}
