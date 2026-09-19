//Q. Toggle the characters of a given string
public class toggleCharaterOfString {
    public static void main(String [] args){
        // Scanner sc = new Scanner(System.in);
        // StringBuilder str = new StringBuilder(sc.nextLine());//way of taking input of Stringbuilder
        // System.out.println(str);
        StringBuilder str = new StringBuilder("PhYsIcS");
        // toget :: (example: PhYsIcS -> pHySiCs) capital letter become small and small letter become capital letter
        for(int i=0;i<str.length();i++){    
            char ch = str.charAt(i);
            int asci = (int)ch;
            boolean  flag = true; // hm man ke chal rahe hai ki charater capital
            if(ch==' ') continue;
            if(asci>=97){
                flag = false;
            }
            if(flag==false){
                asci -= 32;
                ch = (char)asci;
                str.setCharAt(i, ch);
            }else{
                asci += 32;
                ch = (char)asci;
                str.setCharAt(i, ch);
            }
        }
        System.out.println(str);

        /*anthor approach :
        StringBuilder str = new StringBuilder("PhYsIcS");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // Toggle the case of the character
            if (Character.isLowerCase(ch)) {
                str.setCharAt(i, Character.toUpperCase(ch));
            } else if (Character.isUpperCase(ch)) {
                str.setCharAt(i, Character.toLowerCase(ch));
            }
        }
        
        System.out.println(str);
         */
    }
}
