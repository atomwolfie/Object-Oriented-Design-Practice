package examples.shapes;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import examples.Composite.ShapeComponent;

public class EmbeddedImage extends ShapeComponent{

	
	private double x, y, dimensionX, dimensionY;
	
	private String fileName;
	

	
	
	public EmbeddedImage() throws ShapeException{
		setShapeType("EmbeddedImage");
		setDimensionX(1000);
		setDimensionY(750);	
		this.x = 0;
		this.y = 0;
	}
	
	
	public EmbeddedImage(String newFile) throws ShapeException{
		setShapeType("EmbeddedImage");
		fileName = newFile;
		setDimensionX(1000);
		setDimensionY(750);	
		this.x = 0;
		this.y = 0;
	}
	
	
	public EmbeddedImage(Double x, Double y) throws ShapeException{
		setShapeType("EmbeddedImage");
		setDimensionX(1000);
		setDimensionY(750);	
		this.x = x;
		this.y = y;
	}
	
	public EmbeddedImage(Double x, Double y, String newFile) throws ShapeException{
		setShapeType("EmbeddedImage");
		fileName = newFile;
		setDimensionX(1000);
		setDimensionY(750);	
		this.x = x;
		this.y = y;
	}
	
	public EmbeddedImage(double xLocation, double yLocation, double xDimension, double yDimension) throws ShapeException{
		setShapeType("EmbeddedImage");
		setDimensionX(xDimension);
		setDimensionY(yDimension);
		this.x = xLocation;
		this.y = yLocation;
	}
	
	
	public EmbeddedImage(double xLocation, double yLocation, double xDimension, double yDimension, String newFile) throws ShapeException{
		setShapeType("EmbeddedImage");
		setFileName(newFile);
		setDimensionX(xDimension);
		setDimensionY(yDimension);
		this.x = xLocation;
		this.y = yLocation;	
	}
	
	
	
	
	public void showImage(){
		try {
            JFrame frame = new JFrame();
            File imageFile = new File(fileName);
            Image i = ImageIO.read(imageFile);
            ImageIcon image = new ImageIcon(i);
            JLabel imageLabel = new JLabel(image);
            frame.add(imageLabel);
            frame.setLayout(null);
            imageLabel.setLocation(0, 0);
            imageLabel.setSize((int)dimensionX, (int)dimensionY);
            imageLabel.setVisible(true);
            frame.setVisible(true);
            //frame.setSize(1000, 750);
            frame.pack();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
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

	
	public String getFileName(){
		return fileName;
	}
	
	public void setFileName(String newName){
		fileName = newName;
	}
	
	
	public double getDimensionX(){
		return dimensionX;
	}
	
	public double getDimensionY(){
		return dimensionY;
	}
	
	public void setDimensionX(double x){
		 dimensionX = x;
	}
	
	public void setDimensionY(double y){
		 dimensionY = y;
	}
	
	
	
	
	@Override
	public double computeArea() {
		return 0;
	}

	@Override
	public void scale(double scaleFactor) throws ShapeException {
		dimensionX = dimensionX * scaleFactor;
		dimensionY = dimensionY * scaleFactor;
	}

	@Override
	public void move(double deltaX, double deltaY) throws ShapeException {
		this.x = deltaX;
        this.y = deltaY;	
	}
	
	 @Override
		public String getParametersInString() {
									
			return 
			getShapeType() + " "
			+ Double.toString(x) + " " 
			+ Double.toString(y) + " " 
			+ Double.toString(dimensionX) + " "
			+ Double.toString(dimensionY) + " "
			+ fileName
			+ "\n";
		}


	@Override
	public ArrayList<Double> getAllparameters() {
		
		ArrayList<Double> parameters = new ArrayList();
				
		
		parameters.add(x);
		parameters.add(y);
		parameters.add(dimensionX);
		parameters.add(dimensionY);
		parameters.add(Double.valueOf(fileName));
		
		
		return parameters;
	}
}
