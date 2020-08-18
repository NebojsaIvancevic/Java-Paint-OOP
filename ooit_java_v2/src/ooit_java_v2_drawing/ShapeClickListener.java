//package ooit_java_v2_drawing;
//
//import java.awt.Color;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
//
//public class ShapeClickListener extends MouseAdapter {
//
//	private PnlDrawing panel;
//	private String shape;
//	public ShapeClickListener(PnlDrawing panel, String shape) {
//		super();
//		this.shape = shape;
//		this.panel = panel;
//	}
//
//	@Override
//	public void mouseClicked(MouseEvent e) {
//	e.getMo
//		JButton source = (JButton) e.getSource();
//		
//	if(this.shape == "Circle") {
//		panel.addShape(new Circle(e.getX(), e.getY(), 24, Color.RED));
//	}
//
//	if(this.shape == "Rectangle") {
//		panel.addShape(new Rectangle(e.getX(), e.getY(), 24, Color.RED));
//	}
//	
////		}
////	}
//}
//}
