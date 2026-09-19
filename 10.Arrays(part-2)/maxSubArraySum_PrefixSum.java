import java.util.Scanner;
public class maxSubArraySum_PrefixSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of arrays");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        // Compute the prefix sum array
        int prefixArray[] = new int[n];
        prefixArray[0] = arr[0];
        for(int i=1;i<n;i++){
            prefixArray[i] = arr[i] + prefixArray[i-1];
        }
        
        int maxSum = Integer.MIN_VALUE;
        // Find maximum subarray sum using the prefix sum array
        for(int i=0;i<arr.length;i++){
            int start = i;
            for(int j=i;j<arr.length;j++){
                int end = j;
                // Calculate the sum of the subarray arr[start..end]
                int currentSum = (start==0)?prefixArray[end] : prefixArray[end] - prefixArray[start-1];
                // Update maxSum if currentSum is greater
                if(maxSum < currentSum){
                    maxSum = currentSum;
                }
            }
        }
        System.out.println("max subarray sum is : "+maxSum);
    }
}
