import java.util.*;
public class primNoOrNot {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any No : ");
        int n = sc.nextInt();
        sc.close();
        boolean flag = false;

        // for(int i=2;i<n;i++){
        //     if(n%i==0){
        //         flag = true;
        //         break;
        //     }
        // } ham is code ko aur optimize kar sakte hai
        
        // the Math.sqrt(n) method is used to compute the square root of a number n
        for(int i=2;i<Math.sqrt(n);i++){ 
            if(n%i==0){
                flag = true;
                break;
            }
        }    
        if(flag==true) System.out.print(n+" is composite number");
        else System.out.print(n+" is prime number");
    }
}
