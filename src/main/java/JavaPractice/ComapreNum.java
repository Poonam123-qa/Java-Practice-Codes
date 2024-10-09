package JavaPractice;

import java.util.Scanner;

public class ComapreNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();

        System.out.println("Enter another number: ");
        int b = sc.nextInt();

        if (a==b)
            System.out.printf("%d == %d\n", a, b);
        if(a>b)
            System.out.printf("%d > %d\n", a, b);
        if (a<b)
            System.out.printf("%d < %d\n", a, b);
        if (a<=b)
            System.out.printf("%d <= %d\n", a, b);
        if (a>=b)
            System.out.printf("%d >= %d\n", a, b);
        if (a!=b)
            System.out.printf("%d != %d\n", a, b);

    }
}
