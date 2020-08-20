package ooit_java_v2_drawing;

import java.awt.Color;
import java.awt.Graphics;

public class Point extends Shape{

	private int x;
	private int y;

	public Point() {

	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Point(int x, int y, boolean selected) {
		this(x, y);
		setSelected(selected);
	}
	
	public Point(int x, int y, boolean selected, Color color) {
		this(x, y, selected);
		setColor(color);
	}
	
	
	public int getX() {
		return this.x;
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
	
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

	
	public double distance(int x2, int y2) {
		double dx = this.x - x2;
		double dy = this.y - y2;
		double d = Math.sqrt(dx*dx+dy*dy);
		return d;
	}
	
	
	public boolean equals(Object obj) {
		if (obj instanceof Point) {
			Point prosledjena = (Point) obj;
			if (this.x == prosledjena.getX() && this.y == prosledjena.getY()) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	
	// Methods defined in Shape abstract class
	// By defining abstract methods every class that is extended by super class 
	// must also have a implementation, since it's a abstract method, the logic of the method
	// is abstracted to a class that extends the super class
	// we can implement it how we want
	
	@Override
	public void moveBy(int byX, int byY) {
		// TODO Auto-generated method stub
		this.x = this.x + byX;
		this.y += byY;
		
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if (o instanceof Point) {
			Point p = new Point(0, 0);
			return (int) (this.distance(p.getX(), p.getY()) - ((Point) o).distance(p.getX(), p.getY()));
		}
		return 0;
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(getColor());
		g.drawLine(this.x-2, this.y, this.x+2, this.y);
		g.drawLine(this.x, this.y-2, this.x, this.y+2);
		
		if (isSelected()) {
			g.setColor(Color.BLUE);
			g.drawRect(this.x-3, this.y-3, 6, 6);
		}
	}

	@Override
	public boolean contains(int x, int y) {
		// TODO Auto-generated method stub
		return this.distance(x, y) <= 3;
	}


}
