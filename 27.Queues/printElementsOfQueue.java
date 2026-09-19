import java.util.Queue;
import java.util.LinkedList;
public class printElementsOfQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1); 
        q.add(2);
        q.add(3);
        q.add(4); 
        q.add(5);   

        Queue<Integer> temp = new LinkedList<>();

        while (!q.isEmpty()) {
            int x = q.remove();
            System.out.print(x+" ");
            temp.add(x);
        }
        while (!temp.isEmpty()) {
            int x = temp.remove();
            q.add(x);
        }
    }
}
