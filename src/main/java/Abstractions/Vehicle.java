package Abstractions;
//Write a Java program to create an abstract class  Vehicle with abstract methods startEngine() and stopEngine(). 
// Create subclasses Car and  Motorcycle that extend the Vehicle class and implement the respective methods to start and stop the engines for each vehicle type.

abstract class Vehicle {
    
    abstract void startEngine();
    
    abstract void stopEngine();    
}


class Car extends Vehicle{
 
    public void startEngine(){
        System.out.println("Car Engine is started...");                  //overriding the abstract method
    }
    
    public void stopEngine(){
        System.out.println("Car Engine is stop...");
    }
}

class Motorcycle extends Vehicle{

    public void startEngine(){
        System.out.println("Motorcycle Engine is started...");
    }

    public void stopEngine(){
        System.out.println("Motorcycle Engine is stop...");
    }
}

class Test{
    public static void main(String args[]){
        Vehicle c=new Car();
        c.startEngine();
        c.stopEngine();

        Vehicle m=new Motorcycle();
        m.startEngine();
        m.stopEngine();
    }
}