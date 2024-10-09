package JavaPractice;

import java.util.Scanner;

public class ComputeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("The sum of the digits is: " + sumDigits(num1));
    }

        public static int sumDigits(long num1) {

            int sum = 0;
            while (num1 > 0) {
                sum += num1 % 10;
                num1 /= 10;
            }
            return sum;
        }
    }
