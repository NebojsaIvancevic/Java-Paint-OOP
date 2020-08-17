package ooit_java_v2_drawing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;

public class Test {
	private static String shape = "";
	public static void main(String[] args) {
		System.out.println("Here we test...");
		
		JFrame window = new JFrame("Iscrtava");
		PnlDrawing panel = new PnlDrawing();
		JButton button = new JButton("draw Circle");
		JButton button1 = new JButton("draw Rectangle");
		window.setContentPane(panel);
		panel.add(button);
		panel.add(button1);
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				shape = "Circle";
				panel.addMouseListener(new ShapeClickListener(panel,shape));
				
				
			}
			
		});
		
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				shape = "Rectangle";
				panel.addMouseListener(new ShapeClickListener(panel, shape));
				
			}
			
		});
		
//		panel.addMouseListener(new ShapeClickListener(panel));
		window.setSize(500,500);
		window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		window.setVisible(true);
	}
}
