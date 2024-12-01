package Constructor;

public class Overloading {

    // Constructor overloading means the same name but different parameters
    int i;
    String name;
    Overloading(){
        this.i=0;
        this.name="None";
        System.out.println("This is the Default constructor...");
    }

    Overloading(int i){
        this.i=i;
        System.out.println("This is the integer constructor...");
    }

    Overloading(String name){
        this.name=name;
        System.out.println("This is the string constructor....");
    }
    public static void main(String args[]) {

        Overloading o=new Overloading();
        Overloading p=new Overloading(20);
        Overloading s=new Overloading("Poonam");

        System.out.println("The default.."+o.i);
        System.out.println("The default.."+o.name);

        System.out.println("The integers value is..."+p.i);

        System.out.println("The string value is..."+s.name);


    }
}