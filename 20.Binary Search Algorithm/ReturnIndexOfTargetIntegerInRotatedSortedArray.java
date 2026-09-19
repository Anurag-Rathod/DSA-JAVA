//Q. Return the index of the target integer
public class ReturnIndexOfTargetIntegerInRotatedSortedArray {
    public static int search(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;

        while (start<=end) {
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            // If the right part is sorted
            else if(arr[mid]<arr[end]){//mid to array is sorted
                // If the target is within the range of the right sorted part
                if(target>arr[mid] && target<=arr[end]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
            // If the left part is sorted
            else{// start to mid is sorted
                // If the target is within the range of the left sorted part
                if(target>=arr[start] && target<arr[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        int target = 1;
        
        System.out.println(search(arr, target));
    }
}
