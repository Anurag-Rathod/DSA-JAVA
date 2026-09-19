//Q. You are given the head of a linked list. Delete the middle node, and return the head of the modified linked list.
public class deleteMiddleNodeOfLinkedList {
    public static class Node {
        int data;
        Node next;  
        Node(int data){
            this.data = data;
        }      
    }
    public static Node deleteMiddle(Node head){
        //Edge case: if the list is empty or has only one node
        if (head == null || head.next == null) {
            return null;
        }
        //Method 1 :
        // Node temp = head;
        // int size = 0;
        // while(temp!=null){
        //     size++;
        //     temp = temp.next;
        // }
        // int middle = size/2;
        // temp = head;
        // for(int i=1;i<middle;i++){
        //     temp = temp.next;
        // }
        // temp.next = temp.next.next;
        // return head;

        //Method 2:
        Node slow = head;
        Node fast = head;
        //(fast.next.next!=null) => for even number of nodes
        //(fast.next.next.next!=null) => for odd number of nodes
        while(fast.next.next!=null && fast.next.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
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
        deleteMiddle(a);
        display(a);
    }
}
