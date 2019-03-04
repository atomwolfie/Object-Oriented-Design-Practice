package examples.InputOutput;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

import examples.Composite.ShapeComponent;
import examples.Composite.ShapeGroup;

public class DrawShapes extends JFrame{

	public static final int CANVAS_WIDTH  = 1000;
    public static final int CANVAS_HEIGHT = 1000;
	
    ShapeGroup shapeGroup = null;
    
    private DrawCanvas canvas;
    
    public DrawShapes(ShapeGroup newGroup) {
    	shapeGroup = newGroup;
        canvas = new DrawCanvas();   
        canvas.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
   
        Container cp = getContentPane();
        cp.add(canvas);
   
        setDefaultCloseOperation(EXIT_ON_CLOSE);   
        pack();              
        setTitle("......");  
        setVisible(true);    
     }
    
    
    private class DrawCanvas extends JPanel {
        // Override paintComponent to perform your own painting
        @Override
        public void paintComponent(Graphics g) {
           super.paintComponent(g);     // paint parent's background
           setBackground(Color.BLACK);  // set background color for this JPanel
   
           g.setColor(Color.WHITE);
           
           for(int i = 0; i < shapeGroup.shapeComponents.size(); ++i){
        	   
        	  ShapeComponent shape = shapeGroup.shapeComponents.get(i);
        	   shape.getShapeType();
        	   
        	  ArrayList<Double> parameters = new ArrayList();
         	  parameters = shape.getAllparameters();
        	   
        	   if(shape.getShapeType().equals("Circle")){
        		   g.drawOval(parameters.get(0).intValue(), parameters.get(1).intValue(), 
              			  parameters.get(2).intValue(), parameters.get(3).intValue());
           }
           
        	   if(shape.getShapeType().equals("Ellipse")){
            	   g.drawOval(parameters.get(0).intValue(), parameters.get(1).intValue(), 
             			  parameters.get(2).intValue(), parameters.get(3).intValue());
               }
        	   
        	   if(shape.getShapeType().equals("Square")){
        		   g.drawRect(parameters.get(0).intValue(), parameters.get(1).intValue(), 
             			  parameters.get(2).intValue(), parameters.get(3).intValue());
               }
        	   
        	   if(shape.getShapeType().equals("Recatangle")){
        		  g.drawRect(parameters.get(0).intValue(), parameters.get(1).intValue(), 
            			  parameters.get(2).intValue(), parameters.get(3).intValue());
        	   }
        	   
        	   if(shape.getShapeType().equals("Triangle")){
        		   //draws 3 lines for triangle
        		   
        		   //line 1
        		   g.drawLine(parameters.get(2).intValue(), parameters.get(0).intValue(), 
             			  parameters.get(3).intValue(), parameters.get(1).intValue());
        		          		   
        		   //line 2
        		   g.drawLine(parameters.get(2).intValue(), parameters.get(4).intValue(), 
              			  parameters.get(3).intValue(), parameters.get(5).intValue());
        		  
        		   //line 3
        		   g.drawLine(parameters.get(4).intValue(), parameters.get(0).intValue(), 
              			  parameters.get(5).intValue(), parameters.get(1).intValue());
        		   
               }
        	   if(shape.getShapeType().equals("Point")){
        		   g.drawOval(parameters.get(0).intValue(), parameters.get(1).intValue(), 
              			  parameters.get(2).intValue(), parameters.get(3).intValue());
               }
        	   
        	   if(shape.getShapeType().equals("Line")){           	  
            	  g.drawLine(parameters.get(0).intValue(), parameters.get(1).intValue(), 
            			  parameters.get(2).intValue(), parameters.get(3).intValue());
               }
        	   
        	   if(shape.getShapeType().equals("Embedded Image")){           	  
             	  
        		   String fileName = String.valueOf(parameters.get(5));
        		   
        		   BufferedImage image = null;
				try {
					image = ImageIO.read(new File(fileName));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        		   
        		   g.drawImage(image, parameters.get(0).intValue(), parameters.get(1).intValue(), 
        				   parameters.get(2).intValue(), parameters.get(3).intValue(), null);
        		   
                }
        	   
        }
     }
   }
}