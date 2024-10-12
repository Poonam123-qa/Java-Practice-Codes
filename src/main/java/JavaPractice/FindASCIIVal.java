package JavaPractice;

import java.util.Scanner;

public class FindASCIIVal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();

        if (s.length()==1){
            char ch = s.charAt(0);
            int ascii = (int) ch;
            System.out.println("The ASCII value of is:" + ascii);
        }
        else {
            System.out.println("Invalid String");
        }

    }
}
