public class size_sum_maxValue_heightOFBINARYTREE {
    // Static nested Node class to represent each node of the tree
    public static class Node {
        int val;       // Value/data of the node
        Node left;     // Reference to the left child
        Node right;    // Reference to the right child

        // Constructor to initialize the node with a value
        Node(int val){
            this.val = val;
        }
    }
    // Method to find the total number of nodes in the binary tree
    public static int size(Node root){ 
        if(root==null) return 0;
        int s = 1 + size(root.left) + size(root.right);
        return s;
    }
    // Method to calculate the sum of all node values in the binary tree
    public static int sum(Node root){
        if(root==null) return 0;
        int s = root.val + sum(root.left) + sum(root.right);
        return s;
    }
    // Method to calculate the product of all node values in the binary tree
    public static int product(Node root){
        if(root==null) return 1;
        int s = root.val * product(root.left) * product(root.right);
        return s;
    }
    // Method to find the maximum node value in the binary tree
    public static int MaxNode(Node root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        int a = root.val;
        int b = MaxNode(root.left);
        int c = MaxNode(root.right);

        return Math.max(a, Math.max(b, c));
    }
    // Method to find the minimum node value in the binary tree
    public static int MinNode(Node root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        int a = root.val;
        int b = MaxNode(root.left);
        int c = MaxNode(root.right);

        return Math.min(a, Math.max(b, c));
    }
    
    // Method to find the height of binary tree
    public static int height(Node root){
        if(root==null) return 0;
        if(root.left==null) return 0;
        if(root.right==null) return 0;

        return 1 + Math.max(height(root.left),height(root.right));
    }

    public static void main(String[] args) {
        // Creating nodes of the tree
        Node root = new Node(1);   // Root node
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;             // Set left child of root
        root.right = b;            // Set right child of root

        Node c = new Node(4);
        a.left = c;                // Set left child of node 'a'

        Node d = new Node(5);
        Node e = new Node(6);
        b.left = d;                // Set left child of node 'b'
        b.right = e;               // Set right child of node 'b'
        

        System.out.println("size of tree is(no. of node's in tree) = "+size(root));
        System.out.println("sum of all nodes in tree is = "+sum(root));
        System.out.println("product of all nodes in tree is = "+product(root));
        System.out.println("Maximum value node in tree is = "+MaxNode(root));
        System.out.println("minimum value node in tree is = "+MinNode(root));
        System.out.println("height of tree is = "+ height(root));
       
    }
}
