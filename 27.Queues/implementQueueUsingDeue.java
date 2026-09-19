import java.util.Deque;
import java.util.LinkedList;
public class implementQueueUsingDeue {
    public static class Queue {
        static Deque<Integer> dq = new LinkedList<>();

        void push(int x){
            dq.addLast(x);
        }
        int pop(){
            return dq.removeFirst();
        }
        int peek(){
            return dq.getFirst();
        }
        
    }
    public static void main(String[] args) {
        
    }
}
