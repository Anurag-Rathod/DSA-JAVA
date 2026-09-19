import java.util.Scanner;
public class rotateArrayByKStepsWithoutExtraSpace {
    public static int[] reverseArray(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;  // Return the modified array after reversal
    }
    // Function to rotate the array by 'k' steps in-place
    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;  // Get the length of the array
        k = k % n;  // Handle cases where k is greater than the array length

        // Step 1: Reverse the first 'n-k' elements (from index 0 to n-k-1)
        reverseArray(arr, 0, n-k-1);

        // Step 2: Reverse the last 'k' elements (from index n-k to n-1)
        reverseArray(arr, n-k, n-1);

        // Step 3: Reverse the entire array (from index 0 to n-1)
        reverseArray(arr, 0, n-1);

        // Print the rotated array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter K : ");
        int k = sc.nextInt();
        sc.close();
        // Call the rotateArray function to rotate the array and print the result
        rotateArray(arr, k);
    }
}
