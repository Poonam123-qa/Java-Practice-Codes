package Array;

public class Star {
    public static void main(String args[]) {
       int n=5;
       int a[][]=new int[n][n];
       for(int i=0;i<a.length;i++){
            for(int j=0;j<i;j++){
                System.out.print(" * ");
            }
           System.out.println(" ");

       }
    }
}
