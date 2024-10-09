package JavaPractice;

import java.util.Scanner;

public class ProductofNum {
    public static void main(String[] args) {
        int a,b,prod;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        a=sc.nextInt();

        System.out.println("Enter the second number");
        b=sc.nextInt();

        prod=a*b;

        System.out.println("The product is "+prod);
    }
}
