import java.util.*;
public class kthSmallestNumber {
    public static int kthSmallest(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int elm : arr){
            pq.add(elm);
            if(pq.size() > k) pq.remove();
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        int[] arr = {10, 5, 4, 3, 48, 6, 2, 33, 53, 10};
        int k = 4;
        System.out.println(kthSmallest(arr,k));//5

        int[] arr2 = {7, 10, 4, 3, 20, 15};
        int k2 = 3;
        System.out.println(kthSmallest(arr2,k2));//7
    }
}
