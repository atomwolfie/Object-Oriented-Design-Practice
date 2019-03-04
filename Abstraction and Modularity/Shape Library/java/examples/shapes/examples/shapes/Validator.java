package examples.shapes;


public class Validator {
    public static void validateDouble(double value, String errorMessage) throws ShapeException {
        if (Double.isInfinite(value) || Double.isNaN(value))
            throw new ShapeException(errorMessage);
    }

    public static void validatePositiveDouble(double value, String errorMessage) throws ShapeException {
        validateDouble(value, errorMessage);
        if (value<0)
            throw new ShapeException(errorMessage);
    }
    
    
    public static void validateTriangle(double t1, double t2, double l1, double l2, double r1, double r2, String errorMessage) throws ShapeException {
        validateDouble(t1, errorMessage);
        validateDouble(t2, errorMessage);
        validateDouble(l1, errorMessage);
        validateDouble(l2, errorMessage);
        validateDouble(r1, errorMessage);
        validateDouble(r2, errorMessage);
        
        
        //makes sure t1,t2 is highest point
        if(t2 < l2 || t2 < r2){
        	throw new ShapeException(errorMessage);
        }
        
        //makes sure l1 is leftmost point
        if(l1 > r1 || l1 > t1){
        	throw new ShapeException(errorMessage);
        }  
        
        //makes sure r1 is rightmost point
        if(r1 < l1 || r1 < t1){
        	throw new ShapeException(errorMessage);
        } 
        
    }
    
}
