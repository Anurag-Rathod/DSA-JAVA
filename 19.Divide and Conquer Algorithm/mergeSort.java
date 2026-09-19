public class mergeSort {
    // Method to print the elements of the array
    public static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    // Method to merge two sorted subarrays into one sorted array
    public static void merge(int[] arr,int start,int mid,int end){
        int[] temp = new int[end-start+1];  

        int i = start;  // Pointer for the first half
        int j = mid + 1;  // Pointer for the second half
        int k = 0;  // Pointer for the temporary array

        // Merge the two halves while there are elements in both
        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];  // Add the smaller element from the first half
            } else {
                temp[k++] = arr[j++];  // Add the smaller element from the second half
            }
        }

        // If there are elements left in the first half, add them
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // If there are elements left in the second half, add them
        while (j <= end) {
            temp[k++] = arr[j++];
        }
        
        // copy temp to original array
        for(int w=0,x=start; w<temp.length; w++,x++){
            arr[x] = temp[w];
        }
    }
    public static void MergeSort(int[] arr,int start,int end){
        if(start>=end){
            return;// Base case: No need to split further if the subarray has one element or is empty
        }
        int mid = start + (end - start) / 2;//int mid = (e+s)/2// Find the middle index to split the array into two halves

        // Recursively sort the first half
        MergeSort(arr, start, mid);  
        // Recursively sort the second half
        MergeSort(arr, mid + 1, end);

        // Merge the two sorted halves together
        merge(arr, start, mid, end);
    }
    public static void main(String[] args) {
        int[] arr = {8,9,4,2,7,3};
        MergeSort(arr, 0, arr.length-1);
        printArr(arr);
        
    }
}