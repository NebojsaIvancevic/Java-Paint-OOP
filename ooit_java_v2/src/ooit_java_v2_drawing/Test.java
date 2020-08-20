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

	// Shape and Color
	private String shape;
	private Color shapeColor;
	private Color outerShapeColor;
	private Shape currentShape;
	private boolean selected;

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

		panel.setBackground(Color.YELLOW);
		btnPanel.setBackground(Color.DARK_GRAY);
		btnPanel.add(donut);
		btnPanel.add(circle);
		btnPanel.add(rectangle);
		btnPanel.add(line);
		btnPanel.add(point);
		btnPanel.add(color);

		panel.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent me) {

				Shape s = panel.findShapeAtPoint(me.getX(), me.getY());
				if (currentShape != null) {
					currentShape.setSelected(false);
					
				}
				if ((s != null) && (s != currentShape)) {
					s.setSelected(true);
				} else {
					s = null;
				}
				currentShape = s;
				
				
				if(shape == "Circle") {
				
					if(currentShape instanceof Circle) {
						((Circle) currentShape).getCenter().setX(50);
						((Circle) currentShape).getCenter().setY(70);
						try {
							((Circle) currentShape).setRadius(50);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						((Circle) currentShape).setSelected(false);
						((Circle) currentShape).setColor(Color.RED);
						((Circle) currentShape).setInnerColor(Color.BLUE);
					} else {
					panel.addShape(new Circle(new Point(me.getX(), me.getY()), 40, true, shapeColor,
							outerShapeColor));
					}
				}
				
				if (shape == "Rectangle") {
					panel.addShape(new Rectangle(new Point(me.getX(), me.getY()), 20, 40, selected, shapeColor,
									outerShapeColor));
				} else if (shape == "Point") {
					panel.addShape(new Point(me.getX(), me.getY(), selected, shapeColor));
				} else if (shape == "Line") {
					panel.addShape(new Line(new Point(me.getX(), me.getY()), new Point(me.getX(), me.getY()), selected,
							shapeColor));
				} else if (shape == "Donut") {
					panel.addShape(new Donut(new Point(me.getX(),me.getY()), 50, 70, selected, shapeColor, outerShapeColor));
				} 
				

//                for (Shape s : panel.getShapes()) { //iterate through each shape
// selection logic
//                        panel.repaint(); // change will be shown
//                    }
			}
		});

		// Action Listener for all the buttons
		circle.addActionListener(this);
		donut.addActionListener(this);
		rectangle.addActionListener(this);
		line.addActionListener(this);
		point.addActionListener(this);
		color.addActionListener(this);

		window.add(panel, BorderLayout.CENTER);
		window.add(btnPanel, BorderLayout.PAGE_END);

		window.setSize(420, 420);
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
