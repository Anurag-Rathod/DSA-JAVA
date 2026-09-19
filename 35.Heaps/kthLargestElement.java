import java.util.PriorityQueue;
public class kthLargestElement {
    public static int kthLargest(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int elm : arr){
            pq.add(elm);
            if(pq.size() > k) pq.remove();
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 2, 9};
        int k = 3;
        System.out.println(kthLargest(arr,k));//4

        int[] arr2 = {4, 3, 7, 6, 5};
        int k2 = 5;
        System.out.println(kthLargest(arr2,k2));//3
    }
}
