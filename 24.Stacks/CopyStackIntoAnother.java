import java.util.Stack;
public class CopyStackIntoAnother {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("orignal stack is : "+st);

        //reverse the stack
        Stack<Integer> temp = new Stack<>();
        while (st.size()>0) {
            temp.push(st.peek());//we also use temp.push(st.pop)
            st.pop();
        }
        System.out.println("reverse stack is : "+temp);

        //Copy stack into another in same order 
        Stack<Integer> copy = new Stack<>();
        while (temp.size()>0) {
            copy.push(temp.peek());
            temp.pop();
        }
        System.out.println("copied stack is : "+copy);
    }
}
