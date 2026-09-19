import java.util.Stack;

public class PostfixEvaluation {
    public static void main(String[] args) {
        String str = "953+4*6/-";// output :- 4
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int num = ch-'0';
            if(num>=0 && num<=9) st.push(num);
            else{
                int v2 = st.pop();
                int v1 = st.pop();

                if(ch=='+') st.push(v1+v2);
                if(ch=='-') st.push(v1-v2);
                if(ch=='*') st.push(v1*v2);
                if(ch=='/') st.push(v1/v2);
            }
        }
        System.out.println(st.peek());
    }
}
