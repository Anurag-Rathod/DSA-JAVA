//For an array 'a' sorted in non-decreasing order, return an array of squares of each number sorted in non-decreasing order
import java.util.Scanner;
public class squaresArray {
    public static void squares(int[] arr){
        int ans[] = new int[arr.length];// Array to store squared values
        int start = 0;
        int end = arr.length-1;
        int i=0;// Index to insert squared values into the ans array
        //loop Compare the absolute values of arr[start] and arr[end] to get the larger value
        while (start <= end) {
            if(Math.abs(arr[start]) > Math.abs(arr[end])){// If arr[start] has a larger absolute value, square it and insert it into ans[i]
                ans[i] = arr[start]*arr[start];
                i++;
                start++; // Move start pointer to the right
            }
            else{ // If arr[end] has a larger absolute value, square it and insert it into ans[i]
                ans[i] = arr[end]*arr[end];
                i++;
                end--;// Move end pointer to the left
            }
        }
        revers(ans);//calling revers array function 
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of array : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        squares(arr);// Call the squares function to process the array

    }
    public static void revers(int ans[]){
        int f = 0;
        int l = ans.length-1;
        while (f<l){
            //swap elements
            int temp = ans[f];
            ans[f] = ans[l];
            ans[l] = temp;
            f++;
            l--;
        }
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
