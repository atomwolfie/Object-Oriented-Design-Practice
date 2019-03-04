package examples.shapes;

import java.util.ArrayList;

import examples.Composite.ShapeComponent;
import examples.Internal.AreaCalculator;

/**
 * Square
 *
 * This class represents square objects that can be moved and scales.  Users of a square can also get its area.
 *
 */
@SuppressWarnings("WeakerAccess")
public class Square extends ShapeComponent {
    private double x, y, sideLength;
    

    /**
     * Constructor with x-y Location for center
     *
     * @param x                 The x-location of the center of the square -- must be a valid double
     * @param y                 The y-location of the center of the square
     
     * @throws ShapeException   The exception thrown if the x, y, or z are not valid
     */
    public Square(double x, double y,  double sideLength) throws ShapeException {
    	setShapeType("Square");
    	Validator.validatePositiveDouble(sideLength, "Invalid side length");
        this.x = x;
        this.y = y;
        this.sideLength = sideLength;
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
     * @return  The side length of the square
     */
    public double getSideLength() { return sideLength; }
  
   
    
    @Override
    public void move(double deltaX, double deltaY) throws ShapeException {
    	this.x = deltaX;
    	this.y = deltaY;
    }

    @Override
    public void scale(double scaleFactor) throws ShapeException {
        Validator.validatePositiveDouble(scaleFactor, "Invalid scale factor");
        sideLength *= scaleFactor;       
    }

	@Override
	public double computeArea() {
	//  Area of a square = sideLength^2  			
		AreaCalculator areaHelper = new AreaCalculator();		
		return areaHelper.computeArea(sideLength);	    	  	
	}

	@Override
	public String getParametersInString() {
							
		return 
		getShapeType() + " " 
		+ Double.toString(x) + " " 
		+ Double.toString(y) + " "  
		+ Double.toString(sideLength)
		+ "\n";
	}

	@Override
	public ArrayList<Double> getAllparameters() {
		// TODO Auto-generated method stub
		ArrayList<Double> parameters = new ArrayList();
		
		parameters.add(x);
		parameters.add(y);
		parameters.add(sideLength);
		parameters.add(sideLength);
		
		return parameters;
	}
	
}