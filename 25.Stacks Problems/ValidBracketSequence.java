import java.util.Stack;
public class ValidBracketSequence {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            // If it's an opening bracket, push it onto the stack
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }
            else{
                // If it's a closing bracket and stack is empty, it's invalid
                if(st.size()==0){
                    return false;
                }
                // Check if top of stack matches the corresponding opening bracket
                if ((ch==')' && st.peek()=='(') || // ()
                    (ch==']' && st.peek()=='[') ||// []
                    (ch=='}' && st.peek()=='{')){ // {}

                        // Valid pair found → pop the opening bracket
                        st.pop();
                }else{
                    // Mismatched pair → invalid string example : (], [()}, {), [) 
                    return false;
                }
            }
        }   
        return st.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println(isValid("{([])}"));// true
        System.out.println(isValid("{([)"));// false
        
        
    }
}
