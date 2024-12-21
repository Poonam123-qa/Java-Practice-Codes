package Abstractions;
//Write a Java program to create an abstract class Animal with an abstract method called sound().
// Create subclasses Lion and Tiger that extend the Animal class and implement the sound() method to make a specific sound for each animal.

// Define an abstract class named Animal
abstract class Animal {
    // Declare an abstract method named sound
    public abstract void sound();
    //Abstract class and method has always incomplete
}

// Define a subclass named Tiger that extends Animal
class Tiger extends Animal{
    public void sound(){
        System.out.println("Tiger growls!");      //In the subclass have write the implementation is called concrete class and method
    }
}


// Define a subclass named Lion that extends Animal
class Lion extends Animal{
    public void sound(){
        System.out.println("Lion roars!");
    }
}

class main{
    public static void main(String args[]){
        Animal t=new Tiger();                         //here the can not create abstract class and method object only the the subclass object will be created
        t.sound();

        Animal l=new Lion();
        l.sound();
    }
}
