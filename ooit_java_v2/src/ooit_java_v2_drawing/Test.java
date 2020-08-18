package ooit_java_v2_drawing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Test implements ActionListener {
//	JFrame window = new JFrame("Iscrtava");
//	final PnlDrawing panel = new PnlDrawing();
//	JPanel btnPanel = new JPanel();
//	JButton donut = new JButton("Donut");
//	JButton circle = new JButton("Circle");
//	JButton rectangle = new JButton("Rectangle");
//	JButton point = new JButton("Point");
//	JButton line = new JButton("Line");
	private static String shape;

	public Test() {
		shape = "";
		JFrame window = new JFrame("Iscrtava");
		final PnlDrawing panel = new PnlDrawing();
		JPanel btnPanel = new JPanel();
		JButton donut = new JButton("Donut");
		JButton circle = new JButton("Circle");
		JButton rectangle = new JButton("Rectangle");
		JButton point = new JButton("Point");
		JButton line = new JButton("Line");

		panel.setBackground(Color.YELLOW);
		btnPanel.setBackground(Color.DARK_GRAY);
		btnPanel.add(donut);
		btnPanel.add(circle);
		btnPanel.add(rectangle);
		btnPanel.add(line);
		btnPanel.add(point);

		panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                if(shape=="Circle") {
                	panel.addShape(new Circle(me.getX(), me.getY(), 20, Color.RED));
                }
                if(shape=="Rectangle") {
                	panel.addShape(new Rectangle(me.getX(), me.getY(), 20, Color.BLUE));;
                }
                // Add rest
                if(shape=="Rectangle") {
                	panel.addShape(new Rectangle(me.getX(), me.getY(), 20, Color.BLUE));;
                }
                
                if(shape=="Rectangle") {
                	panel.addShape(new Rectangle(me.getX(), me.getY(), 20, Color.BLUE));;
                }
                
                if(shape=="Rectangle") {
                	panel.addShape(new Rectangle(me.getX(), me.getY(), 20, Color.BLUE));;
                }
                
                for (Shape s : panel.getShapes()) {//iterate through each shape
//                 // selection logic
                        panel.repaint();// change will be shown
                    }
                }
        });
		
		circle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				shape = "Rectangle";
				}
				});
		
					
		rectangle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					shape = "Circle";	
				}
				});

		window.add(panel, BorderLayout.CENTER);
		window.add(btnPanel, BorderLayout.PAGE_END);

		window.setSize(800, 600);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}
	
	

	public static void main(String[] args) {
		System.out.println("Here we test...");
		  SwingUtilities.invokeLater(new Runnable() {
	            @Override
	            public void run() {
	                new Test();
	            }
	        });

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	}

