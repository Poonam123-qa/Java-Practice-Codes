package JavaPractice;

import java.util.Scanner;

public class StringToInt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();

        int a=Integer.parseInt(s);
        System.out.println("Enter an integer: "+a);
    }
}
