import java.util.Stack;

public class InfixEvaluation {
    public static void main(String[] args) {
        // String str = "9-5+3*4/6"; // output : 6
        String str = "9-(5+3)*4/6"; // output : 4
        Stack<Integer> val = new Stack<>(); // store numbers 1,2,3,4...
        Stack<Character> op = new Stack<>(); // store operator's +, -, *, /

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int num = ch-'0'; /* ==>>  int nums = (int)ch - 48; */

            if(num>=0 && num<=9) val.push(num);
            else if(op.size()==0 || ch=='(' || op.peek()=='(') op.push(ch);
            else if(ch==')'){
                while (op.peek()!='(') {
                    int v2 = val.pop();
                    int v1 = val.pop();

                    if(op.peek()=='+') val.push(v1+v2);
                    if(op.peek()=='-') val.push(v1-v2);
                    if(op.peek()=='*') val.push(v1*v2);
                    if(op.peek()=='/') val.push(v1/v2);

                    op.pop();
                }
                op.pop(); // (
            }
            else{
                if(ch=='+' || ch=='-'){
                    int v2 = val.pop();
                    int v1 = val.pop();

                    if(op.peek()=='+') val.push(v1+v2);
                    if(op.peek()=='-') val.push(v1-v2);
                    if(op.peek()=='*') val.push(v1*v2);
                    if(op.peek()=='/') val.push(v1/v2);

                    op.pop();

                    op.push(ch);
                }
                if(ch=='*' || ch=='/'){
                    if(op.peek()=='*' || op.peek()=='/'){
                        int v2 = val.pop();
                        int v1 = val.pop();

                        if(op.peek()=='*') val.push(v1*v2);
                        if(op.peek()=='/') val.push(v1/v2);

                        op.pop();

                        op.push(ch);
                    }
                    else{
                        op.push(ch);
                    }
                }
            }
        }

        while (val.size()!=1) {
            int v2 = val.pop();
            int v1 = val.pop();
            if(op.peek()=='+') val.push(v1+v2);
            if(op.peek()=='-') val.push(v1-v2);
            if(op.peek()=='*') val.push(v1*v2);
            if(op.peek()=='/') val.push(v1/v2);

            op.pop();
        }
        System.out.println(val.peek());
    }
}
