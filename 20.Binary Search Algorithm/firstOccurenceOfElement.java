public class firstOccurenceOfElement {
    public static int firstOccurence(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        int firstOcc = -1;
        while (start<=end) {
            int mid = start+(end-start)/2;
            if(target==arr[mid]){
                firstOcc = mid;
                end = mid-1;// Since we need the first occurrence, we move left to check if there are more occurrences
            }
            else if(target<arr[mid]){
                end = mid-1;
            }
            else{//target > arr[mid]
                start = mid+1;
            }
        }
        return firstOcc;
    }
    public static int lastOccurence(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        int firstOcc = -1;
        while (start<=end) {
            int mid = start+(end-start)/2;
            if(target==arr[mid]){
                firstOcc = mid;
                start = mid+1;// Since we need the last occurrence, we move right to check if there are more occurrences
            }
            else if(target<arr[mid]){
                end = mid-1;
            }
            else{//target > arr[mid]
                start = mid+1;
            }
        }
        return firstOcc;
    }
    public static void main(String[] args) {
        int[] arr = {2,5,5,5,7,8,9};
        int target = 5;
        System.out.println(firstOccurence(arr, target));
        System.out.println(lastOccurence(arr, target));
    }
}
