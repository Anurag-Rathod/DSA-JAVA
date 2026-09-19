import java.util.Scanner;
public class alternateSumSeries {
    //Given a number n, find the sum of natural numbers till n but with alternate signs
    // 1-2+3-4+5-6+7-8+9-10 ...
    public static int seriesSum(int n){
        if(n==0) return 0;
        if(n%2==0){
            return seriesSum(n-1) - n;
        }else{
            return seriesSum(n-1) + n;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr Number : ");
        int n = sc.nextInt();
        sc.close();
        System.out.println(seriesSum(n));
    }
}
