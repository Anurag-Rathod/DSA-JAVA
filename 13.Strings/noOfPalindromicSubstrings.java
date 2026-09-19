// Count the number of palindromic substrings 
public class noOfPalindromicSubstrings {
    public static boolean isPalindom(String str){
        int a = 0;
        int b = str.length()-1;
        while (a<b) {
            if(str.charAt(a) != str.charAt(b)){
                return false;
            }
            a++;
            b--;
        }
        return true;
    }
    public static void main(String[] args){
        StringBuilder str = new StringBuilder("abbd");
        int count = 0;
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                if(isPalindom(str.substring(i,j))==true){
                    System.out.print(str.substring(i,j)+" ");
                    count++;
                }
            }
        }
        System.out.println("\nThe numbers of palindromuic substrings are "+count);
    }
}
