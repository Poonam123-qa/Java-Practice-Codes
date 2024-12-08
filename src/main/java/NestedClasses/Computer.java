package NestedClasses;
//Write a Java program to create an outer class called  Computer with an inner class Processor.
// The Processor class should have a method "displayDetails()" that prints the details of the processor (e.g., brand and speed).
// Create an instance of Processor from the Computer class and call the "displayDetails()" method.
public class Computer {

    public class Processor{

     void displayDetails(){

         System.out.println("Processor Brand: Intel");
         System.out.println("Processor Speed: 3.5 GHz");
       }
    }

    void showDetails(){
    //We can not directly access the inner class in the outer class, so that we have to create the instance of inner class, and then we can access the inner class in outer class
        Processor p=new Processor();
        p.displayDetails();
    }

    public static void main(String[] args) {
        // Create an instance of the outer class Computer
        Computer computer = new Computer();
        // Call the method to show processor details
        computer.showDetails();
    }
}
