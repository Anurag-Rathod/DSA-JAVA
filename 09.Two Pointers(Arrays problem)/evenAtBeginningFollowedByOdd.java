// In an array 'a' move all even integers at the beginning followed by all odd integers

import java.util.Scanner;

public class evenAtBeginningFollowedByOdd {
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
            if(arr[start]%2==1 && arr[end]%2==0){
                int temp =  arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;// Move start pointer to the right
                end--;// Move end pointer to the left
            }
            // If the element at the start is 'even', no need to swap, just move the pointer to the right
            if(arr[start]%2==0){
                start++;
            }
            // If the element at the end is 'odd', no need to swap, just move the pointer to the left
            if(arr[end]%2==1){
                end--;
            } 
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
