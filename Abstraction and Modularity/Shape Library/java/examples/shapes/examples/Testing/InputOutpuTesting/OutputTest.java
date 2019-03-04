package examples.Testing.InputOutpuTesting;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.junit.Before;
import org.junit.Test;

import examples.Composite.ShapeGroup;
import examples.InputOutput.Output;
import examples.shapes.Ellipse;
import examples.shapes.EmbeddedImage;
import examples.shapes.Line;
import examples.shapes.Point;
import examples.shapes.ShapeException;
import examples.shapes.Square;

public class OutputTest {

	 @Test
     public void testWrite() throws IOException, ShapeException  {
         
		   ShapeGroup shapeGroup = new ShapeGroup("Test group", "group for testing");
		
		   Point point = new Point(0,0);
		   Line line = new Line(0,0,10,10);
		   Square square = new Square(0,0,10);
		   Ellipse ellipse = new Ellipse(0,0,10,10);
		   EmbeddedImage image = new EmbeddedImage(0,0,700,700, "bitmap-image-icon.bmp");
		   
		   shapeGroup.add(point);
		   shapeGroup.add(line);
		   shapeGroup.add(line);
		   shapeGroup.add(square);
		   shapeGroup.add(ellipse);
		   shapeGroup.add(image);
		   
		   Output outputGuy = new Output();
		   
		   outputGuy.writeFile(shapeGroup, "output.txt");	   
     }


}
