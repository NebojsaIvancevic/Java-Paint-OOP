package ooit_java_v2_drawing;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class Test {
	
	public static void main(String[] args) {
		System.out.println("Here we test...");
		
		JFrame window = new JFrame("Iscrtava");
		PnlDrawing panel = new PnlDrawing();
		
		window.setContentPane(panel);
		panel.addMouseListener(new ShapeClickListener(panel));
		window.setSize(500,500);
		window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		window.setVisible(true);
	}
}
