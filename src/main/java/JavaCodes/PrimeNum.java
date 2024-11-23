package JavaCodes;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        for (int i=2;i<=a;i++){
            if(i%2==1){
                System.out.println("The number is Prime...."+i);
            }
            else{
                System.out.println("The number is Not Prime...."+i);
            }
        }
    }
}
