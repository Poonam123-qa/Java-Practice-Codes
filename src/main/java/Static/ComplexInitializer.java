package Static;

public class ComplexInitializer {

    static int x;
    static int y;
    static int z;

    static {
        x = 10;
        System.out.println("Print the x value..."+x);

        y = 5;
        System.out.println("Print the y value..."+y);

        z = calculate(x, y);
        System.out.println("Print the z value..."+z);

    }

    public static int calculate(int a, int b) {

        return a * b + (a - b);

    }

    public static void main(String[] args) {
        System.out.println("Value of x: " + x);
        System.out.println("Value of y: " + y);
        System.out.println("Value of z: " + z);
    }
}