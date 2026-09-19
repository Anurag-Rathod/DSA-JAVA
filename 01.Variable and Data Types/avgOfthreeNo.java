import java.util.*;
public class avgOfthreeNo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st Number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the 2nd Number : ");
        int num2 = sc.nextInt();
        System.out.print("Enter the 3rd Number : ");
        int num3 = sc.nextInt();
        sc.close();

        int Average = (num1 + num2 + num3)/3;
        System.out.print("Average of this three number is : "+Average);
    }
    
}

