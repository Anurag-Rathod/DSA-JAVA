import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;
public class ReverseFirstKelementsOfAQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1); 
        q.add(2); 
        q.add(3); 
        q.add(4); 
        q.add(5);
        System.out.println("original queue is : "+q);
        int k = 3; //reversing the first 3 elements of queue

        int n = q.size();
        // Step 1: Push the first k elements into the stack
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<k;i++){
            st.push(q.remove());
        }
        // Step 2: Enqueue the reversed elements back into the queue
        while(!st.isEmpty()){
            q.add(st.pop());
        }
        // Step 3: Move the remaining elements to the back of the queue
        for(int i=0;i<n-k;i++){
            q.add(q.remove());
        }

        System.out.println("updated queue is : "+q);
    }
}
