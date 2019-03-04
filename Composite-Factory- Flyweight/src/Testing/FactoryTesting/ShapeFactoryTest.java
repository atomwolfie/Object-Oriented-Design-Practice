package examples.Testing.FactoryTesting;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import examples.Composite.ShapeComponent;
import examples.Factory.ShapeFactory;
import examples.shapes.Circle;
import examples.shapes.Ellipse;
import examples.shapes.Rectangle;
import examples.shapes.ShapeException;
import examples.shapes.Square;
import examples.shapes.Triangle;

public class ShapeFactoryTest {

	@SuppressWarnings("null")
	@Test
    public void testCreateCircle() throws ShapeException   {
        
		Circle circle = new Circle(0.0,0.0,5.0);
		 
		String input = "Circle";
		ArrayList<Double> circleArray = new ArrayList();
		circleArray.add(0.0);
		circleArray.add(0.0);
		circleArray.add(5.0);
		
		ShapeFactory factory = new ShapeFactory();	
		
		ShapeComponent newCircle = factory.makeShape(input, circleArray);
		
		ArrayList<Double> parameters = newCircle.getAllparameters();
		
		
		assertEquals(circleArray.get(0),parameters.get(0));
		assertEquals(circleArray.get(1),parameters.get(1));
		assertEquals(circleArray.get(2),parameters.get(2));
    }

	
	
	
	@SuppressWarnings("null")
	@Test
    public void testCreateEllipse() throws ShapeException   {
        
		Ellipse ellipse = new Ellipse(0,0,5, 10);
		 
		String input = "Ellipse";
		
		ArrayList<Double> ellipseArray = new ArrayList();
		ellipseArray.add(0.0);
		ellipseArray.add(0.0);
		ellipseArray.add(5.0);
		ellipseArray.add(10.0);
		
		ShapeFactory factory = new ShapeFactory();	
		
		ShapeComponent newEllipse = factory.makeShape(input, ellipseArray);
		
		ArrayList<Double> parameters = newEllipse.getAllparameters();
		
		
		assertEquals(ellipseArray.get(0),parameters.get(0));
		assertEquals(ellipseArray.get(1),parameters.get(1));
		assertEquals(ellipseArray.get(2),parameters.get(2));
		assertEquals(ellipseArray.get(3),parameters.get(3));
    }
	
	
	@SuppressWarnings("null")
	@Test
    public void testCreateSquare() throws ShapeException   {
        
		Square square = new Square(0,0,5);
		 
		String input = "Square";
		
		ArrayList<Double> squareArray = new ArrayList();
		squareArray.add(0.0);
		squareArray.add(0.0);
		squareArray.add(5.0);
		squareArray.add(10.0);
		
		ShapeFactory factory = new ShapeFactory();	
		
		ShapeComponent newSquare = factory.makeShape(input, squareArray);
		
		ArrayList<Double> parameters = newSquare.getAllparameters();
		
		
		assertEquals(squareArray.get(0),parameters.get(0));
		assertEquals(squareArray.get(1),parameters.get(1));
		assertEquals(squareArray.get(2),parameters.get(2));
		assertEquals(squareArray.get(3),parameters.get(3));
		
    }
	
	
	@SuppressWarnings("null")
	@Test
    public void testCreateRectangle() throws ShapeException   {
        
		Rectangle rectangle = new Rectangle(0,0,5, 10);
		 
		String input = "Rectangle";
		
		ArrayList<Double> recArray = new ArrayList();
		recArray.add(0.0);
		recArray.add(0.0);
		recArray.add(5.0);
		recArray.add(10.0);
		
		ShapeFactory factory = new ShapeFactory();	
		
		ShapeComponent newRec = factory.makeShape(input, recArray);
		
		ArrayList<Double> parameters = newRec.getAllparameters();
		
		
		assertEquals(recArray.get(0),parameters.get(0));
		assertEquals(recArray.get(1),parameters.get(1));
		assertEquals(recArray.get(2),parameters.get(2));
		assertEquals(recArray.get(3),parameters.get(3));	
    }
	
	@SuppressWarnings("null")
	@Test
    public void testCreateTriangle() throws ShapeException   {
        
		Triangle triangle = new Triangle(0,0,10,10,5,5,10,5);
		 
		String input = "Triangle";
		ArrayList<Double> triArray = new ArrayList();
		triArray.add(1.3);
		triArray.add(2.6);
		triArray.add(10.0);
		triArray.add(15.0);
		triArray.add(5.0);
		triArray.add(5.0);
		triArray.add(15.0);
		triArray.add(5.0);
		
		//1.3, 2.6, 10, 15, 5, 5, 15, 5
		
		ShapeFactory factory = new ShapeFactory();	
		
		ShapeComponent newRec = factory.makeShape(input, triArray);
		
		ArrayList<Double> parameters = newRec.getAllparameters();
		
		
		assertEquals(triArray.get(0),parameters.get(0));
		assertEquals(triArray.get(1),parameters.get(1));
		assertEquals(triArray.get(2),parameters.get(2));
		assertEquals(triArray.get(3),parameters.get(3));
		assertEquals(triArray.get(4),parameters.get(4));
		assertEquals(triArray.get(5),parameters.get(5));
		assertEquals(triArray.get(6),parameters.get(6));
		assertEquals(triArray.get(7),parameters.get(7));
    }
	
	
	
	
}
