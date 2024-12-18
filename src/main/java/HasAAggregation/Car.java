package HasAAggregation;

public class Car {

    void startCar(){
        new Engine().stratEngine();              // If you don't want to use inheritance then use has a
        new Tyers().rolling();                   //Is a relation means the inheritance
    }

    public static void main(String args[]){
        Car c=new Car();
        c.startCar();
    }
}

