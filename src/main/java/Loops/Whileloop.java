package Loops;

import java.util.Scanner;

public class Whileloop {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        while (i<=10){
            System.out.println("print the  value of i..."+i);
            i++;
        }
    }
}
