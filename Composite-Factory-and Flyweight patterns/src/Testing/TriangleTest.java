package examples.Testing;

import static org.junit.Assert.*;

import examples.shapes.Point;
import examples.shapes.ShapeException;
import examples.shapes.Triangle;
import org.junit.Test;

public class TriangleTest {

	

    @Test
    public void testValidConstruction() throws Exception {
       
    	   //Triangle(double x, double y, double t1, double t2, double l1, double l2, double r1, double r2)
        Triangle myTriangle1 = new Triangle(1.3, 2.6, 10, 15, 5, 5, 15, 5);
        assertEquals(1.3, myTriangle1.getX(), 0);
        assertEquals(2.6, myTriangle1.getY(), 0);
        assertEquals(10, myTriangle1.getT1(), 0);
        assertEquals(15, myTriangle1.getT2(), 0);
        assertEquals(5, myTriangle1.getL1(), 0);
        assertEquals(5, myTriangle1.getL2(), 0);
        assertEquals(15, myTriangle1.getR1(), 0);
        assertEquals(5, myTriangle1.getR2(), 0);
        
    }
	
    
    
    @Test
    public void testInvalidConstruction() {
    	
        
        try {
            new Triangle(1,2, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
        
        try {
            new Triangle(1,2, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
        try {
            new Triangle(1,2, Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
             
        try {
            new Triangle( 1,2, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, 5, 5, 15, 5);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }

        try {
            new Triangle(1,2, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, 5, 5, 15, 5);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
    	
        try {
            new Triangle(1,2, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, 5, 5, 15, 5);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }

        try {
            new Triangle(1,2, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, 5, 5, 15, 5);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
        
              
        
        try {
            new Triangle(1,2, Double.NaN, Double.NEGATIVE_INFINITY, 5, 5, 15, 5);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
        try {
            new Triangle(1,2, Double.NEGATIVE_INFINITY, Double.NaN, 5, 5, 15, 5);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
        
        try {
            new Triangle(1,2, Double.NaN, Double.POSITIVE_INFINITY, 5, 5, 15, 5);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
        try {
            new Triangle(1,2, Double.POSITIVE_INFINITY, Double.NaN, 5, 5, 15, 5);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
        try {
            new Triangle(1,2, Double.POSITIVE_INFINITY, 15, 5, 5, 15, 5);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
        try {
            new Triangle(1,2, 10, Double.POSITIVE_INFINITY, 5, 5, 15, 5);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
        try {
            new Triangle(1,2, 10, 15, Double.POSITIVE_INFINITY, 5, 15, 5);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
        try {
            new Triangle(1,2, 10, 15, 5, Double.POSITIVE_INFINITY, 15, 5);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
        try {
            new Triangle(1,2, 10, 15, 5, 5, Double.POSITIVE_INFINITY, 5);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
        try {
            new Triangle(1,2, 10, 15, 5, 5, 15, Double.POSITIVE_INFINITY);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
        
        try {
            new Triangle(1,2, Double.NEGATIVE_INFINITY, 15, 5, 5, 15, 5);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
        try {
            new Triangle(1,2, 10, Double.NEGATIVE_INFINITY, 5, 5, 15, 5);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
        try {
            new Triangle(1,2, 10, 15, Double.NEGATIVE_INFINITY, 5, 15, 5);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
        try {
            new Triangle(1,2, 10, 15, 5, Double.NEGATIVE_INFINITY, 15, 5);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
        try {
            new Triangle(1,2, 10, 15, 5, 5, Double.NEGATIVE_INFINITY, 5);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
        try {
            new Triangle(1,2, 10, 15, 5, 5, 15, Double.NEGATIVE_INFINITY);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
        try {
            new Triangle(1,2, Double.NaN, 15, 5, 5, 15, 5);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
        try {
            new Triangle(1,2, 10, Double.NaN, 5, 5, 15, 5);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
        try {
            new Triangle(1,2, 10, 15, Double.NaN, 5, 15, 5);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
        try {
            new Triangle(1,2, 10, 15, 5, Double.NaN, 15, 5);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
        try {
            new Triangle(1,2, 10, 15, 5, 5, Double.NaN, 5);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
        try {
            new Triangle(1,2, 10, 15, 5, 5, 15, Double.NaN);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
        
        //there are an insane amount of cases to test here
        
        
    }
    	
    
        @Test
        public void testMove() throws ShapeException {
        	Triangle myTriangle = new Triangle(1, 2, 10, 15, 5, 5, 15, 5);
            assertEquals(1, myTriangle.getX(), 0);
            assertEquals(2, myTriangle.getY(), 0);
            assertEquals(10, myTriangle.computeBaseLength(), 0);
            assertEquals(10, myTriangle.computeHeight(), 0);

            myTriangle.move(3,  4);
            assertEquals(4, myTriangle.getX(), 0);
            assertEquals(6, myTriangle.getY(), 0);
            assertEquals(10, myTriangle.computeBaseLength(), 0);
            assertEquals(10, myTriangle.computeHeight(), 0);

            myTriangle.move(0.123,  0.456);
            assertEquals(4.123, myTriangle.getX(), 0);
            assertEquals(6.456, myTriangle.getY(), 0);
            assertEquals(10, myTriangle.computeBaseLength(), 0);
            assertEquals(10, myTriangle.computeHeight(), 0);

            myTriangle.move(-0.123,  -0.456);
            assertEquals(4, myTriangle.getX(), 0);
            assertEquals(6, myTriangle.getY(), 0);
            assertEquals(10, myTriangle.computeBaseLength(), 0);
            assertEquals(10, myTriangle.computeHeight(), 0);
            
            myTriangle.move(-12,  -26);
            assertEquals(-8, myTriangle.getX(), 0);
            assertEquals(-20, myTriangle.getY(), 0);
            assertEquals(10, myTriangle.computeBaseLength(), 0);
            assertEquals(10, myTriangle.computeHeight(), 0);

            
            try {
            	myTriangle.move(Double.POSITIVE_INFINITY, 1);
                fail("Expected exception not thrown");
            } catch (Exception e) {
                // ignore
            }

            try {
            	myTriangle.move(Double.NEGATIVE_INFINITY, 1);
                fail("Expected exception not thrown");
            } catch (Exception e) {
                // ignore
            }

            try {
            	myTriangle.move(Double.NaN, 1);
                fail("Expected exception not thrown");
            } catch (Exception e) {
                // ignore
            }

            try {
            	myTriangle.move(1, Double.POSITIVE_INFINITY);
                fail("Expected exception not thrown");
            } catch (Exception e) {
                // ignore
            }

            try {
            	myTriangle.move(1, Double.NEGATIVE_INFINITY);
                fail("Expected exception not thrown");
            } catch (Exception e) {
                // ignore
            }

            try {
            	myTriangle.move(1, Double.NaN);
                fail("Expected exception not thrown");
            } catch (Exception e) {
                // ignore
            }

        }
    	
        @Test
        public void testScale() throws ShapeException {
            Triangle myTriangle = new Triangle(1, 2, 10, 15, 5, 5, 15, 5);
            assertEquals(1, myTriangle.getX(), 0);
            assertEquals(2, myTriangle.getY(), 0);
            assertEquals(10, myTriangle.computeBaseLength(), 0);

            myTriangle.scale(3);
            assertEquals(1, myTriangle.getX(), 0);
            assertEquals(225, myTriangle.getY(), 0);
            assertEquals(30, myTriangle.computeBaseLength(), 0);
            

            
            myTriangle.scale(0.2);
            assertEquals(1, myTriangle.getX(), 0);
            assertEquals(2, myTriangle.getY(), 0);
            assertEquals(2, myTriangle.computeBaseLength(), 0);
            
            
            try {
            	myTriangle.scale(Double.POSITIVE_INFINITY);
                fail("Expected exception not thrown");
            } catch (Exception e) {
                // ignore
            }

            try {
            	myTriangle.scale(Double.NEGATIVE_INFINITY);
                fail("Expected exception not thrown");
            } catch (Exception e) {
                // ignore
            }

            try {
            	myTriangle.scale(Double.NaN);
                fail("Expected exception not thrown");
            } catch (Exception e) {
                // ignore
            }
        }
    
        @Test
        public void testComputeArea() throws ShapeException {
            Triangle myTriangle = new Triangle(1, 2, 10, 15, 5, 5, 15, 5);
            assertEquals(50, myTriangle.computeArea(), 0.001);

            Triangle myTriangle1 = new Triangle(1, 2, 8.615, 13.121, 2.101, 4.131, 11.231, 3.152);
            assertEquals(5.224, myTriangle1.computeArea(), 0.001);

            Triangle myTriangle2 = new Triangle(1, 2, 0, 0, 0, 0, 0, 0);
            assertEquals(0, myTriangle2.computeArea(), 0);

        }

    


}

