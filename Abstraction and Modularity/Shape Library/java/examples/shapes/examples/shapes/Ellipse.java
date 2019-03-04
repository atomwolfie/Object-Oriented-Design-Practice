package examples.shapes;

import java.util.ArrayList;

import examples.Composite.ShapeComponent;
import examples.Internal.AreaCalculator;

/**
 * Ellipse
 *
 * This class represents ellipse objects that can be moved and scales.  Users of a ellipse can also get its area.
 *
 */
@SuppressWarnings("WeakerAccess")
public class Ellipse extends ShapeComponent {
    private double x, y, width, height;
    

    /**
     * Constructor with x-y Location for center
     *
     * @param x                 The x-location of the center of the ellipse -- must be a valid double
     * @param y                 The y-location of the center of the ellipse
     * @param width            The width of the ellipse -- must be greater or equal to zero.
     * @param height            The height of the ellipse -- must be greater or equal to zero.
     * @throws ShapeException   The exception thrown if the x, y, or z are not valid
     */
    public Ellipse(double x, double y,  double width, double height) throws ShapeException {
    	setShapeType("Ellipse");
    	Validator.validatePositiveDouble(width, "Invalid width");
        Validator.validatePositiveDouble(height, "Invalid height");
       
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
  
    /**
     * @return  The x-location of the point
     */
    public double getX() { return x; }

    public void setX(double x) { this.x = x;}
    
    /**
     * @return  The y-location of the point
     */
    public double getY() { return y; }
  
    /**
     * @return  The width of the ellipse
     */
    public double getWidth() { return width; }

    
    /**
     * @return  The height of the ellipse
     */
    public double getHeight() { return height; }

      
    
    
    

    @Override
    public void move(double deltaX, double deltaY) throws ShapeException {
    	this.x = deltaX;
        this.y = deltaY;
    }
    
    @Override
    public void scale(double scaleFactor) throws ShapeException {
        Validator.validatePositiveDouble(scaleFactor, "Invalid scale factor");
        width *= scaleFactor;
        height *= scaleFactor;
    }

    /**
     * @return  The area of the ellipse.
     */
    @Override
    public double computeArea() {  		
    	//  Area of an ellipse = pi * (width/2) * (height/2)   	  	
    	AreaCalculator areaHelper = new AreaCalculator();
    	return areaHelper.computeEllipseArea(width, height);
    }
    
    @Override
	public String getParametersInString() {
						
		return 
		getShapeType() + " " 
		+ Double.toString(x) + " " 
		+ Double.toString(y) + " " 
		+ Double.toString(width) + " "
		+ Double.toString(height)
		+ "\n";
	}
    
    @Override
	public ArrayList<Double> getAllparameters() {
		
		ArrayList<Double> parameters = new ArrayList();
		
		parameters.add(x);
		parameters.add(y);
		parameters.add(width);
		parameters.add(height);
		
		return parameters;
	}

}