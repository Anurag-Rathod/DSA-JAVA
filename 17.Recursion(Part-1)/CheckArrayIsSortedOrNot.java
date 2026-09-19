public class CheckArrayIsSortedOrNot {
    public static boolean CheckArray(int[] arr,int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]) return false;
        return CheckArray(arr, i+1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        if(CheckArray(arr, 0)){
            System.out.println("Sorted array");
        }else{
            System.out.println("Not a sorted array");
        }
    }
}
