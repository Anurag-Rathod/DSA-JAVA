public class ElementIsPresentOnArrayOrNot {
    // Print whether x exists in the array or not
    public static boolean isPresent(int arr[],int target,int idx){
        //base case
        if(idx>=arr.length){
            return false;
        }
        // self work
        if(arr[idx] == target) return true;
        //recursive call
        return isPresent(arr, target, idx+1);
        // if(isPresent(arr, target, idx+1)){
        //     return true;
        // }else{
        //     return false;
        // }
    }

    // Return index if  target if target is present in the array, otherwise return -1
    public static int findIndex(int arr[], int target, int idx){
         //base case
         if(idx>=arr.length){
            return -1;
        }
        // self work
        if(arr[idx] == target) return idx;
        //recursive call
        return findIndex(arr, target, idx+1);
    }

    //Return all indeces if  target if target is present in the array.
    public static void printAllIndeces(int arr[], int target, int idx){
        //base case
        if(idx>=arr.length){
           return;
       }
       // self work
       if(arr[idx] == target){
        System.out.print(idx+" ");
       }
       //recursive call
       printAllIndeces(arr, target, idx+1);
   }
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,2,5};
        int target = 2;
        System.out.println(isPresent(arr, target, 0));// true
        System.out.println(findIndex(arr, target, 0));//return frist index of occurance => 1
        printAllIndeces(arr, target, 0);
    }
}