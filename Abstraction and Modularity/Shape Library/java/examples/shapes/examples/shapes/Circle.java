package examples.shapes;

import java.util.ArrayList;

import examples.Composite.ShapeComponent;
import examples.Internal.AreaCalculator;

/**
 * Circle
 *
 * This class represents circle objects that can be moved and scales.  Users of a circle can also get its area.
 *
 */
public class Circle extends ShapeComponent{
    
	
    private double x, y, radius;

    /**
     * Constructor with x-y Location for center
     *
     * @param x                 The x-location of the center of the circle -- must be a valid double
     * @param y                 The y-location of the center of the circle
     * @param radius            The radius of the circle -- must be greater or equal to zero.
     * @throws ShapeException   The exception thrown if the x, y, or z are not valid
     */
    public Circle(double x, double y, double newRadius) throws ShapeException {
    	setShapeType("Circle");
    	Validator.validatePositiveDouble(radius, "Invalid radius");
    	Validator.validateDouble(x, "Invalid x-location");
        Validator.validateDouble(y, "Invalid y-location");
        this.x = x;
        this.y = y;      
        this.radius = newRadius;        
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
     * @return  The radius of the circle
     */
    public double getRadius() { return radius; }

  
     
    @Override
    public void move(double deltaX, double deltaY) throws ShapeException {
        this.x = deltaX;
        this.y = deltaY;
    }



	@Override
	public double computeArea() {		
		AreaCalculator areaHelper = new AreaCalculator();	
		 return areaHelper.computeCircleArea(radius);
	}

	@Override
	public void scale(double scaleFactor) throws ShapeException{
		Validator.validatePositiveDouble(scaleFactor, "Invalid scale factor");
        radius *= scaleFactor;
	}

	@Override
	public String getParametersInString() {
						
		return 
		getShapeType() + "" 
		+ Double.toString(x) + " " 
		+ Double.toString(y) + " " 
		+ Double.toString(radius)
		+ "\n";
	}
	
	@Override
	public ArrayList<Double> getAllparameters() {
		
		ArrayList<Double> parameters = new ArrayList();
				
		parameters.add(x);
		parameters.add(y);
		parameters.add(radius * 2);
		parameters.add(radius * 2);
		
		return parameters;
	}


	

}