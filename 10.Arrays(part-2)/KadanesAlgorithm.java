public class KadanesAlgorithm{
    public static void main(String[] args){
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        int maxSum = arr[0];//we also take maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int i=0;i<arr.length;i++){
            // Add the current element to the current sum
            currentSum += arr[i];
            
            // Update maxSum if currentSum is larger than the previously recorded maxSum
            maxSum = Math.max(maxSum, currentSum);

            // If currentSum becomes negative, reset it to 0
            // This is because a negative sum will reduce the value of any subarray it is added to,
            // so it's better to start a new subarray from the next element
            if(currentSum < 0){
                currentSum = 0;
            }
            
        }
        System.out.println("Maximum array sum is : "+maxSum);
    }
}
