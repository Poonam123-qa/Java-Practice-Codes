package JavaPractice;

import java.util.Scanner;

public class Mathoperations {
    public static void main(String[] args) {

        int a, b,sum,sub,mul,div;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        a = sc.nextInt();

        System.out.println("Enter the second number");
        b = sc.nextInt();

        sum = a+b;
        sub = a-b;
        mul = a*b;
        div = a/b;

        System.out.println("The sum is: " + sum);
        System.out.println("The subtraction is: " + sub);
        System.out.println("The multiplication is: " + mul);
        System.out.println("The division is: " + div);
    }
}
