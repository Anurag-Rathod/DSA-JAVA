import java.util.ArrayList;
public class ratInAMazeFourDirection {
    public static void solve(int i, int j, int n, StringBuilder sb, ArrayList<String> res, boolean[][] check){
        if(i >= n || j >= n || i < 0 || j < 0 || check[i][j]){
            return;
        }
        if(i == n-1 && j == n-1){
            res.add(sb.toString());
            return;
        }
        
        check[i][j] = true;
        
        sb.append("D");
        solve(i+1, j, n, sb, res, check);
        sb.deleteCharAt(sb.length()-1);
        
        sb.append("L");
        solve(i, j-1, n, sb, res, check);
        sb.deleteCharAt(sb.length()-1);
        
        sb.append("R");
        solve(i, j+1, n, sb, res, check);
        sb.deleteCharAt(sb.length()-1);
        
        sb.append("U");
        solve(i-1, j, n, sb, res, check);
        sb.deleteCharAt(sb.length()-1);
        
        check[i][j] = false; 
    }
    public static void main(String[] args) {
        int n = 3;
        boolean[][] check = new boolean[n][n];
        ArrayList<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder("");
        solve(0,0,n,sb,res,check);
        for(int i=0;i<res.size();i++){
            System.out.println(res.get(i));
        }
    }
}