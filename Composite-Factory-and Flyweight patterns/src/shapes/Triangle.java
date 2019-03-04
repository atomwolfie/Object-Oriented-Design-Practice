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
@SuppressWarnings("WeakerAccess")
public class Triangle extends ShapeComponent {
    private double height;
    private double baseLength;
    private double x, y, t1, t2, l1, l2, r1,r2;
    private Line line1, line2, line3;

    /**
     * Constructor with x-y Location for center
     *
     * @param x                 The x-location of the center of the circle -- must be a valid double
     * @param y                 The y-location of the center of the circle
     * @param t1				the x location of the top most point of the triangle	
     * @param t2				the y location of the top most point of the triangle
     * @param l1				the x location of the left most point of the triangle
     * @param l2				the y location of the left most point of the triangle
     * @param r1				the x location of the right most point of the triangle
     * @param r2				the y location of the right most point of the triangle
     * @throws ShapeException   The exception thrown if the x, y, or z are not valid
     */
    public Triangle(double x, double y, double t1, double t2, double l1, double l2, double r1, double r2) throws ShapeException {
    	setShapeType("Triangle");
    	Validator.validateDouble(x, "invalid x coordinate");
    	Validator.validateDouble(y, "invalid y coordinate");
    	Validator.validatePositiveDouble(t1, "Invalid point");
        Validator.validatePositiveDouble(t2, "Invalid point");
        Validator.validatePositiveDouble(l1, "Invalid point");
        Validator.validatePositiveDouble(l2, "Invalid point");
        Validator.validatePositiveDouble(r1, "Invalid point");
        Validator.validatePositiveDouble(r2, "Invalid point");
               
        Validator.validateTriangle(t1, t2, l1, l2, r1, r2, "Invalid Tringle");
             
        //create triangles using line classes instead????
        line1 = new Line( t1,  l1,  t2,  l2);     
        line2 = new Line( t1,  r1,  t2,  r2);
        line3 = new Line( r1,  l1,  r2,  l2);
        
        this.x = x;
        this.y = y;
        this.t1 = t1;
        this.t2 = t2;
        this.l1 = l1;
        this.l2 = l2;
        this.r1 = r1;
        this.r2 = r2;
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
     * @return  The T1 point of the triangle
     */
    public double getT1() { return t1; }
    /**
     * @return  The t2 point of the triangle
     */
    public double getT2() { return t2; }
    /**
     * @return  The L1 point of the triangle
     */
    public double getL1() { return l1; }
    /**
     * @return  The l2 point of the triangle
     */
    public double getL2() { return l2; }
    /**
     * @return  The r1 point of the triangle
     */
    public double getR1() { return r1; }
    /**
     * @return  The r2 point of the triangle
     */
    public double getR2() { return r2; }
    /**
     * @return  The height of the triangle
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
        t1 *= scaleFactor;
        t2 *= scaleFactor;
        l1 *= scaleFactor;
        l2 *= scaleFactor;
        r1 *= scaleFactor;
        r2 *= scaleFactor;
    }

    
    /**
     * @return  The height of the triangle.
     */
    public double computeHeight() {
        
        //figure out how to calculate height from 3 points
        
        return 0;
    }
    
    
    /**
     * @return  The base length of the triangle.
     */
    public double computeBaseLength() {
        
        //figure out how to calculate base length from 3 points
        
        return t2 - ((l2 + r2)/2);
    }
    
    
	@Override
	public double computeArea() {
// Area of Triangle = (height * base ) / 2
    	    	
    	baseLength = computeBaseLength();
    	height = computeHeight();
    	   	
    	AreaCalculator areaHelper = new AreaCalculator();
    	
    	return areaHelper.computeTriangleArea(baseLength, height);
	}

	
	@Override
	public String getParametersInString() {
							
		return 
		getShapeType() + " " 
		+ Double.toString(x) + " " 
		+ Double.toString(y) + " " 
		+ Double.toString(t1) + " "
		+ Double.toString(t2) + " "
		+ Double.toString(l1) + " "
		+ Double.toString(l2) + " "
		+ Double.toString(r1) + " "
		+ Double.toString(r2)
		+ "\n";
	}
	
	@Override
	public ArrayList<Double> getAllparameters() {
		
		ArrayList<Double> parameters = new ArrayList();
		
		parameters.add(t1);
		parameters.add(t2);
		parameters.add(l1);
		parameters.add(l2);
		parameters.add(r1);
		parameters.add(r2);
		
		return parameters;
	}
	
}
