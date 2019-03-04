package examples.shapes;

import java.awt.Graphics;
import java.util.ArrayList;

import com.sun.prism.paint.Color;

import examples.Composite.ShapeComponent;
import examples.InputOutput.DrawShapes;

/**
 * Point
 *
 * This class represents point objects that can be moved and copied
 */
@SuppressWarnings("WeakerAccess")
public class Point extends ShapeComponent{
    private double x;
    private double y;

    /**
     * Constructor
     *
     * @param x                 The x-location of the point -- must be a valid double
     * @param y                 The y-location of the point -- must be a valid double
     * @throws ShapeException   Exception throw if any parameter is invalid
     */
    public Point(double x, double y) throws ShapeException {
    	setShapeType("Point");
    	Validator.validateDouble(x, "Invalid x-location");
        Validator.validateDouble(y, "Invalid y-location");
        this.x = x;
        this.y = y;
       
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
     * Move the point in the x direction
     *
     * @param deltaX            The delta amount to move the point -- must be a valid double
     * @throws ShapeException   Exception thrown if the parameter is invalid
     */
    public void moveX(double deltaX) throws ShapeException {
        Validator.validateDouble(deltaX, "Invalid delta-x value");
        x += deltaX;
    }

    /**
     * Move the point in the y direction
     *
     * @param deltaY            The delta amount to move the point -- must be a valid double
     * @throws ShapeException   Exception thrown if the parameter is invalid
     */
    public void moveY(double deltaY) throws ShapeException {
        Validator.validateDouble(deltaY, "Invalid delta-y value");
        y += deltaY;
    }

    /**
     * Move the point
     *
     * @param deltaX            The delta amount to move the point in the x direction -- must be a valid double
     * @param deltaY            The delta amount to move the point in the y direction -- must be a valid double
     * @throws ShapeException   Exception throw if any parameter is invalid
     */
    public void move(double deltaX, double deltaY) throws ShapeException {
        this.x = deltaX;
        this.y = deltaY;
    }

    /**
     * Copy the point
     * @return                  A new point with same x and y locations
     * @throws ShapeException   Should never thrown because the current x and y are valid
     */
    public Point copy() throws ShapeException {
        return new Point(x, y);
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
							
		System.out.println(getShapeType() + " " 
		+ Double.toString(x) + " " 
		+ Double.toString(y) + "\n");
		
		return 
		getShapeType() + " " 
		+ Double.toString(x) + " " 
		+ Double.toString(y) + "\n";
	}

	@Override
	public ArrayList<Double> getAllparameters() {
		
		ArrayList<Double> paramaters = new ArrayList();
		
		paramaters.add(x);
		paramaters.add(y);
		paramaters.add(1.0);
		paramaters.add(1.0);
		// TODO Auto-generated method stub
		return paramaters;
	}



	
}
