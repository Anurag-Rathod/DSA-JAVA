import java.util.Stack;
public class displayStack {
    //print stack(st) using recursion
    public static void displayStackRecusively(Stack<Integer> st){
        if(st.size()==0){
            return;
        }
        int top = st.pop();
        displayStackRecusively(st);
        System.out.print(top+" ");
        st.push(top);
    }
    //print reverse stack(st) using recursion
    public static void displayStackReverse(Stack<Integer> st){
        if(st.isEmpty()) return;
        int top = st.pop();
        System.out.print(top+" ");
        displayStackReverse(st);
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
        displayStackRecusively(st);
        System.out.println();
        displayStackReverse(st);
        
        //print stack(st) using anthore stack
        // Stack<Integer> temp = new Stack<>();
        // while (st.size()>0) {
        //     temp.push(st.pop());
        // }
        // while(temp.size()>0){
        //     int x = temp.pop();
        //     System.out.print(x+" ");
        //     st.push(x);
        // }

        //print stack(st) using array
        // int n = st.size();
        // int[] arr = new int[n];
        // for(int i=n-1;i>=0;i--){
        //     int x = st.pop();
        //     arr[i] = x;
        // }
        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i]+" ");
        //     st.push(arr[i]);
        // }
    }
}
