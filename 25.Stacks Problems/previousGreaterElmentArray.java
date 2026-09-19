//Q. Write a program that finds the previous greater element for each element in the array.
//input : {1, 3, 2, 1, 8, 6, 3, 4}
//output : {-1, -1, 3, 2, -1, 8, 6, 6}
import java.util.Stack;
public class previousGreaterElmentArray {
    public static void main(String[] args) {
        int[] arr = {1,3,2,1,8,6,3,4};
        int n = arr.length;
        int[] ans = new int[n];
        ans[0] = -1;// the first element has no previous element, so it's -1
        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);// push the first element to the stack

        for(int i=1;i<arr.length;i++){
            // Pop elements from the stack that are smaller than the current element    
            while(st.size()!=0 && st.peek()<arr[i]){
                st.pop();
            }
            // If stack is empty, no greater element to the left, set -1
            if(st.size()==0){
                ans[i] = -1;
            }
            // Otherwise, the top element in the stack is the previous greater element
            else{//if st.size()!=0
                ans[i] = st.peek();
            }
            // Push the current element to the stack for future comparisons
            st.push(arr[i]);
        }
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
