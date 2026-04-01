import java.util.Queue;
import java.util.LinkedList;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        System.out.println("First element: " + queue.peek());

        System.out.println("Dequeued element: " + queue.poll());
        System.out.println("Dequeued element: " + queue.poll());

        System.out.println("Current queue size: " + queue.size());

        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}