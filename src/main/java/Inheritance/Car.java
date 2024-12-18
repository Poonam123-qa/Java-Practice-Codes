package Inheritance;
//Write a Java program to create a class called  Vehicle with a method called drive().
// Create a subclass called Car that overrides the drive() method to print "Repairing a car".

public class Car extends Vehicle{

    public void drive() {
        // Print "Repairing a Car" to the console
        System.out.println("Repairing a Car");
    }
}
