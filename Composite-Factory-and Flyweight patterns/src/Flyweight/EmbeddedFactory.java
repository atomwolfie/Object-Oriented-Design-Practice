package examples.Flyweight;

import java.util.HashMap;

import examples.shapes.EmbeddedImage;
import examples.shapes.ShapeException;

public class EmbeddedFactory {
	
	private static final HashMap< Double, EmbeddedImage> imageByLocation
	= new HashMap<Double, EmbeddedImage>();
	
	public static EmbeddedImage getImage(double x, double y, String newFile) throws ShapeException{
		//looks to see if there is an image of the same dimension, if so returns the existing image, else it will create new one
		double searchKey = x + y;
		
		EmbeddedImage image = (EmbeddedImage)imageByLocation.get(searchKey);
		
		if(image == null){
			image = new EmbeddedImage(x,y, newFile);
			imageByLocation.put(searchKey, image);
		}
		
		return image;
	}
	
	
}
