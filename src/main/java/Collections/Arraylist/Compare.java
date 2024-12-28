package Collections.Arraylist;

import java.util.ArrayList;

public class Compare {

    public static void main(String args[]){

        Student s=new Student(1,"Poonam");
        Student s1=new Student(2,"Aaryan");
        Student s2=new Student(3,"Gaikwad");

        ArrayList a=new ArrayList();
        a.add(s);
        a.add(s1);
        a.add(s2);
        System.out.println("The list is..."+a);                         //address is getting printed to over come this create tostring method


    }
}


class Students implements Comparable{
    private Integer id;
    private String name;

    Students (Integer id,String name){
        this.id=id;
        this.name=name;
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
    public int compareTo(Object o) {                         //if the multiple value are their to compare then we can use the comparable implements and compare to method
        return 0;
    }
}