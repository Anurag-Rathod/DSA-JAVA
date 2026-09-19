public class PrintNoNto1 {
    public static void printNTo1(int n){
        if(n==1){
            System.out.print(1);
            return;
        }
        System.out.print(n+" ");
        printNTo1(n-1);
    }
    public static void print1toN(int n){
        if(n==1){
            System.out.print(1+" ");
            return;
        }
        print1toN(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        print1toN(10);
        System.out.println();
        printNTo1(10);
    }
}
