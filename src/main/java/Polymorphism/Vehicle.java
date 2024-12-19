package Polymorphism;
//Write a Java program to create a base class Vehicle with methods startEngine() and stopEngine().
// Create two subclasses Car and Motorcycle.
// Override the startEngine() and stopEngine() methods in each subclass to start and stop the engines differently.
public class Vehicle {

    void startEngine(){
        System.out.println("Engine is started of vehicle....");
    }

    void stopEngine(){
        System.out.println("Engine is stop of vehicle....");
    }
}

class Car extends Vehicle{
    void startEngine(){
        System.out.println("Engine is started of Car....");
    }

    void stopEngine(){
        System.out.println("Engine is stop of Car....");
    }
}

class Motorcycle extends Vehicle{
    void startEngine(){
        System.out.println("Engine is started of Motorcycle....");
    }

    void stopEngine(){
        System.out.println("Engine is stop of Motorcycle....");
    }
}

class test{
    public static void main(String args[]){
        // Create a Vehicle reference to a Car object
       Vehicle c= new Car();
       c.startEngine();
       c.stopEngine();

        // Create a Vehicle reference to a Motorcycle object
       Vehicle motorcycle = new Motorcycle();
       motorcycle.startEngine();
       motorcycle.stopEngine();
    }

}
