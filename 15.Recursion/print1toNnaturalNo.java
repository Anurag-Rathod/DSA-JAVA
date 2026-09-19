public class print1toNnaturalNo {
    public static void printNto1(int n) {
        // Base case: when n is 1, just print it and return.
        if (n == 1) {
            System.out.println(1);
            return;
        }
        // Print current number n and recurse for n-1
        System.out.print(n + " ");
        printNto1(n - 1);
    }
    public static void print1ToN(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        printNto1(n-1);
        System.out.println(n);
    }
    public static void main(String[] args){
        int n = 9;
        printNto1(n);
    }
}
