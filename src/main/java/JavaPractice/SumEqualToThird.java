package JavaPractice;

import java.util.Scanner;

public class SumEqualToThird {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first numbers: ");
        int a = sc.nextInt();
        System.out.println("Enter second numbers: ");
        int b = sc.nextInt();
        int c;

        c = a + b;
        System.out.println("The sum of two numbers is: "+c);
        System.out.println("The result is "+sumOf(a,b,c));

    }

    public static boolean sumOf(int p, int q, int r) {
        if((p+q)==r || (q+r)==p || (r+p)==q);
        return true;
    }
}
