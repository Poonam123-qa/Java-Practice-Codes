package Array;

public class Stringops {

    public static void main(String args[]){
        StringBuffer sb=new StringBuffer("Poonam");         //it performs one by one operation
        sb.append("Gaikwad");
        System.out.println("The string buffer is "+sb);

        StringBuilder sc=new StringBuilder("Aryan");       // it performs simultaneously operations
        sc.append("Gaikwad");
        System.out.println("The string builder is "+sc);

    }
}
