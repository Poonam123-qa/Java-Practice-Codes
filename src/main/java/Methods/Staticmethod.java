package Methods;

public class Staticmethod {

    Staticmethod() {
        System.out.println("Constructor executed.");   //Constructor will be called at time of object creations
    }
    static {
        System.out.println("Static block 1");         // Static anonymous block always executes first before the main method execution and only once it will be executed
    }
    {
        System.out.println("Annonymus block");         //Anonymous block always execute at last after all the execution
    }

    static void test(){
        System.out.println("Non static method");        //if the method is non-static then need to create object for calling the method

    }
    static void text(){
        System.out.println("Static block 2");           //if the method is static then no need to create object for calling method
    }

    public static void main(String args[]){
        System.out.println("Main Method");
        Staticmethod st=new Staticmethod();
        st.test();
        text();
    }

    static {
        System.out.println("Static block 3");
    }
}
