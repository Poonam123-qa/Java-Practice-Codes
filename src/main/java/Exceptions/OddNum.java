package Exceptions;
//Write a Java program to create a method that takes an integer as a parameter and throws an exception if the number is odd.

public class OddNum {

    public static void main(String args[]) throws IllegalAccessException {
        int n=18;
        trynum(n);

    }
    public static void trynum(int i){

        try {
            even(i);
            System.out.println(i + " is even.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public static void even(int i) throws IllegalAccessException {
        if(i%2!=0){
           throw new IllegalAccessException(i+"Number is odd...");
        }
    }
}
