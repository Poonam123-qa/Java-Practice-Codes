package JavaPractice;

import java.util.Scanner;

public class ReverseString {
    public static void main (String[] args) {

       /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        String nstr="";
        char ch;

        System.out.println("Original word: "+s);

        for (int i=0; i<s.length(); i++)
        {
            ch= s.charAt(i); //extracts each character
            nstr= ch+nstr; //adds each character in front of the existing string
            System.out.println("Reversed word: "+ nstr);
        }
        System.out.println("Reversed word: "+ nstr);*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();

        for (int i = s.length()-1; i >= 0; i--) {
            System.out.print(s.charAt(i) + " ");
        }

    }
}
