// Q. Question:  Duplicate Parentheses (search on GFG)
import java.util.ArrayList;
import java.util.Stack;

public class duplicateParentheses {
    public static boolean duplicate(String s){
        Stack<Character> st = new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            // When a closing parenthesis is found :- ')'
            if(ch==')'){
                int count = 0;
                while (st.peek()!='(') {
                    count++;
                    st.pop();// Pop characters until matching '(' is found
                }
                if(count<1) return true;
                st.pop();
            }
            // Push opening braket '(', charater 'a','b''c'...  and operands '+','-','*','/' to stack
            else{
                st.push(ch);
            }
        }
        return false;// No duplicate parentheses found
    }
    public static void main(String[] args) {
        String str = "(a+b)";//false
        System.out.println(duplicate(str));

        String str2 = "(((a+b)))";//true
        System.out.println(duplicate(str2));

        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        
        System.out.println(a.size());
    }
}
