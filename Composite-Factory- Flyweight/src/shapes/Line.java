package examples.shapes;

import java.util.ArrayList;

import examples.Composite.ShapeComponent;

/**
 *
 *  Line
 *
 *  This class represents line objects that can be moved.  Users of a line can also get its length and slope.
 *
 */
@SuppressWarnings("WeakerAccess")
public class Line extends ShapeComponent {

   
    
    private double x1,x2, y1,y2;

    /**
     * Constructor based on x-y Locations
     * @param x1                The x-location of first point -- must be a valid double.
     * @param y1                The y-location of first point -- must be a valid double.
     * @param x2                The x-location of second point -- must be a valid double.
     * @param y2                The y-location of second point -- must be a valid double.
     * @throws ShapeException   Exception throw if any parameter is invalid
     */
    public Line(double x1, double y1, double x2, double y2) throws ShapeException {
    	setShapeType("Line");
    	this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;

//        if (computeLength() < 0.00000001)
//            throw new ShapeException("A line must have a length > 0");
    }

   
    
    /**
     * @return  The x-location of the point
     */
    public double getX1() { return x1; }

    public void setX1(double x1) { this.x1 = x1;}
    
    /**
     * @return  The y-location of the point
     */
    public double getY1() { return y1; }
    
    public void setY1(double y1) { this.y1 = y1;}
    
    /**
     * @return  The x-location of the point
     */
    public double getX2() { return x2; }

    public void setX(double x2) { this.x2 = x2;}
    
    /**
     * @return  The y-location of the point
     */
    public double getY2() { return y2; }
    
    public void setY(double y2) { this.y2 = y2;}
    
    
    /**
     * Move a line
     *
     * @param deltaX            The delta x-location by which the line should be moved -- must be a valid double
     * @param deltaY            The delta y-location by which the line should be moved -- must be a valid double
     * @throws ShapeException   Exception throw if any parameter is invalid
     */
    public void move(double deltaX, double deltaY) throws ShapeException {
        x1 = x1 + deltaX;
        x2 = x2 + deltaX;
        y1 = y1 + deltaY;
        y2 = y2 + deltaY;
    }

    /**
     * @return  The length of the line
     */
    public double computeLength() {
        return Math.sqrt(Math.pow(y1 - x1, 2) +
                         Math.pow(y2 - x2, 2));
    }

    /**
     * @return  The slope of the line
     */
    public double computeSlope() {
        return (y1 - x1/y2 - x2);
    }

	@Override
	public double computeArea() {
		return 0;
	}

	@Override
	public void scale(double scaleFactor) throws ShapeException {		
	}
	
	@Override
	public String getParametersInString() {
		
		return 
		getShapeType() + " " 
		+ Double.toString(x1) + " " 
		+ Double.toString(x2) + " "
		+ Double.toString(y1) + " "
		+ Double.toString(y2) + " "
		+ "\n";
	}

	@Override
	public ArrayList<Double> getAllparameters() {
		
		ArrayList<Double> parameters = new ArrayList();
		
		parameters.add(x1);
		parameters.add(x2);
		parameters.add(y1);
		parameters.add(y2);
		
		return parameters;
	}
}
