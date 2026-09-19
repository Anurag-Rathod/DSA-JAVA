import java.util.*;
public class incomeTaxCalculater {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your income : ");
        float income = sc.nextInt();
        sc.close();
        float tax;
        if(income >= 1000000){
            tax = income * 0.3f;
            System.out.print("You gives "+ tax +" ruppes as an tax to Government"); 
        }else if(income<1000000 && income>=500000){
            tax = income * 0.2f;
            System.out.print("You gives "+ tax +" ruppes as an tax to Government"); 
        }else{
            System.out.print("You did not give any tax to  government");
        }
        
    }
}
