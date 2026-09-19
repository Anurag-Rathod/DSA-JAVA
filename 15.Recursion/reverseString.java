public class reverseString {
    //method 1
    public static String reverse(String str,int idx){
        if(idx == str.length()) return "";
        String smallAns = reverse(str, idx+1);
        return smallAns + str.charAt(idx);
    }

    //method 2 : without using idx element
    public static String reverse2(String str){
        if(str.length()==0) return "";
        String smallAns = reverse2(str.substring(1));
        return smallAns + str.charAt(0);
    }
    //Method 3 :
    public static void reverse3(StringBuilder str){
        if(str.length()-1 == 1){
            System.out.print(str.charAt(0));
            return;
        }
        System.out.print(str.charAt(str.length()-1));
        reverse3(new StringBuilder(str.substring(0, str.length()-1)));
    }
    public static void main(String[] args){
        String str = "Hello";
        System.out.println(reverse(str, 0));
        System.out.println(reverse2(str));
    }
}
