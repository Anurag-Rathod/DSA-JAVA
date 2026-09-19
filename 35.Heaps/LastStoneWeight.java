//Leetcode 1046
import java.util.Collections;
import java.util.PriorityQueue;
public class LastStoneWeight {
    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone : stones){
            pq.add(stone);
        }
        while(pq.size()>1){
            int max1 = pq.poll();    
            int max2 = pq.poll();
            if(max1 != max2){
                pq.add(max1-max2);
            }
        }
        return pq.size() == 0 ? 0 : pq.poll();
    }
    public static void main(String[] args) {
        int[] stones1 = {2,7,4,1,8,1};
        System.out.println(lastStoneWeight(stones1)); // 1
        int[] stones2 = {2,2};
        System.out.println(lastStoneWeight(stones2)); // 0
        int[] stones3 = {9};
        System.out.println(lastStoneWeight(stones3)); // 9
    }
}
