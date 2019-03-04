package examples.Composite;

import java.awt.Graphics;
import java.util.ArrayList;

import examples.shapes.Point;
import examples.shapes.ShapeException;
import examples.shapes.Validator;

public abstract class ShapeComponent {

	private String shapeType;
	
	
	public void setShapeType(String newName){
		shapeType = newName;
	}
	
	public String getShapeType(){
		return shapeType;
	}
	
	
	
	
	
	public void add(ShapeComponent newShapeComponent){
		
		throw new UnsupportedOperationException();
	}
	
	
public void remove(ShapeComponent newShapeComponent){
		
		throw new UnsupportedOperationException();
	}

public void removeAll(){
	
	throw new UnsupportedOperationException();
}




public void displayShapeInfo() {
	
	throw new UnsupportedOperationException();
	
}


public abstract double computeArea();

public abstract String getParametersInString();
public abstract ArrayList<Double> getAllparameters();

public abstract void scale(double scaleFactor) throws ShapeException;

public abstract void move(double deltaX, double deltaY) throws ShapeException;

	
}
