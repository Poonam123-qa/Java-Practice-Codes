package Constructor;

public class ConstructChaining {

    //Calling instance variable in the default and parameterized constructor using this keyword is called constructor chaining

    int StudID;
    String StudName;
    String Grade;

    ConstructChaining(){
        this.StudID=0;
        this.StudName="Unknown";
        this.Grade="None";
    }

    ConstructChaining(int ID,String name,String grade){
        this.StudID=ID;
        this.StudName=name;
        this.Grade=grade;
    }

    public static void main(String args[]) {

        ConstructChaining c=new ConstructChaining();                 //calling default constructor
        System.out.println("The Student ID is..."+c.StudID);
        System.out.println("The Student Namr is..."+c.StudName);
        System.out.println("The Student Grade is..."+c.Grade);


        ConstructChaining p=new ConstructChaining(1,"Poonam","A");         //calling parameterized constructor
        System.out.println("The Student ID is..."+p.StudID);
        System.out.println("The Student Namr is..."+p.StudName);
        System.out.println("The Student Grade is..."+p.Grade);


    }

}
