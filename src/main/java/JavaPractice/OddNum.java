package JavaPractice;

import java.util.Scanner;

public class OddNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++){
            if (i%2!=0){
                System.out.println("The odd number is:"+i);
            }
            else{
                System.out.println("The even number is:"+i);
            }
        }
    }
}
