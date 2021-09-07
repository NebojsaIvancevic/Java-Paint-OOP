package paint_java_oop;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;



public class Test implements ActionListener {
	// Frame
	private JFrame window;

	// Panels
	private PnlDrawing panel;
	private JPanel btnPanel;

	// Buttons
	private JButton donut;
	private JButton circle;
	private JButton rectangle;
	private JButton point;
	private JButton line;
	private JButton color;
	private JButton modify;

	// Shape and Color
	private String shape;
	private Color shapeColor;
	private Color outerShapeColor;
	private Shape current;
	private boolean selected;
	private ArrayList<Shape> shapes;

	public Test() {
//		shape = "";
//		shapeColor = null;
//		outerShapeColor = null;
//		currentShape = null;
		selected = false;
		shapes = new ArrayList<Shape>();
		window = new JFrame("Drawing");
		final PnlDrawing panel = new PnlDrawing();
		btnPanel = new JPanel();
		donut = new JButton("Donut");
		circle = new JButton("Circle");
		rectangle = new JButton("Rectangle");
		point = new JButton("Point");
		line = new JButton("Line");
		color = new JButton("Color");
		modify = new JButton("Modify");

		panel.setBackground(Color.YELLOW);
		btnPanel.setBackground(Color.DARK_GRAY);
		btnPanel.add(donut);
		btnPanel.add(circle);
		btnPanel.add(rectangle);
		btnPanel.add(line);
		btnPanel.add(point);
		btnPanel.add(color);
		btnPanel.add(modify);
		
		panel.addShape(new Rectangle(new Point(200,150),20,40, false, shapeColor,outerShapeColor));
		panel.addShape(new Rectangle(new Point(300,450),20,40, false, shapeColor,outerShapeColor));
		panel.addShape(new Rectangle(new Point(100,150),40,60, false, shapeColor,outerShapeColor));

		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent me) {
				  super.mouseClicked(me);
	                for (Shape b : panel.getShapes()) {//iterate through each ball
	                    if (b.contains(me.getX(), me.getY())) {//get the ball bounds and check if mouse click was within its bounds
	                        if (!b.isSelected()) {//check if ball has been clicked on
	                            b.setSelected(true);
	                        } else {
	                            b.setSelected(false);
	                        }
	                        panel.repaint();//so ball color change will be shown
	                    }
	                }
//			Shape rect1 = new Rectangle(new Point(me.getX(),me.getY()),20,40, selected, shapeColor,outerShapeColor);
//		//	shapes.add(rect1);
//			panel.addShape(rect1);
////			panel.addShape(new Rectangle(new Point(50,70),20,40, selected, shapeColor,outerShapeColor));
////			//shapes.contains(panel.getShapes());
//			
////			
////			Iterator<Shape> it = panel.getShapes().iterator();
////			while(it.hasNext()) {
////				shapes.contains(me.getX(),me.getY());
////			}
//			
//			for(Shape s : panel.getShapes()) {
//				if(s.contains(me.getX(), me.getY()))
//				s.setSelected(true);
//				else 
//					s.setSelected(false);
//				panel.repaint();
//			}
			
//			if(current.contains(me.getX(), me.getY())) {
//				current.setSelected(true);
//				selected = false;
//			}
//			if(current.isSelected()) {
//				current.setSelected(false);
//				selected = true;
//			}
//			if(!current.isSelected()) {
//				current = new Rectangle(new Point(100,300),20,40, selected, shapeColor,outerShapeColor);
//				panel.addShape(current);
//			}
			
//			} else if (shape == "Circle") {
//				current = new Circle(new Point(100, 300), 40, selected, shapeColor, outerShapeColor);
//				panel.addShape(current);
//				current.contains(me.getX(), me.getY());
//			}
		
//					shapes.add(new Rectangle(new Point(x, y), 20, 40, selected, shapeColor,
//							outerShapeColor));
//				} else if (shape == "Circle") {
//					panel.addShape(
//							new Circle(new Point(x, y), 40, selected, shapeColor, outerShapeColor));
//				}
//				} else if (shape == "Point") {
//					panel.addShape(new Point(me.getX(), me.getY(), selected, shapeColor));
//				} else if (shape == "Line") {
//					panel.addShape(new Line(new Point(me.getX(), me.getY()), new Point(me.getX(), me.getY()), selected,
//							shapeColor));
//				}
//				for(int i = 0; i < shapes.size(); i++) {
//				
//			}
//				for (Shape p : panel.getShapes()) { // iterate through each shape
//
//					p.contains(x,y);
//					panel.repaint(); // change will be shown
//				}
				
				// ako sadrzi system.out.println() ce biti BUBBLE
//				if(currentShape.contains(x, y)) {
//					currentShape.setSelected(true);
//				} else {
//					currentShape.setSelected(false);
//				}
				
			}
			

//			private Shape shapeClicked(int x, int y) {
////				Shape s = panel.findShapeAtPoint(x, y); // returns a selected shape
////				if (currentShape != null) 
////					currentShape.setSelected(false);
////				if ((s != null) && (s != currentShape)) {
////					s.setSelected(true);
////
////				} else {
////					s = null;
////				}
////				currentShape = s;
//				boolean found = false;
//				int i = 0;
//				
//				while(!found && (i<panel.getShapes().size()))
//				{
//					if(panel.getShapes().get(i).contains(x,y))
//						found = true;
//					else
//						i++;
//				}
//				if (found) {
//					System.out.println("Clicked on the bubble");
//					return panel.getShapes().get(i);
//				} else {
//					System.out.println("You didnt click the bubble");
//					return null;
//				}
				// TODO Auto-generated method stub
//				if (currentShape instanceof Circle) {
//					((Circle) currentShape).setSelected(false);
//					((Circle) currentShape).getCenter()
//							.setX(Integer.parseInt(JOptionPane.showInputDialog("Unesite koordinatu X:")));
//					((Circle) currentShape).getCenter()
//							.setY(Integer.parseInt(JOptionPane.showInputDialog("Unesite koordinatu Y:")));
//					try {
//						((Circle) currentShape).setRadius(50);
//					} catch (Exception e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//					((Circle) currentShape).setColor(Color.RED);
//					((Circle) currentShape).setInnerColor(Color.BLUE);
//					panel.repaint();
//
//				} else if (currentShape instanceof Rectangle) {
//
//					((Rectangle) currentShape).setSelected(false);
//					((Rectangle) currentShape).getUpperLeftPoint()
//							.setX(Integer.parseInt(JOptionPane.showInputDialog("Unesite koordinatu X:")));
//					((Rectangle) currentShape).getUpperLeftPoint()
//							.setY(Integer.parseInt(JOptionPane.showInputDialog("Unesite koordinatu Y:")));
//					((Rectangle) currentShape)
//							.setHeight(Integer.parseInt(JOptionPane.showInputDialog("Unesite koordinatu Visinu:")));
//					((Rectangle) currentShape)
//							.setWidth(Integer.parseInt(JOptionPane.showInputDialog("Unesite koordinatu Sirinu:")));
//					((Rectangle) currentShape).setColor(Color.RED);
//					((Rectangle) currentShape).setInnerColor(Color.BLUE);
//					panel.repaint();
//					((Rectangle) currentShape).setSelected(true);
//				}
			//}
		});
	

		// Action Listener for all the buttons
		circle.addActionListener(this);
		donut.addActionListener(this);
		rectangle.addActionListener(this);
		line.addActionListener(this);
		point.addActionListener(this);
		color.addActionListener(this);
		modify.addActionListener(this);

		window.add(panel, BorderLayout.CENTER);
		window.add(btnPanel, BorderLayout.PAGE_END);

		window.setSize(840, 840);
		window.setVisible(true);
		// window.pack();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(this.circle)) {
			shape = "Circle";
			shapeColor = Color.BLACK;
			outerShapeColor = Color.BLACK;
		} else if (e.getSource().equals(this.point)) {
			shape = "Point";
			shapeColor = Color.BLACK;
		} else if (e.getSource().equals(this.rectangle)) {
			shape = "Rectangle";
			shapeColor = Color.BLACK;
			outerShapeColor = Color.BLACK;

		} else if (e.getSource().equals(this.line)) {
			shape = "Line";
			shapeColor = Color.BLACK;

		} else if (e.getSource().equals(this.donut)) {
			shape = "Donut";
			shapeColor = Color.BLACK;
			outerShapeColor = Color.BLACK;
		}
		if (e.getSource().equals(this.color)) {
			if (shape == "Circle") {
				Color startingColor = Color.RED;
				Color color = JColorChooser.showDialog(window, "Pick a color", startingColor);
				Color color2 = JColorChooser.showDialog(window, "Pick a color", startingColor);
				shapeColor = color;
				outerShapeColor = color2;
			} else if (shape == "Point") {
				Color startingColor = Color.RED;
				Color color = JColorChooser.showDialog(window, "Pick a color", startingColor);
				shapeColor = color;
			} else if (shape == "Line") {
				Color startingColor = Color.RED;
				Color color = JColorChooser.showDialog(window, "Pick a color", startingColor);
				shapeColor = color;
			} else if (shape == "Rectangle") {
				Color startingColor = Color.RED;
				Color color = JColorChooser.showDialog(window, "Pick a color", startingColor);
				Color color2 = JColorChooser.showDialog(window, "Pick a color", startingColor);
				shapeColor = color;
				outerShapeColor = color2;
			} else if (shape == "Donut") {
				Color startingColor = Color.RED;
				Color color = JColorChooser.showDialog(window, "Pick a color", startingColor);
				Color color2 = JColorChooser.showDialog(window, "Pick a color", startingColor);
				shapeColor = color;
				outerShapeColor = color2;
			}
		}

	}
	
	public void modify() {
		if (current instanceof Circle) {
			((Circle) current).setSelected(false);
			((Circle) current).getCenter()
					.setX(Integer.parseInt(JOptionPane.showInputDialog("Unesite koordinatu X:")));
			((Circle) current).getCenter()
					.setY(Integer.parseInt(JOptionPane.showInputDialog("Unesite koordinatu Y:")));
			try {
				((Circle) current).setRadius(50);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			((Circle) current).setColor(Color.RED);
			((Circle) current).setInnerColor(Color.BLUE);
			panel.repaint();

		} else if (current instanceof Rectangle) {

			((Rectangle) current).setSelected(false);
			((Rectangle) current).getUpperLeftPoint()
					.setX(Integer.parseInt(JOptionPane.showInputDialog("Unesite koordinatu X:")));
			((Rectangle) current).getUpperLeftPoint()
					.setY(Integer.parseInt(JOptionPane.showInputDialog("Unesite koordinatu Y:")));
			((Rectangle) current)
					.setHeight(Integer.parseInt(JOptionPane.showInputDialog("Unesite koordinatu Visinu:")));
			((Rectangle) current)
					.setWidth(Integer.parseInt(JOptionPane.showInputDialog("Unesite koordinatu Sirinu:")));
			((Rectangle) current).setColor(Color.RED);
			((Rectangle) current).setInnerColor(Color.BLUE);
			panel.repaint();
			((Rectangle) current).setSelected(true);
		}
	}

	// Call the program
	public static void main(String[] args) {
		System.out.println("Here we test...");
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Test();
			}
		});

	}
}
