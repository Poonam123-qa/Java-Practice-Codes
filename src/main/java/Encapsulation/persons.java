package Encapsulation;
//Write a Java program to create a class called Person with private instance variables name, age. and country.
// Provide public getter and setter methods to access and modify these variables.

public class persons {
    private String name;
    private int age;
    private  String country;

    public String getName() {
        return name;
    }

    public void setname(String nm){
        this.name=nm;
    }

    public int getage() {
        return age;
    }

    public void setAge(int ag){
        this.age=ag;
    }

    public String getcountry() {
        return country;
    }

    public void setCountry(String ct){
        this.country=ct;
    }

}

class Main{
public static void main(String[] args) {
    persons p=new persons();
    System.out.println("Before setting the name..."+p.getName());

    p.setname("Poonam");
    System.out.println("After setting the name..."+p.getName());

    System.out.println("Before setting the age..."+p.getage());

    p.setAge(27);
    System.out.println("After setting the age..."+p.getage());

    System.out.println("Before setting the country..."+p.getcountry());

    p.setCountry("India");
    System.out.println("After setting the age..."+p.getcountry());
    }
}