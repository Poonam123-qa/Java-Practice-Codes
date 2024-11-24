package Methods;

public class CallVariable {
    int i =10;                          //creating non static variable
    public static void callVariable(){

        CallVariable a=new CallVariable();     // creating the instance of the class

        System.out.println("calling the non static variable inside the static method..."+a.i);       //accessing the non-static variable
    }
    public static void main(String args[]){
        callVariable();
    }
}
