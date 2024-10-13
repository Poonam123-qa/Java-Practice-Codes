package JavaPractice;

import java.util.Scanner;

public class DivisibleBy {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        for (int i = 1; i < num; i++) {
            if (i % 3 == 0)
                System.out.println("The number is divisible by 3: " +i);
        }

        for (int i = 1; i <= num; i++) {
            if (i % 5 == 0) {

                System.out.println("The number is divisible by 5: " + i);
            }
        }
        for (int i = 1; i <= num; i++){

            if (i%3==0 && i%5==0 ) {

                System.out.println("The number is divisible by 3 and 5: " + i);
            }

        }
    }
}
