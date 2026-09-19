public class FindPeakElement {
    public static int findPeakElement(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = n-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if((mid==0 || nums[mid]>nums[mid-1]) && (mid==n-1 || nums[mid]>nums[mid+1])){
                return mid;
            }
            if(nums[mid]<nums[mid+1]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(findPeakElement(nums));
        //Output: 2
        //Explanation: 3 is a peak element and your function should return the index number 2.

        // Input: nums = [1,2,1,3,5,6,4]
        // Output: 5
        // Explanation: Your function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.
    }
}
