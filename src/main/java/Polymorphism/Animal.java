package Polymorphism;
//Write a Java program to create a base class Animal (Animal Family) with a method called Sound().
// Create two subclasses Bird and Cat.
// Override the Sound() method in each subclass to make a specific sound for each animal.

//method overriding the type of runtime polymorphism
//method overloading is the type of compile time polymorphism

public class Animal {

    void Sound(){
        System.out.println("The animal makes a sound");

    }
}

class Bird extends Animal{
    void Sound(){
        System.out.println("The Bird makes a sound");              //method overrides from the parent class

    }
}

class Cat extends Animal{
    void Sound(){
        System.out.println("The Cat makes a sound");             //method overrides from the parent class

    }
}

class main{
    public static void main(String args[]){
        Animal a=new Animal();
        a.Sound();

        Bird b=new Bird();
        b.Sound();

        Cat c=new Cat();
        c.Sound();

        Animal p=new Bird();                      //Dynamic dispatch means the calling the subclass using the base class
        p.Sound();

        Animal x=new Cat();
        x.Sound();
    }
}