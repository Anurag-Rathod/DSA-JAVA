import java.util.*;
import java.util.LinkedList;

public class levelOrderTraversal {
    public static class TreeNode {
        int val;       
        TreeNode left;     
        TreeNode right;    

        TreeNode(int val){
            this.val = val;
        }
    }
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            int levelSize = q.size();
            List<Integer> temp = new ArrayList<>();
            
            for(int i=0;i<levelSize;i++){
                TreeNode node = q.remove();
                if(node!=null){
                    temp.add(node.val);
                    if(node.left!=null) q.add(node.left);
                    if(node.right!=null) q.add(node.right);
                }    
            }
            ans.add(temp);
        }
        return ans;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);  
        TreeNode a = new TreeNode(2);
        TreeNode b = new TreeNode(3);
        root.left = a;             
        root.right = b;            

        TreeNode c = new TreeNode(4);
        TreeNode d = new TreeNode(5);
        a.left = c;               
        a.right = d;

        TreeNode e = new TreeNode(6);
        TreeNode f = new TreeNode(7);
        b.left = e;                
        b.right = f; 
        
        List<List<Integer>> ans = levelOrder(root);
        System.out.println(ans);
        
    }
}
