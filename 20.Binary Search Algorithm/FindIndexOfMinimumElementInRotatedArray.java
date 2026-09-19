public class FindIndexOfMinimumElementInRotatedArray {
    public static int firstIdx(int[] arr){
        int n = arr.length-1;
        int start = 0;
        int end = n;
        int ans = -1;// Variable to store the index of the minimum element, initially set to -1

        while (start<=end) {
            int mid = start+(end-start)/2;
            // If the middle element is less than the last element, the minimum must be to the left
            if(arr[mid] < arr[n]){
                ans = mid;// Update the answer with the current middle index
                end = mid - 1;// Move the end pointer to the left side to check for smaller elements
            } else{
                start = mid + 1;// Otherwise, the minimum element is to the right, so move the start pointer
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,1,2,3};
        System.out.println(firstIdx(arr));// return index of the minimum element(1)
    }
}
