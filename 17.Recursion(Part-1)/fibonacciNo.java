public class fibonacciNo {
    public static int fibo(int n){
        if(n==0 || n==1){
            return n;
        }
        int fibo = fibo(n-2) + fibo(n-1);
        return fibo;
    }
    public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<=n;i++){
            System.out.print(fibo(i)+" ");
        }
    }
}
