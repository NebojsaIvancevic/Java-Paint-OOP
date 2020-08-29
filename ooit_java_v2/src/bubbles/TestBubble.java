package bubbles;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

import ooit_java_v2_drawing.Shape;

public class TestBubble {
	
	private ArrayList<Bubble> bubbles;
	
	
	
	public TestBubble() {
		JFrame frame = new JFrame("Bubble");
		JPanel panel = new JPanel();
		frame.add(panel, BorderLayout.CENTER);
		frame.setSize(840, 840);
		frame.setVisible(true);
		// window.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		int x = 100;
		int y = 200;
		int r = 50;
		Bubble b = new Bubble(x,y,r);
		bubbles.add(b);
	}
	
	
	public void paint(Graphics g){
		super.paint(g);
		for(Bubble b : bubbles) {
			s.draw(g);
		}
	}
	
	public void draw() {
		for(int i = 0; i < bubbles.size(); i++) {
			i.clicked();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

} 
class Bubble {
	int x,y,r;
	public Bubble(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}
	
	void clicked() {
		
	}
	
	@Override
	public void moveBy() {
		Random r = new Random();
		int low = 10;
		int high = 100;
		this.x = this.x + r.nextInt(high - low) + low;
		this.y = this.y + r.nextInt(high - low) + low;
	}
	show(){
		
	}
	
}
