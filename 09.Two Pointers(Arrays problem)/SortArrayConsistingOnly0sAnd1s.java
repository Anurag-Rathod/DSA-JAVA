//Sort an array consisting of only 0s and 1s using two pointers
import java.util.*;
public class SortArrayConsistingOnly0sAnd1s{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of array : ");
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        // Initialize two pointers: one starting at the beginning (start) and one at the end (end)
        int start = 0;
        int end = n-1;
        // While the start pointer is less than the end pointer, keep sorting the array
        while (start<end) {
            if(arr[start]==1 && arr[end]==0){
                int temp =  arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;// Move start pointer to the right
                end--;// Move end pointer to the left
            }
            // If the element at the start is '0', no need to swap, just move the pointer to the right
            if(arr[start]==0){
                start++;
            }
            // If the element at the end is '1', no need to swap, just move the pointer to the left
            if(arr[end]==1){
                end--;
            } 
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
