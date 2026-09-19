import java.util.Stack;
public class ReverseStack {
    //reverse stack using recursion
    public static void reverse(Stack<Integer> st){
        if(st.size()==1) return;
        int top = st.pop();
        reverse(st);
        pushAtBottom(st,top);
    }
    public static void pushAtBottom(Stack<Integer> st,int x){
        if(st.size()==0){
            st.push(x);
            return;
        }
        int top = st.pop();
        pushAtBottom(st, x);
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
        reverse(st);//reverse stack using recursion
        System.out.println("reverse stack is : "+st);

        //reverse stack using loop
        // Stack<Integer> temp1 = new Stack<>();
        // while (st.size()>0) {
        //     temp1.push(st.pop());
        // }
        // Stack<Integer> x = new Stack<>();
        // while (temp1.size()>0) {
        //     x.push(temp1.pop());
        // }
        // while (x.size()>0) {
        //     st.push(x.pop());
        // }
        // System.out.println("reverse stack is : "+st);
    }
}
