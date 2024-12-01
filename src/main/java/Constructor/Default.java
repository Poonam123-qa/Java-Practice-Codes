package Constructor;

public class Default {
    public String name;
    public int age;

    Default(){
        this.name="Unknown";
        this.age=0;

    }
    public static void main(String args[]){
        Default a=new Default();
        System.out.println("The name is..."+a.name);
        System.out.println("The age is..."+a.age);
    }
}
