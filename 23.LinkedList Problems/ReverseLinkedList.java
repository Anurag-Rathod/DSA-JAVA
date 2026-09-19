public class ReverseLinkedList {
    public static  class  Node {
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    //reverse linkelist using recursion
    public static Node recrReverse(Node head){
        if(head.next==null){
            return head;
        }
        Node newHead = recrReverse(head.next);
        head.next.next = head; //\\ interchanging the connections
        head.next = null;
        return newHead;
    }
    public static Node reverse(Node head){
        if(head.next == null){
            return head;
        }
        Node newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    public static void diplay(Node head){
        if(head==null){
            return;
        }
        System.out.print(head.val+" ");
        diplay(head.next);
    }
    public static void main(String[] args){
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(1);
        Node d = new Node(2);
        Node e = new Node(4);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
        diplay(a);
        System.out.println();
        
        // a=reverse(a);
        // diplay(a);

        a=recrReverse(a);
        diplay(a);
    }
}