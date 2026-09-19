import java.util.Stack;
public class PopFromBottomAtAnyIndex {
    public static void removeFromBottom(Stack<Integer> st,int idx){
        Stack<Integer> temp = new Stack<>();
        for(int i=1;i<=st.size()-idx;i++){
            temp.push(st.pop());
        }
        st.pop();//delete element at idx position
        while (!temp.isEmpty()) {
            st.push(temp.pop());
        }

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
        removeFromBottom(st, 2);
        System.out.println("updated stack is : "+st);
    }
}
