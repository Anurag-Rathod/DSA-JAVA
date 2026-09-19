import java.util.HashMap;
import java.util.PriorityQueue;
class  Pair implements Comparable<Pair>{
    int num;
    int freq;
    Pair(int num, int freq){
        this.num = num;
        this.freq = freq;
    }
    public int compareTo(Pair p){
        return this.freq - p.freq;
    }
}
public class TopKFrequentElements {
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int key : map.keySet()){
            pq.add(new Pair(key, map.get(key)));
            if(pq.size() > k){
                pq.poll();
            }
        }
        int[] res = new int[k];
        int i = 0;
        while(!pq.isEmpty()){
            res[i++] = pq.poll().num;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums1 = {1,1,1,2,2,3};
        int k1 = 2;
        int[] res1 = topKFrequent(nums1,k1); // [1,2]
        for(int num : res1){
            System.out.print(num+" ");
        }
        System.out.println();

        int[] nums2 = {1,2,1,2,1,2,3,1,3,2};
        int k2 = 2;
        int[] res2 = topKFrequent(nums2,k2); // [1,2]
        for(int num : res2){
            System.out.print(num+" ");
        }
    }
}
