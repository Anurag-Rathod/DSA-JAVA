public class factorial {
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial of "+ n +" is : "+fact(n));
        System.out.println("sum of first "+n+"numbers is : "+sum(n));
    }

    //sum of N natural number
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }

}
