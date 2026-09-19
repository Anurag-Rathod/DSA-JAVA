//Problem Statement: Given an integer array of size N, you have to find all the occurrences (indices) of a given element (Key) and print them. You need to use a recursive function to solve this problem.
//Sample Input: arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2},key = 2 Sample Output: 1 5 7 8
public class FindOccurences {
    public static void allOccurences(int[] arr,int key,int i){
        if(i==arr.length){
            return;
        }
        if(arr[i] == key){
            System.out.print(i+" ");
        }
        allOccurences(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;
        allOccurences(arr, key, 0);
    }
}
