package JavaPractice;

import java.util.Scanner;

public class Problem01 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first number: ");
            int num1 = sc.nextInt();
            System.out.println("Enter the second number: ");
            int num2 = sc.nextInt();
            System.out.println("Enter the third number: ");
            int num3 = sc.nextInt();

            System.out.println("The result is: "+test(num1, num2, num3));
        }

        public static boolean test(int a, int b, int c) {
            if(a<b)
                return true;
            if (a<b && c>b)
                return true;
            return true;
        }
}
