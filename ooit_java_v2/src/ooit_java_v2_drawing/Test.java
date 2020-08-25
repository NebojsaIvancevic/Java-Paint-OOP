package ooit_java_v2_drawing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import fff.Donut;

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
	private Shape currentShape;
	private boolean selected;
	private boolean mod;

	public Test() {
		shape = "";
		shapeColor = null;
		outerShapeColor = null;
		currentShape = null;
		selected = false;
		window = new JFrame("Iscrtava");
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

		panel.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent me) {

				Shape s = panel.findShapeAtPoint(me.getX(), me.getY()); // returns a selected shape
				if (currentShape != null) {
					currentShape.setSelected(false);
					
				}
				if ((s != null) && (s != currentShape)) {
					s.setSelected(true);
					
					
				} else {
					s = null;
				}
				currentShape = s;				
				
				if(s instanceof Circle) {
					((Circle) s).setSelected(false);
					((Circle) s).getCenter().setX(Integer.parseInt(JOptionPane.showInputDialog("Unesite koordinatu X:")));
					((Circle) s).getCenter().setY(Integer.parseInt(JOptionPane.showInputDialog("Unesite koordinatu Y:")));
					try {
						((Circle) s).setRadius(50);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					((Circle) s).setColor(Color.RED);
					((Circle) s).setInnerColor(Color.BLUE);
				//	panel.repaint();
					
					
				} else if (s instanceof Rectangle) {
					
				    ((Rectangle) s).setSelected(true);
					((Rectangle) s).getUpperLeftPoint().setX(Integer.parseInt(JOptionPane.showInputDialog("Unesite koordinatu X:")));
					((Rectangle) s).getUpperLeftPoint().setY(Integer.parseInt(JOptionPane.showInputDialog("Unesite koordinatu Y:")));
				((Rectangle) s).setHeight(Integer.parseInt(JOptionPane.showInputDialog("Unesite koordinatu Visinu:")));
					((Rectangle) s).setWidth(Integer.parseInt(JOptionPane.showInputDialog("Unesite koordinatu Sirinu:")));
					((Rectangle) s).setColor(Color.RED);
				((Rectangle) s).setInnerColor(Color.BLUE);
				} else {
					
					if (shape == "Rectangle") {
						panel.addShape(new Rectangle(new Point(me.getX(), me.getY()), 20, 40,selected,shapeColor,
										outerShapeColor));
					}
					
					if(shape == "Circle") { 
						panel.addShape(new Circle(new Point(me.getX(), me.getY()), 40, selected, shapeColor,
								outerShapeColor));
						} else if (shape == "Point") {
						panel.addShape(new Point(me.getX(), me.getY(), selected, shapeColor));
					} else if (shape == "Line") {
						panel.addShape(new Line(new Point(me.getX(), me.getY()), new Point(me.getX(), me.getY()), selected,
								shapeColor));
					}
				}
				
               for (Shape p : panel.getShapes()) { //iterate through each shape

                       panel.repaint(); // change will be shown
                   }
			}
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

		} else if (e.getSource().equals(this.modify)) {
			if(s != null) {
				setVisible(false);
			}
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
