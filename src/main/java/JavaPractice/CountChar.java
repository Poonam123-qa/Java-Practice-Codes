package JavaPractice;

import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        int count=0, count1 = 0, count2=0, count3=0;
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c==' '){

                count++;
            }
            else if (c>='a'&& c<='z'||c>='A'&& c<='Z') {
                count1++;
            }
            else if(c>='0'&&c<='9'){
                count2++;
            }
        }
        System.out.println("The space count is:"+count);
        System.out.println("The characters count is:"+count1);
        System.out.println("The numbers count is:"+count2);
        //System.out.println("The special characters is:"+count3);

    }
}
