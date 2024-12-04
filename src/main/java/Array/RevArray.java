package Array;

import java.util.Arrays;

public class RevArray {

    public static void main(String args[]){

        int a[]={10, 20, 40, 50, 60};

        for (int i=0;i<a.length/2;i++){
            int temp=a[i];
            a[i]=a[a.length-i-1];
            a[a.length-i-1]=temp;
        }
        System.out.println("The reverse array is ...."+ Arrays.toString(a));
    }
}
