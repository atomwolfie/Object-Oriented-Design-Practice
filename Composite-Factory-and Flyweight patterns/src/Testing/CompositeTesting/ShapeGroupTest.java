package examples.Testing.CompositeTesting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import examples.Composite.ShapeComponent;
import examples.Composite.ShapeGroup;
import examples.shapes.Circle;

public class ShapeGroupTest {

	

	@Test
	public void testConstructor() {
		ShapeGroup everyShape = new ShapeGroup("Shape List", "Every Shape available");
		assertSame("Shape List",everyShape.getGroupName());
		assertSame("Every Shape available",everyShape.getGroupDescription());
	}

	
	@Test
	public void testGetName() {
		ShapeGroup everyShape = new ShapeGroup("Shape List", "Every Shape available");
		assertSame("Shape List",everyShape.getGroupName());
		assertSame("Every Shape available",everyShape.getGroupDescription());
	}
	
	@Test
    public void testAdd() throws Exception {
		
		ShapeGroup roundShapes = new ShapeGroup("Round", "Shapes that have a spherical nature");
			
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
		
		ShapeGroup roundShapes = new ShapeGroup("Round", "Shapes that have a spherical nature");
		
		ShapeComponent circle = new Circle(0,0,5);
		
		roundShapes.add(circle);
		roundShapes.remove(circle);		
	}
	
	
	@Test
    public void testRemoveAll() throws Exception {
		
		ShapeGroup roundShapes = new ShapeGroup("Round", "Shapes that have a spherical nature");
		ShapeGroup roundShapes1 = new ShapeGroup("Round", "Shapes that have a spherical nature");
		
		ShapeComponent circle = new Circle(0,0,5);
		ShapeComponent circle1 = new Circle(0,0,5);
		ShapeComponent circle2 = new Circle(0,0,5);
		
		roundShapes.add(circle);
		roundShapes.add(circle1);
		roundShapes.add(circle2);
		
		roundShapes.removeAll();		
		
		assertSame(roundShapes,roundShapes1);
	}
	
	
	@Test
    public void testGetComponent() throws Exception {
		
		ShapeGroup roundShapes = new ShapeGroup("Round", "Shapes that have a spherical nature");
		
		ShapeComponent circle = new Circle(0,0,5);
		ShapeComponent circle1 = new Circle(0,0,5);
		ShapeComponent circle2 = new Circle(0,0,5);
		
		roundShapes.add(circle);
		roundShapes.add(circle1);
		roundShapes.add(circle2);
		
		roundShapes.getComponent(2);
		
		assertSame(circle2,roundShapes.getComponent(2));
		
	}
	
	@Test
    public void testDisplay() throws Exception {
		
		ShapeGroup roundShapes = new ShapeGroup("Round", "Shapes that have a spherical nature");
		
		ShapeComponent circle = new Circle(0,0,5);
		ShapeComponent circle1 = new Circle(0,0,5);
		ShapeComponent circle2 = new Circle(0,0,5);
		
		roundShapes.add(circle);
		roundShapes.add(circle1);
		roundShapes.add(circle2);
		
		roundShapes.displayShapeInfo();
		
	}
	
}
