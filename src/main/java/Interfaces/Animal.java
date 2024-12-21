package Interfaces;
//Write a Java program to create a Animal interface with a method called bark() that takes no arguments and returns void.
// Create a Dog class that implements Animal and overrides speak() to print "Dog is barking".

public interface Animal {

    //incomplete method same as abstractions
    void bark();
}

class Dog implements Animal{

    public void bark() {
        // Print a message indicating that the Dog is barking
        System.out.println("Dog is barking!");
    }
}

class test{
    public static void main(String args[]){
        Dog d=new Dog();
        d.bark();
    }
}