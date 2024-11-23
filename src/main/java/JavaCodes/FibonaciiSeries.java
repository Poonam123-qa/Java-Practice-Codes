package JavaCodes;

public class FibonaciiSeries {

    static void fibo(int a) {
        int i = 0;
        int j = 1;
        System.out.print(i + " ");
        System.out.print(j + " ");
        for (j = 1; j <= a; j++) {
            int k = i + j;
            i = j;
            j = k;
            System.out.print(j + " ");
            j=j-1;
        }
    }

    public static void main(String []args){
        int n =50;
        fibo(n);
        }

}
