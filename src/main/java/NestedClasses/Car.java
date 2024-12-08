package NestedClasses;
//Write a Java program to create a class called Car with a method startEngine().
// Inside this method, define a local class Engine that has a method run().
// The run() method should print "Engine is running".
// Instantiate and call the run() method from within the startEngine() method.

public class Car {

    void startEngine(){

        class Engine{

            void  run(){
                System.out.println("Engine is running");
            }
        }
    //if you want to access the inner class methods then you have to create the instance of inner class.
        Engine e=new Engine();
        e.run();
    }
    public static void main(String args[]){

        Car c=new Car();
        c.startEngine();
    }
}
