package JavaPractice;

import java.util.Scanner;

public class LastWordFind {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String word = sc.nextLine();
        String[] words = word.trim().split("\\s+"); // Split by whitespace

        if (words.length <2 ){
            System.out.println("Not enough words...");
        }
        else{
            System.out.println(words[words.length-2]);
        }
    }
}
