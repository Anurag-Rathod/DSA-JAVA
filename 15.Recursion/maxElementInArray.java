public class maxElementInArray {
    public static int maxElement(int[] arr,int idx){
        if(idx == arr.length-1){
           return arr[idx];
        }
        return Math.max(arr[idx],maxElement(arr, idx+1));
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.println(maxElement(arr, 0));
    }
}
