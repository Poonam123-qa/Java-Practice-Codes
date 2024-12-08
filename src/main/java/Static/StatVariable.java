package Static;

public class StatVariable {

    static int count =0;

    StatVariable(){
        count++;
    }

    //Static variables only called in static method
    static int getCount(){
        return count;
    }

    public static void main(String args[]){

        StatVariable a=new StatVariable();
        System.out.println("The first time called constructor..."+getCount());

        StatVariable a1=new StatVariable();
        System.out.println("The second time called constructor..."+getCount());

        StatVariable a2=new StatVariable();
        System.out.println("The second time called constructor..."+getCount());

    }
}
