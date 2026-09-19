import java.util.Scanner;
public class secondMaxElementInArray {//method to find max value
    public static int  MaxValue(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int secondMax(int[] arr){//method to find min value
        int max = MaxValue(arr);
        for(int i=0;i<arr.length;i++){
            if(max==arr[i]){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secMax = MaxValue(arr);
        return secMax;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter elements of array of size "+n);
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        int secondMaxValue = secondMax(arr);
        System.out.println("second max value is = "+secondMaxValue);
    }
}
