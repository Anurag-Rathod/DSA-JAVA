//For an array of integers return the first value that is repeating in the array
import java.util.*;
public class returnFirstRepeatingValue {
    public static int firstRepeatingElement(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    return arr[j];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        int r = firstRepeatingElement(arr);
        if(r==-1) System.out.println("No repeating value is present");
        else System.out.println("first repeating value is "+r);
    }
}
