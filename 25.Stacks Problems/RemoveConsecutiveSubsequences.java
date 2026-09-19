//Q. Remove consecutive subsequences
//input : [1,2,2,3,10,10,10,4,4,4,5,7,7,2]
//output : [1,3,5,2]
import java.util.Stack;
public class RemoveConsecutiveSubsequences {
    public static int[] remove(int[] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            if(st.size()==0 || arr[i]!=st.peek()){
                st.push(arr[i]);
            }
            else if(arr[i]==st.peek()){
                if( i==n-1 || arr[i]!=arr[i+1] ){ // i==n-1 array ke last index ke liye check kiya hai
                    st.pop();
                }
            }
        }
        int m = st.size();
        int[] res = new int[m];
        for(int i=m-1;i>=0;i--){
            res[i] = st.pop();
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,10,10,10,4,4,4,5,7,7,2};
        int[] ans = remove(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
