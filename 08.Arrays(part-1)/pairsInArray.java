public class pairsInArray {
    public static void pairs(int arr[]){
        int totatPairs = 0;

        for(int i=0;i<arr.length;i++){
            int currentN = arr[i];
            for(int j=i+1;j<arr.length;j++){//this loop is used for making pairs
                System.out.print("("+currentN+","+arr[j]+")");
                totatPairs++;
            }
            System.out.println();
        }
        System.out.println("Total paris are : "+totatPairs);
    }
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10};
        pairs(number);
    }
}
