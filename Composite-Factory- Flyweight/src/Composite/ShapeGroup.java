package examples.Composite;

import java.util.ArrayList;
import java.util.Iterator;

import examples.shapes.ShapeException;

public class ShapeGroup extends ShapeComponent {

	public ArrayList<ShapeComponent> shapeComponents = new ArrayList<ShapeComponent>();
	
	
	String groupName;
	String groupDescription;
	
	public ShapeGroup(String newGroupName, String newGroupDescription){
		groupName = newGroupName;
		groupDescription = newGroupDescription;
	}
	
	public String getGroupName(){return groupName;}
	public String getGroupDescription(){return groupDescription;}
	
	public void add(ShapeComponent newShapeComponent){
		shapeComponents.add(newShapeComponent);
	}
	
	public void remove(ShapeComponent newShapeComponent){
		shapeComponents.remove(newShapeComponent);
	}
	
	public void removeAll(ShapeComponent newShapeComponent){
		
		for(int i = 0; i < shapeComponents.size(); i++){
		shapeComponents.remove(newShapeComponent);
		}
	}
	
	public ShapeComponent getComponent(int componentIndex){
		return (ShapeComponent)shapeComponents.get(componentIndex);
	}
	
	public void displayShapeInfo(){
		System.out.println(getGroupName() + " " + getGroupDescription() + "\n");
		
		Iterator<ShapeComponent> shapeIterator = shapeComponents.iterator();
		
		while(shapeIterator.hasNext()){
			
			ShapeComponent shapeInfo = (ShapeComponent) shapeIterator.next();
			shapeInfo.displayShapeInfo();
			
		}
	}

	
	@Override
	public double computeArea() {
		// does nothing here
		return 0;
	}

	@Override
	public void scale(double scaleFactor) throws ShapeException {
		// does nothing here
		
	}

	@Override
	public void move(double deltaX, double deltaY) throws ShapeException {
		// does nothing here
		
	}

	@Override
	public String printAllparameters() {
				
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
