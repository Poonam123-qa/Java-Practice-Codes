package Inheritance;

public class Main {

    public static void main(String args[]){
        Animal a=new Animal();                   // Create an instance of Animal class because have to call specific animal class methods
        a.makeSound();

        Cat c=new Cat();                         // Create an instance of Cat class because have to call specific cat class methods
        c.makeSound();


        Vehicle v=new Vehicle();
        v.drive();

        Car car=new Car();
        car.drive();

        Rectangle r=new Rectangle(2,3);         // Create an instance of Rectangle with length 3.0 and width 10.0
        System.out.println("The Rectangle area is..."+r.getArea());   // Call the getArea method on the rectangle instance and store the result in the area variable

    }
}
