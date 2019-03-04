package examples.Composite;

import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;

public class ShapeGenerator {

	//FOR TESTING not important
	//examples of how to implement the composite pattern
	
	ShapeComponent roundShapes = new ShapeGroup("Round", "Shapes that have a spherical nature");
	
	ShapeComponent fourSidedShapes = new ShapeGroup("4 sides", "Shapes that have for sides");
	
	ShapeComponent threeSidedShapes = new ShapeGroup("3 sides", "Shapes that have 3 sides");
	
	ShapeComponent abstractShapes = new ShapeGroup("Non-symmetrical", "Shapes that are not symmetrical");
	
	ShapeComponent nonShapes = new ShapeGroup("Non Shapes", "thangs that are not shapes (i.e. lines, points, etc.");
	
	
	//this holds everything
	ShapeGroup everyShape = new ShapeGroup("Shape List", "Every Shape available");
	
	// Composite that holds individual groups of shapes
	// This holds Shapes plus a ShapeGroup with Shapes
	
	
	
	
}
