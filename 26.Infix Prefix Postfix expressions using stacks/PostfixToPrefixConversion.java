import java.util.Stack;
public class PostfixToPrefixConversion {
    public static void main(String[] args) {
        String str = "953+4*6/-";
        Stack<String> st = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int num = ch-'0';
            if(num>=0 && num<=9){
                String temp = num+"";
                st.push(temp);
            } 
            else{
                String v2 = st.pop();
                String v1 = st.pop();
                char o = ch;
                String s = o+v1+v2;
                
                st.push(s);
            }
        }
        System.out.println(st.peek());
    }
}
