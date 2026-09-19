import java.util.Scanner;
public class printSubArray {
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
        // Outer loop: start index of subarray
        for(int i=0;i<n;i++){
             // Middle loop: end index of subarray
            for(int j=i;j<n;j++){
                // Inner loop: print the elements of the subarray from index 'i' to 'j'
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" "); //Print each element in the current subarray
                }
                System.out.println();
            }
        }
    }
}
