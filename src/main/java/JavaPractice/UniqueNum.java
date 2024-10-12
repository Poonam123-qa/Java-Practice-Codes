package JavaPractice;

import java.util.Scanner;

public class UniqueNum {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Enter a number: ");
        //int num = sc.nextInt();

        int num = 0;
        // Iterate through three nested loops to generate all unique three-digit numbers

        for(int i=1;i<=3;i++){
            for(int j=1;j<=3;j++){
                for(int k=1;k<=3;k++){

                    if(k!=j && k!=i && i!=j){                                   // Check if 'i,' 'j,' and 'k' are all different (not equal)
                        num++;
                        System.out.println(i + "" + j + "" + k);    // Print the generated three-digit number
                    }
                }
            }
        }

    }
}
