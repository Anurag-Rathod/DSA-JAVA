import java.util.ArrayList;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
public class BSTtoMaxHeap {
    static int idx;
    public static void postOrderTraversal(Node root, ArrayList<Integer> inOrder){
        if(root == null) return;
        postOrderTraversal(root.left, inOrder);
        postOrderTraversal(root.right, inOrder);
        root.data = inOrder.get(idx++);
    }
    public static void inOrderTraversal(Node root, ArrayList<Integer> inOrder){
        if(root == null) return;
        inOrderTraversal(root.left, inOrder);
        inOrder.add(root.data);
        inOrderTraversal(root.right, inOrder);
    }
    public static void convertToMaxHeapUtil(Node root) {
        ArrayList<Integer> inOrder = new ArrayList<>();
        idx = 0;
        inOrderTraversal(root, inOrder);
        postOrderTraversal(root, inOrder);
    }
    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(6);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.left = new Node(5);
        root.right.right = new Node(7);
        
        convertToMaxHeapUtil(root);
    }
}
