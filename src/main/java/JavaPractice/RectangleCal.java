package JavaPractice;

import java.util.Scanner;

public class RectangleCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle");
        double length = sc.nextDouble();

        System.out.println("Enter the width of the rectangle");
        double width = sc.nextDouble();

        double area = length * width;
        double perimeter = 2 * length * width;

        System.out.println("The area of the rectangle is " + area);
        System.out.println("The perimeter of the rectangle is " + perimeter);
    }
}

