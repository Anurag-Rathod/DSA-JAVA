//Q. Write a program to find Length of a String using Recursion.
public class LengthOfString {
    public static int length(String str,int i){
        if(i==str.length()){
            return 0;
        }
        return length(str, i+1) + 1;
    }
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(length(str, 0));
    }
}
