package examples.Factory;

import java.util.ArrayList;

import examples.Composite.ShapeComponent;
import examples.Composite.ShapeGroup;
import examples.Flyweight.EmbeddedFactory;
import examples.shapes.Circle;
import examples.shapes.Ellipse;
import examples.shapes.Rectangle;
import examples.shapes.ShapeException;
import examples.shapes.Square;
import examples.shapes.Triangle;

public class ShapeFactory {

	
	public ShapeComponent makeShape(String shapeType, ArrayList<Double> shapeInputs) throws ShapeException{
				
		if(shapeType.equals("Circle")){
			return new Circle(shapeInputs.get(0),shapeInputs.get(1),shapeInputs.get(2)); 
		}
				
		if(shapeType.equals("Ellipse")){
			return new Ellipse(shapeInputs.get(0),shapeInputs.get(1),shapeInputs.get(2), shapeInputs.get(3)); 
		}
		
		if(shapeType.equals("Square")){
			return new Square(shapeInputs.get(0),shapeInputs.get(1),shapeInputs.get(2)); 
		}
		if(shapeType.equals("Rectangele")){
			return new Rectangle(shapeInputs.get(0),shapeInputs.get(1),shapeInputs.get(2), shapeInputs.get(3)); 
		}
		if(shapeType.equals("Triangle")){	
			return new Triangle(shapeInputs.get(0),shapeInputs.get(1),shapeInputs.get(2), shapeInputs.get(3), 
					shapeInputs.get(4), shapeInputs.get(5), shapeInputs.get(6), shapeInputs.get(7)); 
		}
		if(shapeType.equals("EmbeddedImage")){	
			EmbeddedFactory embedFactory = new EmbeddedFactory();
			return embedFactory.getImage(shapeInputs.get(2), shapeInputs.get(3), Double.toString(shapeInputs.get(4)));
		}	
		return null;
			
	}
	
	
	
}
