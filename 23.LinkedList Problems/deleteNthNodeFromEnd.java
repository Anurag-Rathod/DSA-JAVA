public class deleteNthNodeFromEnd {
    public static class Node {
        int data;
        Node next;  
        Node(int data){
            this.data = data;
        }      
    }
    // Method to delete the N-th node from the end of the linked list
    public static Node deleteNthNode(Node head,int n){
        Node slow = head;
        Node fast = head;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        // If fast is null, it means we need to remove the head node
        if (fast == null) {
            head = head.next; // Remove the head node
            return head;      // Return the new head of the list
        }
        // Move both slow and fast pointers one step at a time until fast reaches the end of the list
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    public static void display(Node head){
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
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
        a = deleteNthNode(a, 6);
        display(a);
    }
}
