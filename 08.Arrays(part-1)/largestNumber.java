public class largestNumber {
    public static void main(String[] args) {
        int[] arr = {1,4,6,9,0,2,5};
        int largetN = Integer.MIN_VALUE;//Represents the smallest possible value an int can hold.
        int smallestN = Integer.MAX_VALUE;//Represents the largest possible value an int can hold.
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallestN){
                smallestN = arr[i];
            }
            if(arr[i]>largetN){
                largetN = arr[i];
            }
        }
        System.out.println("Largest number is "+largetN);
        System.out.println("Smallest number is "+smallestN);
        // int largetN = arr[0];
        // int smallestN = arr[0];
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]>largetN){
        //         largetN = arr[i];
        //     }
        //     if(arr[i]<smallestN){
        //         smallestN=arr[i];
        //     }
        // }
        // System.out.println("Largest number is "+largetN);
        // System.out.println("Smallest number is "+smallestN);
    }
}
