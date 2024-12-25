package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BasicSorting {
    public static void main(String args[]){

        List marks=new ArrayList();
        marks.add(91);
        marks.add(56);
        marks.add(78);
        marks.add(98);
        marks.add(100);

        System.out.println("The marks is...."+marks);
        Collections.sort(marks);
        System.out.println("The sorted marks is...."+marks);

        System.out.println("The max marks is...."+Collections.max(marks));

        System.out.println("The min marks is...."+Collections.min(marks));

    }
}
