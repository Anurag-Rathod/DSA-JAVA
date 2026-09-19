import java.util.Deque;
import java.util.LinkedList;
public class DequeInJavaCollection {
    public static void main(String[] args) {
        // Create a Deque (double-ended queue) using LinkedList
        Deque<Integer> dq = new LinkedList<>();

        // // Add elements to the end of the deque
        // dq.addLast(2);  // Deque becomes: [1, 2]
        // dq.addLast(1);  // Deque becomes: [1]
        // dq.addLast(3);  // Deque becomes: [1, 2, 3]
        // dq.addLast(4);  // Deque becomes: [1, 2, 3, 4]
        // System.out.println(dq);  // Output: [1, 2, 3, 4]

        // // Add an element at the front of the deque
        // dq.addFirst(5);  // Deque becomes: [5, 1, 2, 3, 4]
        // System.out.println(dq);  // Output: [5, 1, 2, 3, 4]

        // // Remove the first element
        // dq.removeFirst();  // Removes 5 → Deque becomes: [1, 2, 3, 4]

        // // Access the first and last elements without removing them
        // System.out.println(dq.getFirst());  // Output: 1
        // System.out.println(dq.getLast());   // Output: 4

        // // Remove the head of the deque (same as removeFirst)
        // dq.remove();  // Removes 1 → Deque becomes: [2, 3, 4]

        // // Add an element at the end of the deque (same as addLast)
        // dq.add(10);  // Deque becomes: [2, 3, 4, 10]

        
        dq.addLast(1);  // Add 1 to the end
        dq.addLast(2);  // Add 2 to the end
        dq.addLast(1);  // Add another 1 to the end
        dq.addLast(4);  // Add 4 to the end

        // Remove the first occurrence of 1 (removes the 1 at the front)
        dq.removeFirstOccurrence(1);
        System.out.println(dq);  // Output: [2, 1, 4]

        // Remove the last occurrence of 1 (removes the remaining 1)
        dq.removeLastOccurrence(1);
        System.out.println(dq);  // Output: [2, 4]

        
    }
}
