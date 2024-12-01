package Constructor;

public class Parameterized {

    String name, color;
    Parameterized(String Name, String color){

        this.name=Name;
        this.color=color;
    }
    public static void main(String args[]) {

        Parameterized p=new Parameterized("Dog","Black");
        System.out.println("The name is..."+p.name);
        System.out.println("The color is..."+p.color);

    }

}
