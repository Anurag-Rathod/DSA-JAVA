import java.util.Scanner;

public class evenOrOddNo {
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any No : ");
        int num = sc.nextInt();
        sc.close();
        
        if(num%2 == 0){
            System.out.print(num +" is even No");
        }else{
            System.out.print(num +" is odd No");
        }
    }
}
