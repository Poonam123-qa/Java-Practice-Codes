package JavaCodes;

import java.util.Scanner;

public class PalindromNum {

    public static int palindrom(int n){
        int result =0;
        while (n>0){
            result = result * 10 + n % 10;
            n = n / 10;
        }
        return result;
    }
    public static void main(String args[]){
        int n=574657;

        int reverse =palindrom(n);
        System.out.println("Reverse of n = " + reverse);
        if (n==reverse){
            System.out.println("Palindrome = Yes");
        }
        else {
            System.out.println("Palindrome = No");
        }
    }
}
