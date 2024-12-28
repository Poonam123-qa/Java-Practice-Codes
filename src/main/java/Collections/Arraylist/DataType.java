package Collections.Arraylist;

import java.util.ArrayList;
import java.util.List;

public class DataType {
    public static void main(String args[]){
        List<Integer> i=new ArrayList();                     //if we assign the data type in < > in this the value will be accept according to the data type
        i.add(90);
        System.out.println("The integer value is ...."+i);
       // i.add("Poonam");                  not accepting because strictly mentioned integer

        List<String> s=new ArrayList();
        s.add("Poonam");
        System.out.println("The String value is ...."+s);

        List<Boolean> b=new ArrayList();
        b.add(true);
        System.out.println("The String value is ...."+b);

    }
}
