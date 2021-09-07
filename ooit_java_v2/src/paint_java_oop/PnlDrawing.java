package paint_java_oop;

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
	public void removeShape(Shape shape) {
		shapes.remove(shape);
		this.repaint();
	}
	
	public Shape findShapeAtPoint(int x, int y) {
		boolean found = false;
		int i = 0;
		
		while(!found && (i<shapes.size()))
		{
			if(shapes.get(i).contains(x,y))
				found = true;
			else
				i++;
		}
		if (found)
			return shapes.get(i);
		else
			return null;	
	}
	
	@Override
	public void paint(Graphics g){
		super.paint(g);
		for(Shape s : shapes) {
			s.draw(g);
		}
	}
}
