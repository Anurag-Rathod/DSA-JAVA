import java.util.Scanner;
public class containsDuplicateElementsOrNot {
    public static boolean containsDuplicate(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
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
        sc.close();
        if(containsDuplicate(arr) == true){
            System.out.println("array contains Duplicate elemets");
        }else{
            System.out.println("array not any contains Duplicate elemets");
        }
    }
}
