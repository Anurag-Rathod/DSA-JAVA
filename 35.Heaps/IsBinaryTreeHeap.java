class Node {
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
public class IsBinaryTreeHeap {
    static int s = 0;
    public static int size(Node root){
        if(root == null) return 0;
        return 1 + size(root.left) + size(root.right); 
    }
    public static boolean isCBT(Node root, int idx){
        if(root == null) return true;
        if(idx > s) return false;
        return isCBT(root.left, idx*2) && isCBT(root.right, idx*2+1);
    }
    public static boolean isMaxHeap(Node root){
        if(root == null) return true;
        int leftVal = root.left == null ? Integer.MIN_VALUE : root.left.data;
        int rightVal = root.right == null ? Integer.MIN_VALUE : root.right.data;
        if(root.data <= leftVal || root.data <= rightVal) return false;
        return isMaxHeap(root.left) && isMaxHeap(root.right);
    }
    public static boolean isHeap(Node root) {
        s = size(root);
        return isMaxHeap(root) && isCBT(root,0);
    }
    public static void main(String[] args) {
        Node root = new Node(97);
        root.left.right = new Node(3);
        root.left = new Node(46);
        root.right = new Node(37);
        root.left.left = new Node(12);
        root.right.right = new Node(31);
        root.right.left = new Node(7);
        root.left.left.right = new Node(9);
        root.left.left.left = new Node(6);

        System.out.println(isHeap(root));
    }
}
