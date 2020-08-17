package ooit_java_v2_drawing;

import java.awt.Graphics;

public class Circle extends Shape {

	public void kik() {
		System.out.println("WTFA");
	}
	
	@Override
	public void draw(Graphics g) {
		System.out.println("Here is drawing a circle...");
	}
}
