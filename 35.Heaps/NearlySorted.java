import java.util.*;
public class NearlySorted {
    public static void nearlySorted(int[] arr, int k) {
        int n = arr.length;
        // Creating a min heap
        PriorityQueue<Integer> pq =  new PriorityQueue<>();

        // Pushing first k elements in pq
        for (int i = 0; i < k; i++)  pq.add(arr[i]);

        int i = k;
        for (; i < n; i++) {
            pq.add(arr[i]);

            // Size becomes k+1 so pop it
            // and add minimum element in (i-k) index
            arr[i - k] = pq.poll();
        }

        // Putting remaining elements in array
        while (!pq.isEmpty()) {
            arr[i - k] = pq.poll();
            i++;
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 1, 4};
        int k1 = 2;
        nearlySorted(arr1,k1);//{1, 2, 3, 4}
        // for(int elm : arr1){
        //     System.out.print(elm+" ");
        // }
        
        int[] arr2 = {2, 3, 1, 4};
        int k2 = 2;
        nearlySorted(arr2,k2);//{7, 9, 14}
        for(int elm : arr2){
            System.out.print(elm+" ");
        }
    }
}
