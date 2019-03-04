package examples.Testing.CompositeTesting;

import static org.junit.Assert.*;


import org.junit.Test;

import examples.Composite.ShapeComponent;
import examples.Composite.ShapeGroup;
import examples.shapes.Circle;
import examples.shapes.Point;

public class ShapeComponentTest {

	
	
	@Test
    public void testSetCenterWithDoubles() throws Exception {
		
		ShapeComponent circle = new Circle(0,0,5);
		
		
		circle.setCenter(0, 0);
		circle.setCenter(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
		circle.setCenter(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
		circle.setCenter(Double.NaN, Double.NaN);
		
		circle.setCenter(24, 3);
		Point newPoint = new Point(24,3);
		assertSame(newPoint, circle.getCenter());	
	}

	
	@Test
    public void testSetCenterWithPoints() throws Exception {
		
		ShapeComponent circle = new Circle(0,0,5);
		
		Point newPoint = new Point(0,0);
		
		try {
			newPoint.setX(Double.POSITIVE_INFINITY);
			newPoint.setY(Double.POSITIVE_INFINITY);
			
			circle.setCenter(newPoint);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
		
		try {
			newPoint.setX(Double.NEGATIVE_INFINITY);
			newPoint.setY(Double.NEGATIVE_INFINITY);			
			circle.setCenter(newPoint);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
		
	
		try {
			newPoint.setX(Double.NaN);
			newPoint.setY(Double.NaN);			
			circle.setCenter(newPoint);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }	
	}
	
	
	@Test
    public void testAdd() throws Exception {
		
		ShapeComponent roundShapes = new ShapeGroup("Round", "Shapes that have a spherical nature");
		
		
		roundShapes.add(new Circle(0,0,5));
		
		
		try {
			roundShapes.add(new Circle(Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY,5));
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
		
		try {
			roundShapes.add(new Circle(Double.NEGATIVE_INFINITY,Double.NEGATIVE_INFINITY,5));
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
		
		try {
			roundShapes.add(new Circle(Double.NaN,Double.NaN,5));
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
	}
	
	
	@Test
    public void testRemove() throws Exception {
		
		ShapeComponent roundShapes = new ShapeGroup("Round", "Shapes that have a spherical nature");
		
		ShapeComponent circle = new Circle(0,0,5);
		
		roundShapes.add(circle);
		roundShapes.remove(circle);		
	}

	@Test
    public void testRemoveAll() throws Exception {
		
		ShapeComponent roundShapes = new ShapeGroup("Round", "Shapes that have a spherical nature");
		
		ShapeComponent circle = new Circle(0,0,5);
		ShapeComponent circle1 = new Circle(0,0,5);
		ShapeComponent circle2 = new Circle(0,0,5);
		
		roundShapes.add(circle);
		roundShapes.add(circle1);
		roundShapes.add(circle2);
		
		roundShapes.removeAll();		
	}
	
	
	@Test
    public void testGetShapeCenter() throws Exception {				
		ShapeComponent circle = new Circle(0,0,5);
		Point newPoint = new Point(0,0);
		assertSame(newPoint, circle.getCenter());	
	}
	
	@Test
    public void testDisplayInfo() throws Exception {				
		ShapeComponent circle = new Circle(0,0,5);
		circle.displayShapeInfo();	
	}
	
	
	@Test
    public void testScale() throws Exception {
        Circle myCircle = new Circle(1, 2, 5);
        assertEquals(1, myCircle.getCenter().getX(), 0);
        assertEquals(2, myCircle.getCenter().getY(), 0);
        assertEquals(5, myCircle.getRadius(), 0);

        myCircle.scale(3);
        assertEquals(1, myCircle.getCenter().getX(), 0);
        assertEquals(2, myCircle.getCenter().getY(), 0);
        assertEquals(15, myCircle.getRadius(), 0);

        myCircle.scale(0.2);
        assertEquals(1, myCircle.getCenter().getX(), 0);
        assertEquals(2, myCircle.getCenter().getY(), 0);
        assertEquals(3, myCircle.getRadius(), 0);

        try {
            myCircle.scale(Double.POSITIVE_INFINITY);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }

        try {
            myCircle.scale(Double.NEGATIVE_INFINITY);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }

        try {
            myCircle.scale(Double.NaN);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
    }
	
	
	@Test
    public void testComputeArea() throws Exception {
		ShapeComponent myCircle = new Circle(1, 2, 5);
        assertEquals(78.53975, myCircle.computeArea(), 0.0001);

        myCircle = new Circle(1, 2, 4.234);
        assertEquals(56.3185174, myCircle.computeArea(), 0.0001);

        myCircle = new Circle(1, 2, 0);
        assertEquals(0, myCircle.computeArea(), 0);
    }
	
	 @Test
	    public void testMove() throws Exception {
	        ShapeComponent myCircle = new Circle(1, 2, 5);
	        assertEquals(1, myCircle.getCenter().getX(), 0);
	        assertEquals(2, myCircle.getCenter().getY(), 0);

	        myCircle.move(3,  4);
	        assertEquals(4, myCircle.getCenter().getX(), 0);
	        assertEquals(6, myCircle.getCenter().getY(), 0);

	        myCircle.move(0.123,  0.456);
	        assertEquals(4.123, myCircle.getCenter().getX(), 0);
	        assertEquals(6.456, myCircle.getCenter().getY(), 0);

	        myCircle.move(-0.123,  -0.456);
	        assertEquals(4, myCircle.getCenter().getX(), 0);
	        assertEquals(6, myCircle.getCenter().getY(), 0);

	        myCircle.move(-12,  -26);
	        assertEquals(-8, myCircle.getCenter().getX(), 0);
	        assertEquals(-20, myCircle.getCenter().getY(), 0);

	        try {
	            myCircle.move(Double.POSITIVE_INFINITY, 1);
	            fail("Expected exception not thrown");
	        } catch (Exception e) {
	            // ignore
	        }

	        try {
	            myCircle.move(Double.NEGATIVE_INFINITY, 1);
	            fail("Expected exception not thrown");
	        } catch (Exception e) {
	            // ignore
	        }

	        try {
	            myCircle.move(Double.NaN, 1);
	            fail("Expected exception not thrown");
	        } catch (Exception e) {
	            // ignore
	        }

	        try {
	            myCircle.move(1, Double.POSITIVE_INFINITY);
	            fail("Expected exception not thrown");
	        } catch (Exception e) {
	            // ignore
	        }

	        try {
	            myCircle.move(1, Double.NEGATIVE_INFINITY);
	            fail("Expected exception not thrown");
	        } catch (Exception e) {
	            // ignore
	        }

	        try {
	            myCircle.move(1, Double.NaN);
	            fail("Expected exception not thrown");
	        } catch (Exception e) {
	            // ignore
	        }

	    }
	
}
