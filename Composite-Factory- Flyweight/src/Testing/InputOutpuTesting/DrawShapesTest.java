package examples.Testing.InputOutpuTesting;

import static org.junit.Assert.*;

import java.awt.Graphics;

import org.junit.Before;
import org.junit.Test;

import examples.Composite.ShapeGroup;
import examples.InputOutput.DrawShapes;
import examples.shapes.Line;
import examples.shapes.Point;
import examples.shapes.ShapeException;

public class DrawShapesTest {


	@Test
	public void testDraw() {
	
		ShapeGroup shapeGroup = new ShapeGroup("test", "for testing purposes");
		try {
			shapeGroup.add(new Point(0,0));
		} catch (ShapeException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			shapeGroup.add(new Line(0,0,10,10));
		} catch (ShapeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DrawShapes drawer = new DrawShapes(shapeGroup);
		
	}

}
