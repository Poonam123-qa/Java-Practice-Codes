package Inheritance;

public class Rectangle extends Shape{
    // Define private instance variables length and width

    private double length;
    private double width;


    Rectangle(double len, double wid){
        this.length=len;                    // Assign the length parameter to the instance variable width
        this.width=wid;                    // Assign the width parameter to the instance variable width
    }

    public double getArea() {
        // Return 0.0 as the default area
        return length*width;
    }

}
