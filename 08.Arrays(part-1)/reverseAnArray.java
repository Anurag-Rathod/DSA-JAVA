public class reverseAnArray {
    public static void revers(int arr[]){
        int f = 0;
        int l = arr.length-1;
        while (f<l){
            //swap elements
            int temp = arr[f];
            arr[f] = arr[l];
            arr[l] = temp;
            f++;
            l--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int n[] = {1,2,3,4,5};
        revers(n);
    }
}
