package Collections.Stack;

import java.util.Stack;

public class StackEx extends Object{

    public static void main(String args[]){

        Stack s=new Stack();

        s.push("Poonam");
        s.push(12345);
        s.push("Gaikwad");
        s.push("Nirmala");
        s.push("Aaryan");
        s.add("Test");

        System.out.println("The stack is...."+s);

        System.out.println("The peeking the element...."+s.peek());                     //peak the last one

        System.out.println("The pop the element...."+s.pop());                     //pop the last element

    }
}
