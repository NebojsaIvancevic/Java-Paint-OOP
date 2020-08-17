package ooit_java_v2_drawing;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ShapeClickListener extends MouseAdapter {

	private PnlDrawing panel;
	
	public ShapeClickListener(PnlDrawing panel) {
		super();
		this.panel = panel;	
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// if button clicked add shape i modalni dijalog
		panel.addShape(new Rectangle(20, 10, e.getX(), Color.BLUE));
		
	}
}
