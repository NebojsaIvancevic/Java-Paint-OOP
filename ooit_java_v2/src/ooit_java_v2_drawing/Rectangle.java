package ooit_java_v2_drawing;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Shape {

	private double upperLeftPoint;
	private double width;
	private double height;
	private Color color;
	
	

	public Rectangle() {
		super();
	}

	
	


	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}





	public Rectangle(double width, double height, double upperLeftPoint) {
		this.width = width;
		this.height = height;
		this.upperLeftPoint = upperLeftPoint;
	}
	
	public Rectangle(double width, double height, double upperLeftPoint, Color color) {
		this.width = width;
		this.height = height;
		this.upperLeftPoint = upperLeftPoint;
		this.color = color;
	}

	
	
	public double getUpperLeftPoint() {
		return upperLeftPoint;
	}



	public void setUpperLeftPoint(double upperLeftPoint) {
		this.upperLeftPoint = upperLeftPoint;
	}



	public double getWidth() {
		return width;
	}



	public void setWidth(double width) {
		this.width = width;
	}



	public double getHeight() {
		return height;
	}



	public void setHeight(double height) {
		this.height = height;
	}

	
	public double area(double width, double height) {
		return width * height;
	}


	@Override
	public String toString() {
		return "Sirina je " + this.width + " a visina je: " + this.height;
	}
	
	@Override
	public void draw(Graphics g) 
	{
		g.setColor(color.BLUE);
		g.fillRect(20, 30, (int)width, (int)height);
	}
	
	
}
