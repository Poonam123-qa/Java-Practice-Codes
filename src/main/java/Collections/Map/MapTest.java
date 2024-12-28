package Collections.Map;

import java.util.*;

public class MapTest {
    public static void main(String args[]) {

        Map m1 = new HashMap();
        m1.put("Name", "Poonam");                          // Map is the key value pair  storing randomly because hash map
        m1.put("Roll no", "1");
        m1.put("Address", "Mumbai");

        System.out.println("The Hash Map list is..." + m1);
        System.out.println("The Hash Map list size is..." + m1.size());
        System.out.println("The Hash Map list key is..." + m1.keySet());
        System.out.println("The Hash Map list value is..." + m1.values());


        System.out.println("----------------------LinkedHashset------------------------------------");

        Map m2 = new LinkedHashMap();
        m2.put("Name", "Poonam");                          // Map is the key value pair  storing given order because link hash map
        m2.put("Roll no", "1");
        m2.put("Address", "Mumbai");

        System.out.println("The link hash Map list is..." + m2);
        System.out.println("The link Hash Map list size is..." + m2.size());
        System.out.println("The link Hash Map list key is..." + m2.keySet());
        System.out.println("The link Hash Map list value is..." + m2.values());

        System.out.println("--------------------------Tree --------------------------------");


        Map m3 = new TreeMap();
        // Map m3=new WeakHashMap();                      //it is same as tree
        m3.put("Name", "Poonam");                          // Map is the key value pair  storing first letter because tree hash map
        m3.put("Roll no", "1");
        m3.put("Address", "Mumbai");

        System.out.println("The Tree hash Map list is..." + m3);
        System.out.println("The tree Hash Map list size is..." + m3.size());
        System.out.println("The tree Hash Map list key is..." + m3.keySet());
        System.out.println("The tree Hash Map list value is..." + m3.values());

        System.out.println("-----------------------Iterator-----------------------------------");


    }
}
