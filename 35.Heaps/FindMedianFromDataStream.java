import java.util.*;
//Leetcode 295 :- Find Median from Data Stream
/* 
--------------------------------------------------------------------------------
| Approach	                         |    addNum()   |  findMedian()  |	 Space |
|------------------------------------|---------------|----------------|--------|
| ArrayList + sort every time	     |      O(1)	 |   O(n log n)	  |  O(n)  |
|------------------------------------|---------------|----------------|--------|
| Two Heaps (Max Heap + Min Heap)	 |     O(log n)	 |     O(1)	      |  O(n)  |
--------------------------------------------------------------------------------
*/
//brute force approach :- (Approach ArrayList + sort every time)
// class MedianFinder {
//     static ArrayList<Integer> arr;
//     public MedianFinder() {
//         arr = new ArrayList<>();
//     } 
//     public void addNum(int num) {
//         arr.add(num);
//     }
//     public double findMedian() {
//         Collections.sort(arr);
//         int size = arr.size();
//         if(size%2 == 0){
//             double m1 = arr.get(size/2);
//             double m2 = arr.get(size/2 - 1);
//             return (m1+m2)/2;
//         }else{
//             double m1 = arr.get(size/2);
//             return m1;
//         }
//     }
// }

//Approach :- Two Heaps (Max Heap + Min Heap)
class MedianFinder {
    private static PriorityQueue<Integer> small; // left half
    private static PriorityQueue<Integer> large; // right half
    public MedianFinder() {
        small = new PriorityQueue<>(Collections.reverseOrder()); // max heap
        large = new PriorityQueue<>(); // min heap
    }
    
    public void addNum(int num) {
        if(small.isEmpty() || num <= small.peek()){
            small.offer(num);
        }else{
            large.offer(num);
        }
        
        // Balance sizes
        if(small.size() > large.size() + 1){
            large.offer(small.poll());
        }else if(large.size() > small.size()){
            small.offer(large.poll());
        }
    }
    
    public double findMedian() {
        if(small.size() == large.size()){
            int m1 = small.peek();
            int m2 = large.peek();
            return (m1+m2)/2.0;
        }else{
            if(small.size() > large.size()) {
                return small.peek();
            }else{
                return large.peek();
            }
        }
    }
}
public class FindMedianFromDataStream {
    public static void main(String[] args) {
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(1);    // [1]
        medianFinder.addNum(2);    // [1,2]

        System.out.println(medianFinder.findMedian()); // 1.5

        medianFinder.addNum(3);    // [1,2,3]

        System.out.println(medianFinder.findMedian()); // 2.0
    }
}
