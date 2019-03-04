package examples.Testing;

import static org.junit.Assert.*;

import examples.shapes.Point;
import examples.shapes.ShapeException;
import examples.shapes.Rectangle;

import org.junit.Test;

public class RectangleTest {

	

    @Test
    public void testValidConstruction() throws Exception {
            
        Rectangle myRectangle1 = new Rectangle(1.3, 2.6, 5, 10);
        assertEquals(1.3, myRectangle1.getX(), 0);
        assertEquals(2.6, myRectangle1.getY(), 0);
        assertEquals(5, myRectangle1.getWidth(),0);
        assertEquals(10, myRectangle1.getHeight(), 0);
    }
	
    
    
    @Test
    public void testInvalidConstruction() {
    	
        try {
            new Rectangle(Double.POSITIVE_INFINITY, 2, 3, 3);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }

        try {
            new Rectangle(Double.NEGATIVE_INFINITY, 2, 3, 3);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }

        try {
            new Rectangle(Double.NaN, 2, 3, 3);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }

        try {
            new Rectangle(1, Double.POSITIVE_INFINITY, 3, 3);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }

        try {
            new Rectangle(1, Double.NEGATIVE_INFINITY, 3, 3);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }

        try {
            new Rectangle(1, Double.NaN, 3, 3);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }


        try {
            new Rectangle(1, 2, Double.POSITIVE_INFINITY, 3);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }

        try {
            new Rectangle(1, 2, Double.NEGATIVE_INFINITY, 3);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
        
        try {
            new Rectangle(1, 2, 3, Double.POSITIVE_INFINITY);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
        
        try {
            new Rectangle(1, 2, 3, Double.NEGATIVE_INFINITY);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
        

        try {
            new Rectangle(1, 2, Double.NaN, 3);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
    	
        try {
            new Rectangle(1, 2, 3, Double.NaN);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
    }
    	
    
        @Test
        public void testMove() throws ShapeException {
        	Rectangle myRectangle = new Rectangle(1, 2, 5, 10);
            assertEquals(1, myRectangle.getX(), 0);
            assertEquals(2, myRectangle.getY(), 0);
            assertEquals(5, myRectangle.getWidth(), 0);
            assertEquals(10, myRectangle.getHeight(), 0);

            myRectangle.move(3,  4);
            assertEquals(4, myRectangle.getX(), 0);
            assertEquals(6, myRectangle.getY(), 0);
            assertEquals(5, myRectangle.getWidth(), 0);
            assertEquals(10, myRectangle.getHeight(), 0);

            myRectangle.move(0.123,  0.456);
            assertEquals(4.123, myRectangle.getX(), 0);
            assertEquals(6.456, myRectangle.getY(), 0);
            assertEquals(5, myRectangle.getWidth(), 0);
            assertEquals(10, myRectangle.getHeight(), 0);

            myRectangle.move(-0.123,  -0.456);
            assertEquals(4, myRectangle.getX(), 0);
            assertEquals(6, myRectangle.getY(), 0);
            assertEquals(5, myRectangle.getWidth(), 0);
            assertEquals(10, myRectangle.getHeight(), 0);

            myRectangle.move(-12,  -26);
            assertEquals(-8, myRectangle.getX(), 0);
            assertEquals(-20, myRectangle.getY(), 0);
            assertEquals(5, myRectangle.getWidth(), 0);
            assertEquals(10, myRectangle.getHeight(), 0);

            try {
            	myRectangle.move(Double.POSITIVE_INFINITY, 1);
                fail("Expected exception not thrown");
            } catch (Exception e) {
                // ignore
            }

            try {
            	myRectangle.move(Double.NEGATIVE_INFINITY, 1);
                fail("Expected exception not thrown");
            } catch (Exception e) {
                // ignore
            }

            try {
            	myRectangle.move(Double.NaN, 1);
                fail("Expected exception not thrown");
            } catch (Exception e) {
                // ignore
            }

            try {
            	myRectangle.move(1, Double.POSITIVE_INFINITY);
                fail("Expected exception not thrown");
            } catch (Exception e) {
                // ignore
            }

            try {
            	myRectangle.move(1, Double.NEGATIVE_INFINITY);
                fail("Expected exception not thrown");
            } catch (Exception e) {
                // ignore
            }

            try {
            	myRectangle.move(1, Double.NaN);
                fail("Expected exception not thrown");
            } catch (Exception e) {
                // ignore
            }

        }
    	
        @Test
        public void testScale() throws ShapeException {
            Rectangle myRectangle = new Rectangle(1, 2, 5, 10);
            assertEquals(1, myRectangle.getX(), 0);
            assertEquals(2, myRectangle.getY(), 0);
            assertEquals(5, myRectangle.getWidth(), 0);
            assertEquals(10, myRectangle.getHeight(), 0);

            myRectangle.scale(3);
            assertEquals(1, myRectangle.getX(), 0);
            assertEquals(225, myRectangle.getY(), 0);
            assertEquals(15, myRectangle.getWidth(), 0);
            assertEquals(30, myRectangle.getHeight(), 0);

            
            myRectangle.scale(0.2);
            assertEquals(1, myRectangle.getX(), 0);
            assertEquals(2, myRectangle.getY(), 0);
            assertEquals(1, myRectangle.computeArea(), 0);
            assertEquals(1, myRectangle.getWidth(), 0);
            assertEquals(2, myRectangle.getHeight(), 0);
            
            try {
            	myRectangle.scale(Double.POSITIVE_INFINITY);
                fail("Expected exception not thrown");
            } catch (Exception e) {
                // ignore
            }

            try {
            	myRectangle.scale(Double.NEGATIVE_INFINITY);
                fail("Expected exception not thrown");
            } catch (Exception e) {
                // ignore
            }

            try {
            	myRectangle.scale(Double.NaN);
                fail("Expected exception not thrown");
            } catch (Exception e) {
                // ignore
            }
        }
    
        @Test
        public void testComputeArea() throws ShapeException {
            Rectangle myRectangle = new Rectangle(1, 2, 5, 10);
            assertEquals(50, myRectangle.computeArea(), 0.001);

            myRectangle = new Rectangle(1, 2, 4.234, 1.234);
            assertEquals(5.224, myRectangle.computeArea(), 0.001);

            myRectangle = new Rectangle(1, 2, 0, 0);
            assertEquals(0, myRectangle.computeArea(), 0);

        }

    


}
