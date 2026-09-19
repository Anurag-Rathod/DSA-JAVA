/****************************************************************************************
*                         PRIORITY QUEUE IN JAVA
*
* PriorityQueue is a Java class that implements a Heap data structure.
*
* Heap: A special Binary Tree which follows a rule:
* -----
* Min Heap:
* Parent <= Children
* Smallest element is always at root.
*
* Max Heap:
* Parent >= Children
* Largest element is always at root.
*
* Java PriorityQueue:
* -------------------
* Default PriorityQueue = Min Heap
* It stores elements according to priority, not insertion order.

****************************************************************************************/
import java.util.*;
public class PriorityQueueSTL {
    public static void main(String[] args) {
        /****************************************************************
        * 1. Creating a PriorityQueue
        ****************************************************************/
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        /*
        By default: PriorityQueue<Integer> works as Min Heap.
        Smallest element will always be on top.
        */

        /****************************************************************
        * 2. Adding Elements
        ****************************************************************/
        pq.add(10);
        pq.add(5);
        pq.add(20);
        pq.add(2);
        /*
        Internal Heap:

              2
             / \
            5   20
           /
          10

        Top element = 2
        */

        /****************************************************************
        * 3. Peek()
        ****************************************************************/
        System.out.println(pq.peek());
        /*
        peek() returns top element.
        Does NOT remove element.
        Time Complexity:O(1)
        */

        /****************************************************************
        * 4. Poll()
        ****************************************************************/
        System.out.println(pq.poll());
        /*
        poll() returns and removes top element.
        Here: 2 will be removed.
        Time Complexity:O(log n)
        */


        /****************************************************************
        * 5. Remove Specific Element
        ****************************************************************/
        pq.remove(10);
        /*
        Removes 10 if present.
        Time Complexity:O(n)
        */

        /****************************************************************
        * 6. Size
        ****************************************************************/
        System.out.println(pq.size());


        /****************************************************************
        * 7. Check Empty
        ****************************************************************/
        System.out.println(pq.isEmpty());


        /****************************************************************
        * 8. Traversing PriorityQueue
        ****************************************************************/
        for(int x : pq){
            System.out.println(x);
        }
        /*
        IMPORTANT:
        Traversal does NOT print sorted order.
        PriorityQueue only guarantees that
        the TOP element has highest priority.
        Example:
        Elements: 5 2 10 1
        Printing queue may give:
        1 2 10 5
        or different order.
        If sorted output needed:
        remove using poll().
        */


        /****************************************************************
        * 9. Max Heap Creation
        ****************************************************************/
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.add(10);
        maxHeap.add(5);
        maxHeap.add(20);
        maxHeap.add(2);
        System.out.println(maxHeap.peek());//20
        /*
        Now:
        Parent >= Children
        Largest element is on top.
        */


        /****************************************************************
        * 10. PriorityQueue with String
        ****************************************************************/
        PriorityQueue<String> names = new PriorityQueue<>();
        names.add("Rahul");
        names.add("Aman");
        names.add("Zoya");
        System.out.println(names.poll());//Aman
        /*
        Strings are ordered alphabetically.
        */


        /****************************************************************
        * 11. Custom Comparator
        ****************************************************************/
        PriorityQueue<Integer> pq2 = new PriorityQueue<>((a,b) -> b-a);
        pq2.add(10);
        pq2.add(30);
        pq2.add(20);
        System.out.println(pq2.poll());//30
        /*
        Lambda Comparator: (a,b)->b-a
        means: Bigger number gets higher priority.
        Creates Max Heap.
        */
    }
}
