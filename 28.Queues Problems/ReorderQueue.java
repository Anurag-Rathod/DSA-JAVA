//Q. Interleave the First Half of the Queue with Second Half (search on GFG) :-  rearrange the queue by interleaving its first half with the second half.
//inpute : Queue => 1 2 3 4 5 6 7 8
//output : Queue => 1 5 2 6 3 7 4 8 
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;
public class ReorderQueue {
    // Approach 1
    // public static Queue<Integer> rearrangeQueue(Queue<Integer> q) {
    //     int n = q.size();
    //     Queue<Integer> first = new LinkedList<>();
    //     Queue<Integer> second = new LinkedList<>();
        
    //     for(int i=1;i<=n;i++){
    //         if(i<=(n/2)) first.add(q.remove());
    //         else second.add(q.remove());
    //     }
    //     while(!first.isEmpty() && !second.isEmpty()){
    //         q.add(first.remove());
    //         q.add(second.remove());
    //     }
    //     return q;
    // }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1); 
        q.add(2);
        q.add(3);
        q.add(4); 
        q.add(5);  
        q.add(6);
        q.add(7); 
        q.add(8); 
        // q => 1 2 3 4 5 6 7 8
        System.out.println("Orignal Queue is : "+ q);

        // Approach 2 by usnig stack
        int n = q.size();
        Stack<Integer> st = new Stack<>();
        for(int i=1;i<=n/2;i++){
            st.push(q.remove()); // q => 5 6 7 8  and st => 4 3 2 1
        }

        while(!st.isEmpty()){
            q.add(st.pop()); // // q => 5 6 7 8 4 3 2 1 and st => empty
        }

        for(int i=1;i<=n/2;i++){
            st.push(q.remove()); // q => 4 3 2 1  and st => 8 7 6 5
        }

        while(!st.isEmpty()){
            q.add(st.pop());
            q.add(q.remove());// q => 8 4 7 3 6 2 5 1 and st => empty
        }

        //now reverse the queue 
        for(int i=1;i<=n;i++){
            st.push(q.remove());// q => empty and st => 8 4 7 3 6 2 5 1
        }
        while(!st.isEmpty()){
            q.add(st.pop());// q = 1 5 2 6 3 7 4 8 
        }

        System.out.println("Reorder Queue is : "+q);
    }
}
