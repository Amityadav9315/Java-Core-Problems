package Method;

public class OverloadedmethodtocalculateArea {
	static double Area(double radius) {
		return Math.PI*radius*radius;
		
	}
	static double Area(double length,double breadth) {
		return length*breadth;
		
	}
	public static void main(String[] args) {
		int length=10;
		int breadth=20;
		Area(breadth);
		
	}

}
   