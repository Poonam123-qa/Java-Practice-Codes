package Constructor;

public class Parameterized {

    String name, color;
    Parameterized(String Name, String color){               //passing the value when the obj is created and taking the variable from the class

        this.name=Name;                                     // this keyword indicates that the variable taking form the current class
        this.color=color;
    }
    public static void main(String args[]) {

        Parameterized p=new Parameterized("Dog","Black");
        System.out.println("The name is..."+p.name);
        System.out.println("The color is..."+p.color);

    }

}
