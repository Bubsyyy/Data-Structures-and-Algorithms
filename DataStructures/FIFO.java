
import java.util.LinkedList;
import java.util.Queue;

public class FIFO {
    public static void main(String[] args) {

        // Queue = FIFO data structure. First In First Out
        // A collection designed for holding elements prior to processing Linear data structure
        // add = enqueue, offer()
        // remove = dequeue, poll()


        Queue<Integer> queue = new LinkedList<>();

        // enqueue
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        // dequeue
        queue.poll();

        System.out.println(queue);
        System.out.println(queue.contains(3)); // returns true





    }
}
