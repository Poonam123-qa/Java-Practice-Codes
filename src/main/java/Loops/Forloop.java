package Loops;

import java.util.Scanner;

public class Forloop {
    public static void main(String []args){
       Scanner sc = new Scanner(System.in);
     int i = sc.nextInt();

        for (int j=i;i<=10;i++){
            System.out.println("Print the value of i..."+i);
        }

        /*for (; ; ){    //infite loops
            System.out.println("Invalid...");
        }*/
    }

}
