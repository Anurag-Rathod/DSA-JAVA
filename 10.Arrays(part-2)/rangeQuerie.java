//Q. For a given array of integers of size n, answer q queries to print the sum of values in a given range of indices from l to r
import java.util.Scanner;
public class rangeQuerie {
    public static int[] makePrefixSum(int[] arr){
        int n = arr.length;
        for(int i=1;i<n;i++){//loop to make prefix sum array
            arr[i] += arr[i-1];// arr[i] = arr[i] + arr[i-1]
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n+1];// Declare the array with size n+1 to accommodate 1-based indexing(is case me '0' index pr array ki 0 value hongi(arr[0]=0))
        System.out.println("Enter elements of arrays : ");
        for(int i=1;i<=n;i++){
            arr[i] = sc.nextInt();
        }
        int prefixSum[] = makePrefixSum(arr);

        System.out.print("Enter numbers of queries : ");
        int q = sc.nextInt();
        while (q > 0) {
            // Ask the user to provide the range (l to r)
            System.out.println("Enter Range(l to r) : ");
            int l = sc.nextInt();// Start index of the range
            int r = sc.nextInt();// End index of the range 
            // Calculate the sum for the range [l, r] using the prefix sum array
            int ans = prefixSum[r]-prefixSum[l-1]; // Prefix sum of range [l to r] is prefixSum[r] - prefixSum[l-1]
            System.out.println("Sum is : "+ans);
            q--;
        }   

        sc.close();
    }
}
