
import java.util.Queue;
import java.util.PriorityQueue;

public class queues {
    public static void main(String[] args) {
        // Create a queue
        PriorityQueue<Integer> queue =  new PriorityQueue<>();

        // Add elements to the queue
        queue.add(10);
        queue.add(20);
        queue.add(30);

        // Print the queue
        System.out.println("Queue: " + queue);
    }
}