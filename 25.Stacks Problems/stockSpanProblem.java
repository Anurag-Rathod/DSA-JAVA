//Q.  stock Span Problem : (search on GFG)
//    Input: arr[] = [100, 80, 60, 70, 60, 75, 85]
//    Output: [1, 1, 1, 2, 1, 4, 6]
import java.util.Stack;
public class stockSpanProblem {
    public static void calculateSpan(int[] prices,int[] span){
        Stack<Integer> st = new Stack<>();
        st.push(0);
        span[0] = 1;

        for(int i=1;i<prices.length;i++){

            while (st.size()>0 && prices[st.peek()]<prices[i]) {
                st.pop();
            }
            if(st.size()==0){
                span[i] = i+1;
            }
            else{
                span[i] = i-st.peek();
            }
            st.push(i);
        }
    }
    public static void main(String[] args) {
        int[] prices =  {100, 80, 60, 70, 60, 75, 85};
        int[] span = new int[prices.length];
        calculateSpan(prices,span);

        // print span 
        for(int i=0;i<span.length;i++){
            System.out.print(span[i]+" ");
        }
    }
}
