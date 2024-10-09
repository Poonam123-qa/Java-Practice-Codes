package JavaPractice;

import java.util.Scanner;

public class SwapNumb {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.println("The First numbers is :" + num1+" "+num2);
        num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1-num2;

        System.out.println("The Swapping of the numbers is:"+num1+" "+num2);

    }
}
