import java.util.Arrays;

class Heap{
    private int[] arr;
    private int idx;
    Heap(int capacity){
        arr = new int[capacity+1];
        idx = 1;
        Arrays.fill(arr, Integer.MAX_VALUE);
    }
    int peek(){
        if(size() == 1){
            System.out.println("Heap is Empty!");
            return -1;
        }
        return arr[1];
    }
    void add(int num){
        if(idx == arr.length){
            System.out.println("Heap is full!");
            return;
        }
        arr[idx++] = num;
        int currentRootIdx = idx-1;
        while(currentRootIdx > 1){
            int parentRootIdx = currentRootIdx/2;
            if(arr[currentRootIdx] < arr[parentRootIdx]){
                int temp = arr[currentRootIdx];
                arr[currentRootIdx] = arr[parentRootIdx];
                arr[parentRootIdx] = temp;
                currentRootIdx = parentRootIdx;
            }else{
                break;
            }
        }
    }
    int remove(){
        if(size() == 1){
            System.out.println("Heap is Empty!");
            return -1;
        }
        int min = arr[1];
        arr[1] = arr[idx-1];
        idx--;

        //Rearrangement
        int root = 1;
        while(root <= size()){
            int left = root*2, right = root*2+1;
            int leftVal = root<=size() ? arr[left] : Integer.MAX_VALUE;
            int rightVal = root<=size() ? arr[right] : Integer.MAX_VALUE;
            if(arr[root]<leftVal && arr[root]<rightVal){
                break;
            }else{
                if(arr[left] < arr[root]){
                    int temp = arr[root];
                    arr[root] = arr[left];
                    arr[left] = temp;
                    root = left;
                }else{
                    int temp = arr[root];
                    arr[root] = arr[right];
                    arr[right] = temp;
                    root = left;
                }
            }
        }
        return min;
    }
    int size(){
        return idx-1;
    }
    void display(){
        for(int i=1;i<idx;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
public class MinHeapImplementation {
    public static void main(String[] args) {
        Heap h = new Heap(10);
        h.add(10); h.add(15); h.add(8); h.add(9); h.add(4);
        h.display();
        System.out.println(h.remove());
        h.display();
        h.add(2);
        h.display();
        h.add(3);
        h.display();
    }
}
