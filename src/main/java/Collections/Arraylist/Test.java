package Collections.Arraylist;

import java.util.ArrayList;

public class Test {

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


class Student{
    private Integer id;
    private String name;

    Student(Integer id,String name){
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

}