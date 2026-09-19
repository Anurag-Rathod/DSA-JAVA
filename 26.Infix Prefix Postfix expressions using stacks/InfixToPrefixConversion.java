import java.util.*;
public class InfixToPrefixConversion {
    public static void main(String[] args) {
        String infix = "9-(5+3)*4/6"; // output : -9/*+5346
        Stack<String> val = new Stack<>(); 
        Stack<Character> op = new Stack<>();

        for(int i=0;i<infix.length();i++){
            char ch = infix.charAt(i);
            int num = ch-'0'; /* ==>>  int nums = (int)ch - 48; */

            if(num>=0 && num<=9){
                String s = ""+ch;
                val.push(s);
            }    
            else if(op.size()==0 || ch=='(' || op.peek()=='(') op.push(ch);
            else if(ch==')'){
                while (op.peek()!='(') {
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    
                    String temp = o + v1 + v2;
                    val.push(temp);
                }
                op.pop(); // (
            }
            else{
                if(ch=='+' || ch=='-'){
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    
                    String temp = o + v1 + v2;
                    val.push(temp);
                    op.push(ch);
                }
                if(ch=='*' || ch=='/'){
                    if(op.peek()=='*' || op.peek()=='/'){
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char o = op.pop();
                    
                        String temp = o + v1 + v2;
                        val.push(temp);
                        op.push(ch);
                    }
                    else{
                        op.push(ch);
                    }
                }
            }
        }

        while (val.size()!=1) {
            String v2 = val.pop();
            String v1 = val.pop();
            char o = op.pop();
                    
            String temp = o + v1 + v2;
            val.push(temp);
        }
        System.out.println(val.peek());
    }
}
