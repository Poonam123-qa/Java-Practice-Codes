package Inheritance;

public class Main {

    public static void main(String args[]){
        Animal a=new Animal();                   // Create an instance of Animal class because have to call specific animal class methods
        a.makeSound();

        Cat c=new Cat();                         // Create an instance of Cat class because have to call specific cat class methods
        c.makeSound();
    }
}
