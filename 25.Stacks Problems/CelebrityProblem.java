//Q. Celebrity Problem :  (search on gfg)
import java.util.Stack;
public class CelebrityProblem {
    public static int celebrity(int mat[][]) {
        int n = mat[0].length;
        // Step 1: Push all people into the stack
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            st.push(i);
        }
        // Step 2: Eliminate non-celebrities
        while(st.size()>1){
            int v1 = st.pop();
            int v2 = st.pop();
            // If v1 knows v2, then v1 can't be a celebrity
            // So we keep v2 as a potential candidate celebrity 
            if(mat[v1][v2]==0){//shayad v1 celebrity ho, par v2 to celebrity nahi honga
              st.push(v1);  
            }
            // If v1 does not know v2, then v2 can't be a celebrity
            // So we keep v1 as a potential candidate celebrity 
            else if(mat[v2][v1]==0){//shayad v2 celebrity ho, par v1 to celebrity nahi honga
                st.push(v2);
            }    
        }
        // If stack is empty, there is no celebrity
        if(st.size()==0) return -1;
        
        int potential = st.pop();
        // Step 3: Verify the potential celebrity
        // A celebrity should not know anyone else
        for(int j=0;j<n;j++){
            if(potential==j) continue;
            if(mat[potential][j]==1) return -1;
        }
        // Everyone should know the celebrity
        for(int i=0;i<n;i++){
            if(potential==i) continue;
            if(mat[i][potential]==0) return -1;
        }
        // If passed both checks, return the celebrity index
        return potential;
    }
    public static void main(String[] args) {
        int mat[][] = {{1, 1, 0},// 0th person 
                       {0, 1, 0}, // 1st person
                       {0, 1, 1}}; // 2nd person
        //0th and 2nd person both know 1st person. Therefore, 1 is the celebrity person.                
        System.out.println(celebrity(mat));// output : 1st person
        
        int arr[][] = {{1, 1},// 0th person 
                       {1, 1}}; // 1st person
        //Since both the people at the party know each other. Hence none of them is a celebrity person.               
        System.out.println(celebrity(arr));// output : -1
    }
}
