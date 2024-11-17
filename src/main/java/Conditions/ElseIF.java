package Conditions;
import java.util.Scanner;

public class ElseIF {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int per= sc.nextInt();

        if (per < 0 || per > 100) {
            System.out.println("Invalid Percentage....");
        }
        // Now check ranges for different classes
        else if (per >= 80) {
            System.out.println("Student is first class....");
        } else if (per >= 60) {
            System.out.println("Student is second class....");
        } else if (per >= 40) {
            System.out.println("Student is failed....");
        } else {
            System.out.println("Invalid Percentage....");  // Covers the case where the percentage is negative
        }
    }
}
