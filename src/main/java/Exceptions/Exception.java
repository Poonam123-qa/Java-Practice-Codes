package Exceptions;
//Write a Java program that throws an exception and catch it using a try-catch block.

public class Exception {

    public static int divide(int dividend, int divisor){
        if(divisor==0){
            throw new ArithmeticException("Cannot divide the given number by zero!");          //generating the exception before JVM is generating exception
        }
        return dividend / divisor;
    }
    public static void main(String args[]){

        try {
            int result=divide(10, 0);                //if the code level exception is occurs used the try and cacti
            System.out.println("Result is..."+result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception occurs...");        }
    }
}
