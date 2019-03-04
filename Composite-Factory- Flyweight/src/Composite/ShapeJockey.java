package examples.Composite;

public class ShapeJockey {

	ShapeComponent shapeList;
	
	public ShapeJockey(ShapeComponent newShapeList){
		
		shapeList = newShapeList;
		
	}
	
	//calls displayShapeInfo on every shape  or shapegroup in shapeList
	
	public void getShapeList(){
		shapeList.displayShapeInfo();
	}
	
	
}
