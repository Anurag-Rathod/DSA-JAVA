import java.util.Scanner;
public class palindromeNo {
    public static boolean isPalindrome(int n){
        int num = n;
        int reverse = 0;
        while (n>0) {
            int lastDigit = n%10;
            reverse = reverse*10 + lastDigit;
            n/=10;
        }
        if(num==reverse){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        sc.close();
        
        
        if(isPalindrome(n)){
            System.out.println(n+" is palindrome");
        }else{
            System.out.println(n+" is not palindrome");
        }
    }
}
