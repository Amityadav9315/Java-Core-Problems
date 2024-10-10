package Oops;

public class Rectangle {
	 
	private double length; 
	private double breadth;
	public String getLength;
	public String getBreadth;
	public Rectangle(int i, int j) {
		// TODO Auto-generated constructor stub
	}
	public double getLength() {
		return length;
	}
	public double getBreadth() {
		return breadth;
	}
	public void setLength(double l) {
	    length=l;
	}
	public void setBreadth(double b) {
	 breadth=b;
	}
	public double area() {
		return length*breadth;
	}
	public double perimeter() {
		return 2*(length+breadth);
	}
	public boolean isSquare() {
		if(length==breadth) {
			return true;
		}
			else {
				return false;
			}
		}
	//public class RectangleTest() {
	
		
	
	
	
	
//}
	public static void main(String[] args) {
		Rectangle r=new Rectangle(10, 10);
		r.length=10.5;
		r.breadth=10.5;
		System.out.println("Area "+r.area());
		System.out.println("Perimeter "+r.perimeter());
		System.out.println("It is square "+r.isSquare());
		System.out.println("Length "+r.getLength());
		System.out.println("Breadth"+r.getBreadth());
		
		
		
		
	}

}
