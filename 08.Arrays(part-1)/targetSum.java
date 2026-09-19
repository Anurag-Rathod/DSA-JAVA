import java.util.Scanner;
public class targetSum{
    public static int targetsum(int[] arr, int x){
        int ans = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==x){
                    ans++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enetr element of array of size "+n);
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter target number : ");
        int tar = sc.nextInt();
        sc.close();

        System.out.println(targetsum(arr, tar));;
    }       
}
