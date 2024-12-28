package Collections.HashSet;

import java.io.FileOutputStream;
import java.util.*;


public class HashTest {

    public static void main(String args[]){

        HashSet hashSet=new HashSet();               //hashing mechanism to store the element, no order it will be printing the randomly order
        hashSet.add("Apple");
        hashSet.add("Orange");
        hashSet.add("Watermelon");
        hashSet.add("watermelon");                   //case-sensitive accepting
        hashSet.add("Watermelon");                   //duplicate records not accepting garbage collections deleting this
        hashSet.add("Pear");
        hashSet.add(null);                           //it will not printing anything

        System.out.println("The hash set list is...."+hashSet);
        System.out.println("The hash set list is empty or not...."+hashSet.isEmpty());
        System.out.println("The hash set list is contains...."+hashSet.contains("Orange"));
        System.out.println("The hash set list size is...."+hashSet.size());
        System.out.println("The hash set list remove is...."+hashSet.remove("watermelon")+"  And the list is..."+hashSet);



        System.out.println("-----------------------------------------------------------------------------------");


        Set lhs=new LinkedHashSet();                //hashing mechanism to store the element, order maintain it will be printing given order
        lhs.add("Apple");
        lhs.add("Orange");
        lhs.add("Watermelon");
        lhs.add("Pear");
        lhs.add("pear");                           //case-sensitive accepting
        lhs.add("Pear");                          //duplicate records not accepting garbage collections deleting this
        lhs.add(null);                             //it will be printing null value
        System.out.println("The link hash set list is...."+lhs);
        System.out.println("The link hash set list is empty or not...."+lhs.isEmpty());
        System.out.println("The link hash set list is contains...."+lhs.contains("Apple"));
        System.out.println("The link hash set list size is...."+lhs.size());
        System.out.println("The link hash set list remove is...."+lhs.remove("pear")+"  And the list is..."+lhs);

        System.out.println("-----------------------------------------------------------------------------------");

        Set tree=new TreeSet();                //Black and red tree mechanism to store the element, order maintain it will be printing first letter order
        tree.add("Apple");
        tree.add("Orange");
        tree.add("Watermelon");
        tree.add("Pear");
        tree.add("pear");                           //case-sensitive accepting
        tree.add("Pear");                           //duplicate records not accepting garbage collections deleting this
       // lhs.add(null);                             //it will be given exception null pointer
        System.out.println("The tree set list is...."+tree);

        for(Object s: tree){
            System.out.println("The tree list is in for loop..."+s);
        }

        Iterator it=tree.iterator();
        while (it.hasNext()){
            System.out.println("The Iterator tree value is...."+it.next());
        }
    }

}
