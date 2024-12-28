package Collections.Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Compare {

    public static void main(String args[]) {

        // Create Student objects
        Students s = new Students(1, "Poonam");
        Students s1 = new Students(2, "Aaryan");
        Students s2 = new Students(4, "Gaikwad");
        Students s3 = new Students(3, "Gaikwad");

        // Add Students to ArrayList
        ArrayList<Students> a = new ArrayList<>();
        a.add(s);
        a.add(s1);
        a.add(s2);
        a.add(s3);

        // Print unsorted list
        System.out.println("Unsorted list: " + a);

        // Sort the list
        Collections.sort(a);

        // Print sorted list
        System.out.println("Sorted list: " + a);
    }
}

class Students implements Comparable<Students> {
    private Integer id;
    private String name;

    Students(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Students o) {
        return Integer.compare(this.id, o.id);
    }
}
