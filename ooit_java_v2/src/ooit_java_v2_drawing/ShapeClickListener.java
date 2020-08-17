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
			if(shape == "Rectangle") {
					panel.addShape(new Rectangle(e.getX(), e.getY(), 30, Color.BLUE));		
				} else if(shape == "Circle") {
					panel.addShape(new Circle(e.getX(),e.getY(),24, Color.RED));
				} else {
					System.out.println("nothing");
				}
			}
	}
