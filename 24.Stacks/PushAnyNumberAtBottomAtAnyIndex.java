//Q. inserts a given number at a specified index in a stack
import java.util.Stack;
public class PushAnyNumberAtBottomAtAnyIndex {
    //Push at bottom at any index : Recursive method
    public static void pushAtBottom(Stack<Integer> st,int num,int idx){
        if(st.size()-1==idx){
            st.push(num);
            return;
        }
        int top = st.pop();
        pushAtBottom(st, num, idx);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        System.out.println("orignal stack is : "+st);
        pushAtBottom(st, 100, 6);
        System.out.println("updated stack is : "+st);

        //Push at bottom / any index - iterative method
        // int num = 100;
        // int idx = 2;//add nums at 2nd index of stack(st) from bottom
        // Stack<Integer> temp = new Stack<>();
        // while (st.size()>idx) {
        //     temp.push(st.pop());
        // }
        // //now push nums(11) in stack at 2nd index
        // st.push(num);
        // while (temp.size()>0) {
        //     st.push(temp.pop());
        // }
        // System.out.println("Modified stack is : "+st);
    }
}
