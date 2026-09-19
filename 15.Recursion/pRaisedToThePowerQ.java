public class pRaisedToThePowerQ {
    //method 1 : time_complexity = O(2^n)
    public static int pPowerQ(int p,int q){
        if(q==0){
            return 1;
        }
        return pPowerQ(p, q-1) * p;
    }
    //method 2 = O(n)
    public static int power2(int x,int n){
        if(n==0){
            return 1;
        }
        int halfpowerSqr = power2(x, n/2) * power2(x, n/2);
        if(n!=2){
            return halfpowerSqr*x;
        }
        return halfpowerSqr;
    }
    //method 3 = O(logn)
    public static int power3(int x,int n){
        if(n==0){
            return 1;
        }
        int halfpower = power2(x, n/2);
        int halfpowerSqr = halfpower * halfpower;
        if(n!=2){
            return halfpowerSqr*x;
        }
        return halfpowerSqr;
    }
    public static void main(String[] args) {
        System.out.println(pPowerQ(5, 3));
        System.out.println(power2(5, 3));
        System.out.println(power3(5, 3));
    }
}
