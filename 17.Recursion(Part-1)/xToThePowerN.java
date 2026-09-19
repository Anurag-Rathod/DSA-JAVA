public class xToThePowerN {
    public static int power(int x,int power){
        if(power==1){
            return x;
        }
        return x *power(x, power-1);
    }
    //optimized x to the power n code
    public static int optimizedPower(int x,int power){
        if(power == 0){
            return 1;
        }
        int halfPower = optimizedPower(x, power/2);
        int halfPowerSqr = halfPower * halfPower;

        if(power%2!=0){
            return halfPowerSqr*x;
        }
        return halfPowerSqr ;
    }
    public static void main(String[] args) {
        int num = 2;
        int power = 10;
        System.out.println(power(num, power));
        System.out.println(optimizedPower(num, power));
    }
}