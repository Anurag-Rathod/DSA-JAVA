public class nthNodeFromEnd {   
    public static class Node {
        int data;
        Node next;  
        Node(int data){
            this.data = data;
        }      
    }
    //Method 1
    public static Node NthNodeFromEnd1(Node head,int n){
        int size = 0;
        Node temp = head;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        //m is calculated to determine the position of the node from the start.
        int m = size-n+1;//mth node from start (nth node from end)
        temp = head;
        for(int i=1;i<m;i++){
            temp=temp.next;
        }
        return temp;
    }
    //Method 2 : in one traversal
    //Method 2: Two Pointer (Slow and Fast) Approach
    public static Node NthNodeFromEnd2(Node head,int n){
        Node slow = head;
        Node fast = head;
        // Move the fast pointer n nodes ahead.
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        // move both pointers together until the fast pointer reaches the end.
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        // The slow pointer will now be at the Nth node from the end.
        return slow;
    }
    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        Node x = NthNodeFromEnd1(a, 3);
        System.out.println(x.data);//return 5
        Node y = NthNodeFromEnd2(a, 3);
        System.out.println(y.data);//return 5
    }
}
