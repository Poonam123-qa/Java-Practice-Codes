package Collections.Arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestColl {
    public static void main(String args[]){
        List Mylist=new ArrayList();
        Mylist.add("Poonam");
        Mylist.add("Aaryan");
        Mylist.add("Gaikwad");
        Mylist.add("Nirmala");

        System.out.println(Mylist);

        Mylist.add("Milind");
        System.out.println(Mylist);

        Mylist.add(12345);
        System.out.println(Mylist);

        Mylist.contains("Poonam");
        System.out.println("Contains function...."+Mylist);

        //Mylist.set(6, "Anki");
        //System.out.println("Set value..."+Mylist);                    //at the index 1 replacing this value

        System.out.println("Checking empty..."+Mylist.isEmpty());

        System.out.println("-----------------------------------------------------------------------------------------");

        for (int i=0;i<Mylist.size();i++){
            System.out.println(Mylist.get(i));

            Iterator<String> its=Mylist.iterator();
            while (its.hasNext()){
                try {
                    System.out.println("The iterator string is...."+its.next());
                } catch (Exception e) {
                    System.out.println("The exeception occurs for iterations...");
                }
            }
        }
    }
}
