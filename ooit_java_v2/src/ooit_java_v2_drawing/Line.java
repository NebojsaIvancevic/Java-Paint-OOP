package ooit_java_v2_drawing;

public class Line {

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
}
