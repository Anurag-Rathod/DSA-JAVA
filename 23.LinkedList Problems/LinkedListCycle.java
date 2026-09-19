//leetcode problem 141 : Given head, the head of a linked list, determine if the linked list has a cycle in it.
public class LinkedListCycle {
    public static class Node {
        int data;
        Node next;  
        Node(int data){
            this.data = data;
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
        f.next = d;//Linked list cycle
        //leetcode problem 141
        Node slow = a;// here a is head of linked list
        Node fast = a;
        while (fast!=null/*||fast.next!=null*/) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast==slow){
                System.out.println("Linked list cycle");
                break;
            }
        }
    }
}
