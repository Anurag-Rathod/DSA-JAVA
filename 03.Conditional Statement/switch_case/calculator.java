import java.util.*;
public class calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st No : ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd No : ");
        int num2 = sc.nextInt();
        System.out.print("Enter operator No : ");
        char operator = sc.next().charAt(0);
        sc.close();

        switch (operator) {
            case '+':
                System.out.print("Addition of this two No. is : "+(num1+num2));
                break;

            case '-':
                System.out.print("substraction of this two No. is : "+(num1-num2));
                break;    

            case '*':
                System.out.print("multiplication of this two No. is : "+(num1*num2));
                break;    

            case '/':
                System.out.print("division of this two No. is : "+(num1/num2));
                break;   
        
            default: 
                System.out.print("you enter wrong operator");
                break;
        }
    }
}
