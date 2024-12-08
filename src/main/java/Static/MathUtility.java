package Static;

public class MathUtility {

    static int add(int a,int b){
        int sum;
        sum=a+b;
        return sum;
    }

    public static void main(String args[]){

        // Call the static method add without creating an instance of MathUtility because whenever we write the static keyword in the method area create a some space for static
        //The Method Area is designed to hold class-level data that is shared among all threads, including: Class metadata, Constant pool, Static fields, Method bytecode
        System.out.println("The addition is..."+add(10,5));
    }
}
