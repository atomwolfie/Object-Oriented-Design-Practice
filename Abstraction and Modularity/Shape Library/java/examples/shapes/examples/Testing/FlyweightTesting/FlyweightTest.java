package examples.Testing.FlyweightTesting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import examples.Flyweight.EmbeddedFactory;
import examples.shapes.EmbeddedImage;
import examples.shapes.ShapeException;

public class FlyweightTest {

	

	@Test
	public void test() throws ShapeException {
		
		
		EmbeddedFactory embedFactory = new EmbeddedFactory();
		String fileName = "bitmap-image-icon.bmp";
		
		 EmbeddedImage image = embedFactory.getImage(0, 0, fileName);
		 EmbeddedImage image1 = embedFactory.getImage(0, 0, fileName);
		 
		 assertSame(image, image1);
	}

}
