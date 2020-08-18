package ooit_java_v2_drawing;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

public class PnlDrawing extends JPanel {

	private ArrayList<Shape> shapes = new ArrayList<Shape>();
	
	public void addShape(Shape shape) {
		shapes.add(shape);
		this.repaint();
	}
	
	public ArrayList<Shape> getShapes(){
		return shapes;
	}
	
	@Override
	public void paint(Graphics g){
		super.paint(g);
		for(Shape s : shapes) {
			s.draw(g);
		}
	}
}
