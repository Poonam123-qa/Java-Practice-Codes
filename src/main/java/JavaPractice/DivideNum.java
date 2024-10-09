package JavaPractice;

import java.util.Scanner;

public class DivideNum {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the first number:");
        int a=sc.nextInt();

        System.out.println("Enter the second number:");
        int b =sc.nextInt();

        double c= (double) a /b;

        System.out.println("The divided number is..."+c);
    }
}
