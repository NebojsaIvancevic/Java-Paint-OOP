package ooit_java_v2_drawing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test implements ActionListener {
	private String shape = "";
	JFrame window = new JFrame("Iscrtava");
	PnlDrawing panel = new PnlDrawing();
	JPanel btnPanel = new JPanel();
	JButton buttonOnPanel = new JButton("Click");
	JButton circle = new JButton("Circle");
	JButton rectangle = new JButton("Rectangle");

	public Test() {

		panel.setBackground(Color.CYAN);
		btnPanel.setBackground(Color.DARK_GRAY);
		btnPanel.add(buttonOnPanel);
		btnPanel.add(circle);
		btnPanel.add(rectangle);

		buttonOnPanel.addActionListener(this);
		circle.addActionListener(this);
		rectangle.addActionListener(this);

		window.add(panel, BorderLayout.CENTER);
		window.add(btnPanel, BorderLayout.PAGE_END);

		window.setSize(800, 600);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}

	public static void main(String[] args) {
		System.out.println("Here we test...");
		new Test();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(circle)) {
			this.shape = "Circle";
			// logika koja poziva implementirati
			panel.addMouseListener(new ShapeClickListener(panel,shape));
		} else if (e.getSource().equals(rectangle)) {
			this.shape = "Rectangle";
			// logika
			panel.addMouseListener(new ShapeClickListener(panel,shape));
		} else {
			System.out.println("ne radi i dalje");
		}
	}

}
