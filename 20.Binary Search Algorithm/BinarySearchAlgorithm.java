public class BinarySearchAlgorithm {
    // Recursive binary search code
    public static boolean searchRecursive(int[] arr,int target,int start,int end){
        if(start>end){//base case
            return false;
        }
        
        int mid= start*(end-start)/2;//int mid = (start+end)/2;
        if(arr[mid]==target){
            return true;
        }
        else if(arr[mid]<target){
            return searchRecursive(arr, target, mid+1, end);
        }
        else{//if(arr[mid]>=target)
            return searchRecursive(arr, target, start, mid-1);
        }
    }

    //Binary Search Algorithm Code using method 
    public static int search(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while (start<=end) {
            int mid = (start+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{//if(arr[mid]>=target)
                end=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 7;
        System.out.println(search(arr, target));
        System.out.println(searchRecursive(arr, target,0,arr.length-1));
    }
}
