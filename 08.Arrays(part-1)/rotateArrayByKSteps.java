import java.util.*;
public class rotateArrayByKSteps { 
    // Function to rotate the array by 'k' steps
    public static int[] rotateArray(int arr[], int k) {
        int n = arr.length;   // Get the length of the array
        k = k % n;// If k is larger than the length of the array, we reduce it to avoid unnecessary rotations  

        int ans[] = new int[n];   // Create a new array to store the rotated result
        int j = 0;  // Index for the new array
        
        // First, copy the last 'k' elements to the beginning of the new array
        for (int i = n - k; i < n; i++) {
            ans[j] = arr[i];
            j++;
        }
        // Then, copy the first 'n-k' elements to the remaining positions of the new array
        for (int i = 0; i < n - k; i++) {
            ans[j] = arr[i];
            j++;
        } 
        return ans;  // Return the rotated array
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array of size " + n);
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Input the number of steps (k) by which to rotate the array
        System.out.print("Enter K : ");
        int k = sc.nextInt();
        sc.close();

        int ans[] = rotateArray(arr, k);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");  // Output the rotated array
        }
    }
}
