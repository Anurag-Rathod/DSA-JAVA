import java.util.Stack;
public class PrefixToPostfixConversion {
    public static void main(String[] args) {
        String str = "-9/*+5346";
        Stack<String> st = new Stack<>();
        for(int i=str.length()-1;i>=0;i--){
            char ch = str.charAt(i);
            int num = ch-'0';
            if(num>=0 && num<=9){
                String temp = num+"";
                st.push(temp);
            } 
            else{
                String v1 = st.pop();
                String v2 = st.pop();
                char o = ch;
                String s = v1+v2+o;
                
                st.push(s);
            }
        }
        System.out.println(st.peek());
    }
}
