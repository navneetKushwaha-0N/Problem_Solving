
import java.util.Queue;
import java.util.PriorityQueue;

public class queues {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue =  new PriorityQueue<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        System.out.println("Queue: " + queue);
    }
}