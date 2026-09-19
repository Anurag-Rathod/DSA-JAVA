//Q. find the "next greater element" for each element in the array. For an element arr[i], we want to find the first element to the right of it that is greater than arr[i]. If no such element exists, the result should be -1 for that element.
// input : [1,3,2,1,8,6,3,4]
// output : [3,8,8,8,-1,-1,4,-1]
import java.util.*;
public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {1,3,2,1,8,6,3,4};
        int n = arr.length;
        int[] ans = new int[n];
        ans[n-1] = -1;//last element ke baad koi element nahi hai isiliye -1 likha
        Stack<Integer> st = new Stack<>();
        st.push(arr[n-1]);//arr ka last element stack me push kar diya 
        for(int i=n-2;i>=0;i--){
            // Pop elements from the stack that are less than the current element
            while(st.size()!=0 && st.peek()<arr[i]){
                st.pop();
            }
            // If the stack is empty, there is no greater element, so set -1
            if(st.size()==0){
                ans[i] = -1;
            }
            // otherwise, the top of the stack is the next greater element
            else{// if(st.size()!=0)
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
