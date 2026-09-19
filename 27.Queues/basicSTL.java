import java.util.LinkedList;
import java.util.Queue;

public class basicSTL {
    public static void main(String[] args) {
        // Create a Queue of Integer type using LinkedList implementation
        Queue<Integer> q = new LinkedList<>();

        // Add elements to the queue (FIFO - First In First Out)
        q.add(1); // Queue: 1
        q.add(2); // Queue: 1 2
        q.add(3); // Queue: 1 2 3
        q.add(4); // Queue: 1 2 3 4
        q.add(5); // Queue: 1 2 3 4 5

        // Print the entire queue
        System.out.println("Initial Queue: " + q); // Output: [1, 2, 3, 4, 5]

        // Remove the head element (1) using remove()
        q.remove(); // Queue becomes: 2 3 4 5
        System.out.println("After remove(): " + q); // Output: [2, 3, 4, 5]

        // Remove the head element (2) using poll()
        // poll() and remove() both remove the head of the queue
        // poll() returns null if queue is empty, while remove() throws an exception
        q.poll(); // Queue becomes: 3 4 5
        System.out.println("After poll(): " + q); // Output: [3, 4, 5]

        // Peek at the head element without removing it
        System.out.println("Peek element: " + q.peek()); // Output: 3

        // Check if the queue is empty
        System.out.println("Is queue empty? " + q.isEmpty()); // Output: false

        // Get the size of the queue
        System.out.println("Queue size: " + q.size()); // Output: 3

    }
}
