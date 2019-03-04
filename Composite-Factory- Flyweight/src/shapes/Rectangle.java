package examples.shapes;

import java.util.ArrayList;

import examples.Composite.ShapeComponent;
import examples.Internal.AreaCalculator;

/**
 * Rectangle
 *
 * This class represents rectangle objects that can be moved and scales.  Users of a rectangle can also get its area.
 *
 */
@SuppressWarnings("WeakerAccess")
public class Rectangle extends ShapeComponent {
    private double x,y,width, height;
    

    /**
     * Constructor with x-y Location for center
     *
     * @param x                 The x-location of the center of the Rectangle -- must be a valid double
     * @param y                 The y-location of the center of the Rectangle
     * @param width            The width of the Rectangle -- must be greater or equal to zero.
     * @param height            The height of the Rectangle -- must be greater or equal to zero.
     * @throws ShapeException   The exception thrown if the x, y, or z are not valid
     */
    public Rectangle(double x, double y,  double width, double height) throws ShapeException {
    	setShapeType("Rectangle");
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
    
    public void setY(double y) { this.y = y;}



    /**
     * @return  The width of the Rectangle
     */
    public double getWidth() { return width; }

    
    /**
     * @return  The height of the Rectangle
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

	@Override
	public double computeArea() {
	//  Area of a rectangle = length * width   	
		AreaCalculator areaHelper = new AreaCalculator();		
		return areaHelper.computeArea(width, height);		
	}

	@Override
	public String getParametersInString() {
							
		return 
		getShapeType() + "" 
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