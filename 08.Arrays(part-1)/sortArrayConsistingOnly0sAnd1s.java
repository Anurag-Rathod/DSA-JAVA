import java.util.Scanner;
public class sortArrayConsistingOnly0sAnd1s {
    // Method to sort the array consisting of only 0s and 1s
    public static void sort(int[] arr) {
        // Variable to count the number of zeroes in the array
        int zeroes = 0;
        // Loop through the array to count the zeroes
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 0) {
                zeroes++; // Increment zeroes count when a 0 is found
            }
        }

        // Loop through the array again to assign 0s and 1s based on the count of zeroes
        for(int i=0; i<arr.length; i++) {
            if(i<zeroes) {
                arr[i] = 0; // Assign 0 to the first 'zeroes' positions
            } else {
                arr[i] = 1; // Assign 1 to the remaining positions
            }
        }

        // Print the sorted array
        for(int i=0; i<arr.length; i++) {
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
        sc.close();

        sort(arr);
    }    
}
