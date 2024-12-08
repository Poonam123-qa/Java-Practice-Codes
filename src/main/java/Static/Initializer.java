package Static;

public class Initializer {
    static int init;

    static {
        init =1000;
        System.out.println("The initial value is..."+init);     //First static block will be called
    }

    public static void main(String args[]){
        System.out.println("Before the initializing the value..."+init);       // after the static block main method will be called

        Initializer i=new Initializer();
        System.out.println("After the initializing the value...."+init);       //In method whenever we crate the new constructor will be called
    }
}
