package ooit_java_v2_drawing;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Shape {
	private int x;
	private int y;
	private int diameter;
	private Color color;

	public Circle(int x, int y, int diameter, Color color) {
		this.x = x;
		this.y = y;
		this.diameter = diameter;
		this.color = color;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	
	
	
	
	
	
	
	@Override
	public void draw(Graphics g) {
		g.setColor(this.color);
		g.drawOval(x, y, diameter, diameter);
		g.fillOval(x, y, diameter, diameter);
	}

	@Override
	public void moveBy(int byX, int byY) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean contains(int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}
}
