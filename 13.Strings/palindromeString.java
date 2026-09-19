import java.util.Scanner;
public class palindromeString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        String str = sc.next();
        sc.close();
        boolean flag = true;
        int a = 0;
        int b = str.length()-1;
        while (a<b) {
            if(str.charAt(a) != str.charAt(b)){
                flag = false;
                break;
            }
            a++;
            b--;
        }
        if(flag==true) System.out.println(str+" is palindrome");
        else System.out.println(str+" is not palindrome");
    }
}
