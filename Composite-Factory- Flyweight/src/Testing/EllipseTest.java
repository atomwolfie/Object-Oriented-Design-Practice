package examples.Testing;

import static org.junit.Assert.*;

import examples.shapes.Ellipse;
import examples.shapes.Point;
import examples.shapes.ShapeException;
import org.junit.Test;

public class EllipseTest {

	

    @Test
    public void testValidConstruction() throws Exception {
           
        Ellipse myEllipse = new Ellipse(1.3, 1.3, 2.6, 5.0);
        assertEquals(1.3, myEllipse.getX(), 0);
        assertEquals(1.3, myEllipse.getY(), 0);
        assertEquals(2.6, myEllipse.getWidth(),0);
        assertEquals(5.0, myEllipse.getHeight(), 0);
    }
	
    
    
    @Test
    public void testInvalidConstruction() {
   

        try {
            new Ellipse(Double.POSITIVE_INFINITY, 2, 3, 3);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }

        try {
            new Ellipse(Double.NEGATIVE_INFINITY, 2, 3, 3);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }

        try {
            new Ellipse(Double.NaN, 2, 3, 3);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }

        try {
            new Ellipse(1, Double.POSITIVE_INFINITY, 3, 3);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }

        try {
            new Ellipse(1, Double.NEGATIVE_INFINITY, 3, 3);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }

        try {
            new Ellipse(1, Double.NaN, 3, 3);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }


        try {
            new Ellipse(1, 2, Double.POSITIVE_INFINITY, 3);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }

        try {
            new Ellipse(1, 2, Double.NEGATIVE_INFINITY, 3);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
        
        try {
            new Ellipse(1, 2, 3, Double.POSITIVE_INFINITY);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
        
        try {
            new Ellipse(1, 2, 3, Double.NEGATIVE_INFINITY);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
        

        try {
            new Ellipse(1, 2, Double.NaN, 3);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
    	
        try {
            new Ellipse(1, 2, 3, Double.NaN);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
    }
    	
    
        @Test
        public void testMove() throws ShapeException {
        	Ellipse myEllipse = new Ellipse(1, 2, 5, 10);
            assertEquals(1, myEllipse.getX(), 0);
            assertEquals(2, myEllipse.getY(), 0);
            assertEquals(5, myEllipse.getWidth(), 0);
            assertEquals(10, myEllipse.getHeight(), 0);

            myEllipse.move(3,  4);
            assertEquals(4, myEllipse.getX(), 0);
            assertEquals(6, myEllipse.getY(), 0);
            assertEquals(5, myEllipse.getWidth(), 0);
            assertEquals(10, myEllipse.getHeight(), 0);

            myEllipse.move(0.123,  0.456);
            assertEquals(4.123, myEllipse.getX(), 0);
            assertEquals(6.456, myEllipse.getY(), 0);
            assertEquals(5, myEllipse.getWidth(), 0);
            assertEquals(10, myEllipse.getHeight(), 0);

            myEllipse.move(-0.123,  -0.456);
            assertEquals(4, myEllipse.getX(), 0);
            assertEquals(6, myEllipse.getY(), 0);
            assertEquals(5, myEllipse.getWidth(), 0);
            assertEquals(10, myEllipse.getHeight(), 0);

            myEllipse.move(-12,  -26);
            assertEquals(-8, myEllipse.getX(), 0);
            assertEquals(-20, myEllipse.getY(), 0);
            assertEquals(5, myEllipse.getWidth(), 0);
            assertEquals(10, myEllipse.getHeight(), 0);

            try {
            	myEllipse.move(Double.POSITIVE_INFINITY, 1);
                fail("Expected exception not thrown");
            } catch (Exception e) {
                // ignore
            }

            try {
            	myEllipse.move(Double.NEGATIVE_INFINITY, 1);
                fail("Expected exception not thrown");
            } catch (Exception e) {
                // ignore
            }

            try {
            	myEllipse.move(Double.NaN, 1);
                fail("Expected exception not thrown");
            } catch (Exception e) {
                // ignore
            }

            try {
            	myEllipse.move(1, Double.POSITIVE_INFINITY);
                fail("Expected exception not thrown");
            } catch (Exception e) {
                // ignore
            }

            try {
            	myEllipse.move(1, Double.NEGATIVE_INFINITY);
                fail("Expected exception not thrown");
            } catch (Exception e) {
                // ignore
            }

            try {
            	myEllipse.move(1, Double.NaN);
                fail("Expected exception not thrown");
            } catch (Exception e) {
                // ignore
            }

        }
    	
        @Test
        public void testScale() throws ShapeException {
            Ellipse myEllipse = new Ellipse(1, 2, 5, 10);
            assertEquals(1, myEllipse.getX(), 0);
            assertEquals(2, myEllipse.getY(), 0);
            assertEquals(5, myEllipse.getWidth(), 0);
            assertEquals(10, myEllipse.getHeight(), 0);

            myEllipse.scale(3);
            assertEquals(1, myEllipse.getX(), 0);
            assertEquals(225, myEllipse.getY(), 0);
            assertEquals(15, myEllipse.getWidth(), 0);
            assertEquals(30, myEllipse.getHeight(), 0);

            
            myEllipse.scale(0.2);
            assertEquals(1, myEllipse.getX(), 0);
            assertEquals(2, myEllipse.getY(), 0);
            assertEquals(1, myEllipse.computeArea(), 0);
            assertEquals(1, myEllipse.getWidth(), 0);
            assertEquals(2, myEllipse.getHeight(), 0);
            
            try {
            	myEllipse.scale(Double.POSITIVE_INFINITY);
                fail("Expected exception not thrown");
            } catch (Exception e) {
                // ignore
            }

            try {
            	myEllipse.scale(Double.NEGATIVE_INFINITY);
                fail("Expected exception not thrown");
            } catch (Exception e) {
                // ignore
            }

            try {
            	myEllipse.scale(Double.NaN);
                fail("Expected exception not thrown");
            } catch (Exception e) {
                // ignore
            }
        }
    
        @Test
        public void testComputeArea() throws ShapeException {
            Ellipse myEllipse = new Ellipse(1, 2, 5, 10);
            assertEquals(157.079, myEllipse.computeArea(), 0.001);

            myEllipse = new Ellipse(1, 2, 4.234, 1.234);
            assertEquals(16.414, myEllipse.computeArea(), 0.001);

            myEllipse = new Ellipse(1, 2, 0, 0);
            assertEquals(0, myEllipse.computeArea(), 0);

        }

    


}
