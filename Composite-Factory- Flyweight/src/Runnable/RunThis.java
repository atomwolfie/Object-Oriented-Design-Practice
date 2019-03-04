package examples.Runnable;

import examples.shapes.Circle;
import examples.shapes.Point;
import examples.shapes.ShapeException;

public class RunThis {

	public static void main(String[] args) throws ShapeException {
		
		Circle circle = new Circle(0,0,5);
		
		double radius = circle.getRadius();
		
		String radiusString = Double.toString(radius);
		
		System.out.println("radius: " + radiusString);

		Point point = new Point(0,0);
		double x = point.getX();
		String xString = Double.toString(x);
		System.out.println("x: " + xString);
	}

}
