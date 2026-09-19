public class chechArrayIsSortedOrNot {
    public static boolean sorted(int[] arr,int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx]<arr[idx+1]){
            //array is sorted
            return sorted(arr, idx+1);
        }else{
            //array is not sorted
            return false;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,7};
        System.out.println(sorted(arr, 0));
    }
}
