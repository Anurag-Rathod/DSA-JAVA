//Leetcode 632 :- Smallest Range Covering Elements from K Lists
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class SmallestRangeCoveringElementsFromKLists {
    public static class Triplet implements Comparable<Triplet>{
        int ele;
        int row;
        int col;
        Triplet(int ele, int row, int col){
            this.ele = ele;
            this.row = row;
            this.col = col;
        }
        public int compareTo(Triplet t){
            return this.ele - t.ele;
        }
    }
    public static int[] smallestRange(List<List<Integer>> nums) {
        int k = nums.size();
        PriorityQueue<Triplet> pq = new PriorityQueue<>(); // minHeap
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<k;i++){
            max = Math.max(max,nums.get(i).get(0));
            min = Math.min(min,nums.get(i).get(0));
            pq.add(new Triplet(nums.get(i).get(0),i,0));
        }
        int a = min, b = max; //[a,b] is the range

        while(true){
            Triplet top = pq.remove();
            int ele = top.ele, row = top.row, col = top.col;
            if(max-ele < b-a){
                a = ele;
                b = max;
            }

            if(col == nums.get(row).size()-1) break;
            int next = nums.get(row).get(col+1);
            max = Math.max(max,next);
            pq.add(new Triplet(next,row,col+1));
        }
        
        return new int[]{a,b};
    }
    public static void main(String[] args) {
        List<List<Integer>> nums = new ArrayList<>();
        nums.add(Arrays.asList(4,10,15,24,26));
        nums.add(Arrays.asList(0,9,12,20));
        nums.add(Arrays.asList(5,18,22,30));
        
        int[] res = smallestRange(nums);
        System.out.println("["+res[0]+","+res[1]+"]");
    }
}
