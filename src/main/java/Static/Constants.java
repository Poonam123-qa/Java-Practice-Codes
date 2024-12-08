package Static;

public class Constants {

    //The final keyword ensures that the value of PI cannot be altered once it is set, providing a constant value that can be used throughout the class.
    //If we assigned the value to static variable it can be changed but the final can not changed the value
    static final double PI=3.14159;

    public static double calculate(double radius) {

        return PI * radius * radius;
    }

    public static void main(String args[]){

        System.out.println("The area of circle is..."+calculate(5));
    }
}
