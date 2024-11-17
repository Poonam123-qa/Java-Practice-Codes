package JavaPractice;

public class Operators {
    public static void main(String args[]) {
        int i = 10;             // i is initialized to 10.
        int j = ++i;            // i is incremented first (++i), then j gets the value of i, so j = 11, and i = 11.
        int k = j--;            // k gets the value of j (k = 11), then j is decremented (j = 10).
        i++;                    // i is incremented (i = 12).
        --j;                    // j is decremented (--j), so j = 9.
        k++;                    // k is incremented (k = 12).
        j = ++i;                // i is incremented first (++i), then j gets the new value of i, so i = 13 and j = 13.

        System.out.println("Increment i.." + (i++));   // i is printed first (13), then incremented after.
        System.out.println("Decrement j.." + (--j));   // j is decremented first (13 -> 12), then printed.
        System.out.println("print k.." + (--k));       // k is decremented first (12 -> 11), then printed.
        System.out.println("Print i.." + i);           // i is printed after the increment (14).
        System.out.println("Print j.." + j);           // j is printed after the decrement (12).
        System.out.println("Print k.." + k);           // k is printed after the decrement (11).
    }


}
