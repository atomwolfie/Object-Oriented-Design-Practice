package examples.Testing;

import static org.junit.Assert.*;

import examples.shapes.Point;
import examples.shapes.ShapeException;
import examples.shapes.Square;

import org.junit.Test;

public class SquareTest {

	

    @Test
    public void testValidConstruction() throws Exception {
          
    	Square mySquare = new Square(1.3, 2.6, 2.5);
        assertEquals(1.3, mySquare.getX(), 0);
        assertEquals(2.6, mySquare.getY(), 0);
        assertEquals(2.5, mySquare.getSideLength(), 0);
        assertEquals(6.25, mySquare.computeArea(),0);
    }
	
    
    
    @Test
    public void testInvalidConstruction() {
    
        try {
            new Square(Double.POSITIVE_INFINITY, 2, 3);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }

        try {
            new Square(Double.NEGATIVE_INFINITY, 2, 3);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }

        try {
            new Square(Double.NaN, 2, 3);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }

        try {
            new Square(1, Double.POSITIVE_INFINITY, 3);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }

        try {
            new Square(1, Double.NEGATIVE_INFINITY, 3);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }

        try {
            new Square(1, Double.NaN, 3);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }


        try {
            new Square(1, 2, Double.POSITIVE_INFINITY);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }

        try {
            new Square(1, 2, Double.NEGATIVE_INFINITY);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }

        try {
            new Square(1, 2, Double.NaN);
            fail("Expected exception not thrown");
        } catch (Exception e) {
            // ignore
        }
    	
    }
    	
        @Test
        public void testMove() throws ShapeException {
            Square mySquare = new Square(1, 2, 5);
            assertEquals(1, mySquare.getX(), 0);
            assertEquals(2, mySquare.getY(), 0);
            assertEquals(5, mySquare.getSideLength(), 0);
            assertEquals(25, mySquare.computeArea(), 0);

            mySquare.move(3,  4);
            assertEquals(4, mySquare.getX(), 0);
            assertEquals(6, mySquare.getY(), 0);
            assertEquals(5, mySquare.getSideLength(), 0);
            assertEquals(25, mySquare.computeArea(), 0);

            mySquare.move(0.123,  0.456);
            assertEquals(4.123, mySquare.getX(), 0);
            assertEquals(6.456, mySquare.getY(), 0);
            assertEquals(5, mySquare.getSideLength(), 0);
            assertEquals(25, mySquare.computeArea(), 0);

            mySquare.move(-0.123,  -0.456);
            assertEquals(4, mySquare.getX(), 0);
            assertEquals(6, mySquare.getY(), 0);
            assertEquals(5, mySquare.getSideLength(), 0);
            assertEquals(25, mySquare.computeArea(), 0);

            mySquare.move(-12,  -26);
            assertEquals(-8, mySquare.getX(), 0);
            assertEquals(-20, mySquare.getY(), 0);
            assertEquals(5, mySquare.getSideLength(), 0);
            assertEquals(25, mySquare.computeArea(), 0);

            try {
            	mySquare.move(Double.POSITIVE_INFINITY, 1);
                fail("Expected exception not thrown");
            } catch (Exception e) {
                // ignore
            }

            try {
            	mySquare.move(Double.NEGATIVE_INFINITY, 1);
                fail("Expected exception not thrown");
            } catch (Exception e) {
                // ignore
            }

            try {
            	mySquare.move(Double.NaN, 1);
                fail("Expected exception not thrown");
            } catch (Exception e) {
                // ignore
            }

            try {
            	mySquare.move(1, Double.POSITIVE_INFINITY);
                fail("Expected exception not thrown");
            } catch (Exception e) {
                // ignore
            }

            try {
            	mySquare.move(1, Double.NEGATIVE_INFINITY);
                fail("Expected exception not thrown");
            } catch (Exception e) {
                // ignore
            }

            try {
            	mySquare.move(1, Double.NaN);
                fail("Expected exception not thrown");
            } catch (Exception e) {
                // ignore
            }

        }
    	
        @Test
        public void testScale() throws ShapeException {
            Square mySquare = new Square(1, 2, 5);
            assertEquals(1, mySquare.getX(), 0);
            assertEquals(2, mySquare.getY(), 0);
            assertEquals(25, mySquare.computeArea(), 0);

            mySquare.scale(3);
            assertEquals(1, mySquare.getX(), 0);
            assertEquals(225, mySquare.getY(), 0);

            mySquare.scale(0.2);
            assertEquals(1, mySquare.getX(), 0);
            assertEquals(2, mySquare.getY(), 0);
            assertEquals(1, mySquare.computeArea(), 0);

            try {
            	mySquare.scale(Double.POSITIVE_INFINITY);
                fail("Expected exception not thrown");
            } catch (Exception e) {
                // ignore
            }

            try {
            	mySquare.scale(Double.NEGATIVE_INFINITY);
                fail("Expected exception not thrown");
            } catch (Exception e) {
                // ignore
            }

            try {
            	mySquare.scale(Double.NaN);
                fail("Expected exception not thrown");
            } catch (Exception e) {
                // ignore
            }
        }
    
        @Test
        public void testComputeArea() throws ShapeException {
            Square mySquare = new Square(1, 2, 5);
            assertEquals(25, mySquare.computeArea(), 0);

            mySquare = new Square(1, 2, 4.234);
            assertEquals(17.93, mySquare.computeArea(), 0);

            mySquare = new Square(1, 2, 0);
            assertEquals(0, mySquare.computeArea(), 0);

        }

    


}
