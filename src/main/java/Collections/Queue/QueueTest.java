package Collections.Queue;

import java.util.PriorityQueue;

public class QueueTest {
    public static void main(String args[]) {

        PriorityQueue pq=new PriorityQueue<>();
        pq.offer("10");            //adding value
        pq.offer("9");
        pq.offer("30");
        pq.offer("25");

        System.out.println("The Queue list is...."+pq);
        System.out.println("The peak the value is..."+pq.peek());
        System.out.println("The poll the value is..."+pq.poll());           //removing the value
        System.out.println("The Queue list is...."+pq);


    }
}
