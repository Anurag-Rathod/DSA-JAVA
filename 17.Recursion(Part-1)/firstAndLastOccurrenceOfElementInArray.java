public class firstAndLastOccurrenceOfElementInArray {
    //find first occurrence of element in an array
    public static int firstOccurrence(int[] arr,int i,int target){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==target)  return i;
        return firstOccurrence(arr, i+1, target);
    }

    //find last occurrence of element in an array
    public static int lastOccurrence(int[] arr,int i,int target){
        if(i==-1){
            return -1;
        }
        if(arr[i]==target)  return i;
        return lastOccurrence(arr, i-1, target);
    }
    public static void main(String[] args) {
        int[] arr = {1,9,5,6,9,0,4,9,8};
        int target = 9;

        System.out.println("first occurrence of "+target+" is : "+firstOccurrence(arr, 0, target));
        System.out.println("last occurrence of "+target+" is : "+lastOccurrence(arr, arr.length-1, target));
    }
}
