package ooit_java_v2_drawing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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

	// Shape and Color
	private String shape;
	private Color shapeColor;

	public Test() {
		shape = "";
		shapeColor = null;
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
				if (shape == "Circle") {
					panel.addShape(new Circle(me.getX(), me.getY(), 20, shapeColor));
				}
				if (shape == "Rectangle") {
					panel.addShape(new Rectangle(me.getX(), me.getY(), 20, Color.BLUE));
				}

				if (shape == "Point") {
					panel.addShape(new Point(me.getX(), me.getY()));
					;
				}

				if (shape == "Line") {
					panel.addShape(new Line(me.getX(), me.getY()));
					;
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
		if(e.getSource().equals(color)) {
			Color startingColor = Color.RED;
			Color color = JColorChooser.showDialog(window, "Pick a color", startingColor);
			shapeColor = color;
		}
		if (e.getSource().equals(this.circle)) {
			shape = "Circle";
		} else if (e.getSource().equals(this.point)) {
			shape = "Point";
		}
//		} else {
//			panel.addMouseListener(l);JOptionPane.showInputDialog("Please select a shape to draw on canvas");
//		}

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
