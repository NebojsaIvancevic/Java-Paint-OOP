package ooit_java_v2_drawing;

import java.awt.Graphics;

public class Line extends Shape {

	private int startPoint;
	private int endPoint;
	
	
	public Line() {}
	public Line(int startPoint) {
		this.startPoint = startPoint;
	}
	public Line(int startPoint, int endPoint) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
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
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean contains(int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}
}
