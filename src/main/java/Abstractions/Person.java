package Abstractions;
//Write a Java program to create an abstract class Person with abstract methods eat() and exercise().
// Create subclasses Athlete and LazyPerson that extend the Person class and implement the respective methods to describe how each person eats and exercises.

//Abstraction hides the complex implementation details and shows only the relevant functionality to the user.
abstract class Person {
    abstract void eat();

    abstract void exercise();
}


class Athlete extends Person{

    public void eat(){
        System.out.println("Athlete: Include foods full of calcium, iron, potassium, and fiber.");
    }
    public void exercise() {
        // Print a message about the athlete's training
        System.out.println("Athlete: Training allows the body to gradually build up strength and endurance, improve skill levels and build motivation, ambition and confidence.");
    }

    //hiding the functionality
    public void action1(){
        eat();
        exercise();
    }
}

class LazyPerson extends Person {
    // Override the eat method from the Person class
    @Override
    public void eat() {
        // Print a message about the lazy person's eating habits
        System.out.println("Couch Potato: Eating while watching TV also prolongs the time period that we're eating.");
    }

    // Override the exercise method from the Person class
    @Override
    public void exercise() {
        // Print a message about the lazy person's exercise habits
        System.out.println("Couch Potato: Rarely exercising or being physically active.");

        }

    public void action(){
        eat();
        exercise();
    }
}

class Testing{

    public static void main(String args[]){
        Athlete p=new Athlete();         //When we are hiding the functionality the have to create direct subclass object
        p.action1();

        LazyPerson l=new LazyPerson();
        l.action();
    }
}