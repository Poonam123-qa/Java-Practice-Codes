package JavaPractice;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int factor = 0;

        for (int i = 1; i <= num; i++) {
            if(num%i==0){
                System.out.println("The factor is: "+factor);
                factor++;
            }
        }
        System.out.println("The factor count is: "+factor);
    }
}
