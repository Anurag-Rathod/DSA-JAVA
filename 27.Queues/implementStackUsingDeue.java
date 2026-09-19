import java.util.Deque;
import java.util.LinkedList;

public class implementStackUsingDeue {
    public static class Queue {
        static Deque<Integer> dq = new LinkedList<>();

        void push(int x){
            dq.addLast(x);
        }
        int pop(){
            return dq.removeLast();
        }
        int peek(){
            return dq.getLast();
        }
        
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.push(1);// q = 1
        q.push(2);// q = 1 2
        q.push(3);// q = 1 2 3
        q.push(4);// q = 1 2 3 4
        q.push(5);// q = 1 2 3 4 5
        q.push(6);// q = 1 2 3 4 5 6

        q.pop();// 6

        System.out.println(q.peek());// 5
    }
}
