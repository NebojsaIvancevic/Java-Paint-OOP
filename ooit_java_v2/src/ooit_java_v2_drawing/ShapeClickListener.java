package ooit_java_v2_drawing;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ShapeClickListener extends MouseAdapter {

	private PnlDrawing panel;
	private String shape;

	public ShapeClickListener(PnlDrawing panel, String shape) {
		super();
		this.panel = panel;
		this.shape = shape;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		switch(shape) {
		case "Circle":
			panel.addShape(new Circle(e.getX(), e.getY(), 24, Color.RED));
			break;
		case "Rectangle":
			panel.addShape(new Rectangle(e.getX(), e.getY(), 30, Color.BLUE));
			break;
			
			default:
		
		}
	}
}
