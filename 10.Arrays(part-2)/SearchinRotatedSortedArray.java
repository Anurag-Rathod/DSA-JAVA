import java.util.Scanner;
public class SearchinRotatedSortedArray {
    public static int search(int[] arr,int pivot,int target){
        int n = arr.length;
        int ans[] = new int[n];
        int j = 0;//index used to store elements on ans array
        for(int i=pivot;i<n;i++){
            ans[j] = arr[i];
            j++;
        }
        for(int i=0;i<pivot;i++){
            ans[j] = arr[i];
            j++;
        }
        System.out.println("Rotated array is : ");
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
        for(int i=0;i<n;i++){
            if(ans[i]==target){
                return i;
            }    
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter pivot element : ");
        int pivot = sc.nextInt();
        System.out.print("Enter target element : ");
        int target = sc.nextInt();
        sc.close();
        int index =search(arr,pivot,target);
        System.out.println("\nTarget is presenet at "+index);
    }
}
