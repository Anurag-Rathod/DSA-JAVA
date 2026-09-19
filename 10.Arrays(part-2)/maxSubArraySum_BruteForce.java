import java.util.Scanner;
public class maxSubArraySum_BruteForce {
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
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int currentSum = 0;
                for(int k=i;k<=j;k++){
                    currentSum += arr[k];
                }
                System.out.println(currentSum);//print subarray sum
                if(maxSum < currentSum){
                    maxSum = currentSum;
                }
            } 
        }
        System.out.println("Maximum sum of subarray is : "+maxSum);//print maximum subarray sum
    }
}