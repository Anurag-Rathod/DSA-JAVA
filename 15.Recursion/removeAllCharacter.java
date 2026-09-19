public class removeAllCharacter {
    //Remove all character occurrences.
    public static String removeChar(String str,int idx){
        //base case
        if(idx==str.length()){
            return "";
        }
        // sub problem (recursive call)
        String smallAns = removeChar(str, idx+1);
        char ch = str.charAt(idx);
        // self work
        if(ch!='a'){//here we are removing charater 'a' from given string
            return ch + smallAns;
        }else{
            return smallAns;
        }
    }
    //Method 2
    public static String removeChar2(String str){
        if(str.length()==0){
            return "";
        }
        String smallAns = removeChar2(str.substring(1));
        char ch = str.charAt(0);
        
        if(ch!='a'){//here we are removing charater 'a' from given string
            return ch + smallAns;
        }else{
            return smallAns;
        }
    }
    public static void main(String[] args) {
        String str = "abacda";
        System.out.println(removeChar(str, 0));//method 1
        System.out.println(removeChar2(str));//method 2
    }
}
