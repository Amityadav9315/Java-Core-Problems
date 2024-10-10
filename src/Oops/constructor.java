package Oops;

public class constructor {
    private double length;
    private double breadth;

    // Default constructor
    public constructor() {
        length = 1;
        breadth = 1;
    }

    // Constructor with two parameters
    public constructor(double l, double b) {
        if (l > 0 && b > 0) {
            length = l;
            breadth = b;
        } else {
            System.out.println("Invalid values for length and breadth. Using default values.");
            length = 1;
            breadth = 1;
        }
    }

    // Constructor with one parameter (square)
    public constructor(double s) {
        if (s > 0) {
            length = breadth = s;
        } else {
            System.out.println("Invalid value for side. Using default value.");
            length = breadth = 1;
        }
    }

    // Method to calculate area
    public double area() {
        return length * breadth;
    }

    public static class RectangleTest {
        public static void main(String[] args) {
            // Creating a rectangle with invalid dimensions
            constructor r = new constructor(-10, -20);
            System.out.println("Area: " + r.area());
        }
    }
}
