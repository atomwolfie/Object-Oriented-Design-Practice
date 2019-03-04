package examples.Internal;


public class AreaCalculator{
	
	
	
	public double computeArea(double width, double height){	
		return width * height;
	};
	
public double computeArea(double sideLength){	
		return sideLength * sideLength;
	};
	
	
	public double computeTriangleArea(double baseLength, double height){	
		return (baseLength * height)/2;
	};
	
	
	public double computeEllipseArea(double width, double height){	
		return Math.PI * (width / 2) * (height/ 2);
	};
	
	public double computeCircleArea(double radius){	
		return Math.PI * Math.pow(radius, 2);
	};
}