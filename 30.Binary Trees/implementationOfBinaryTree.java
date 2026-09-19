public class implementationOfBinaryTree {
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
    // Method to display the binary tree in a readable format
    public static void display(Node root){
        if(root == null) return; // Base case: if the node is null, exit recursion
        System.out.print(root.val+"->");// Print the current node's value
        // Print the values of left and right children if they exist
        if(root.left != null) System.out.print(root.left.val + " ");
        if(root.right != null) System.out.print(root.right.val + "");
        System.out.println();
        display(root.left);
        display(root.right);
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

        //display(root);    
    }
}
