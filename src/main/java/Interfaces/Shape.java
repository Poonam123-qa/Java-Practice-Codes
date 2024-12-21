package Interfaces;
//Write a Java program to create an interface Shape with the getArea() method.
// Create three classes Rectangle, Circle, and Triangle that implement the Shape interface.
// Implement the getArea() method for each of the three classes.

interface Shape {
    // Abstract method signature for getting the area of a shape. here no use to write the abstract keyword
    double getArea();
}

class Rectangle implements Shape{
    // Private instance variables to store the dimensions of the rectangle.
    private double length;
    private double width;

    // Constructor for creating a Rectangle object with given length and width.
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        // Calculate and return the area of the rectangle.
        return length * width;
    }
}

class Circle implements Shape{
    // Private instance variable to store the radius of the circle.
    private double radius;

    // Constructor for creating a Circle object with a given radius.
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of the 'getArea' method as required by the 'Shape' interface.
    @Override
    public double getArea() {
        // Calculate and return the area of the circle using the formula: π * r^2.
        return Math.PI * radius * radius;
    }
}

class Triangle implements Shape{
    // Private instance variables to store the base and height of the triangle.
    private double base;
    private double height;

    // Constructor for creating a Triangle object with a given base and height.
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Implementation of the 'getArea' method as required by the 'Shape' interface.
    @Override
    public double getArea() {
        // Calculate and return the area of the triangle using the formula: 0.5 * base * height.
        return 0.5 * base * height;
    }
}

class main{
    public static void main(String[] args) {
        // Create a Rectangle object with length=10 and width=12
        Rectangle rectangle = new Rectangle(10, 12);              //here we can not create the interface object

        // Create a Circle object with radius=3
        Circle circle = new Circle(3);

        // Create a Triangle object with base=4 and height=6
        Triangle triangle = new Triangle(4, 6);

        // Print the area of the Rectangle
        System.out.println("Area of the Rectangle: " + rectangle.getArea());

        // Print the area of the Circle
        System.out.println("Area of the Circle: " + circle.getArea());

        // Print the area of the Triangle
        System.out.println("Area of the Triangle: " + triangle.getArea());
    }
}
