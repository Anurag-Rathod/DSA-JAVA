import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;
public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1); 
        q.add(2); 
        q.add(3); 
        q.add(4); 
        q.add(5);
        System.out.println("original queue is : "+q);

        Stack<Integer> st = new Stack<>();
        while(!q.isEmpty()){
            st.push(q.remove());
        }
        while(!st.isEmpty()){
            q.add(st.pop());
        }
        System.out.println("reverse queue is : "+q);
    }
}
