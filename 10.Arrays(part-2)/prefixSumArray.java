//Given an integer array 'a', return the prefix sum/running sum in the same array.
import java.util.Scanner;
public class prefixSumArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of arrays : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        for(int i=1;i<n;i++){//loop to make prefix sum array
            arr[i] += arr[i-1];// arr[i] = arr[i] + arr[i-1]
        }
        System.out.println("Prefix sum array is : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}