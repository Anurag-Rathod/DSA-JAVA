public class FindMiddleNodeOfLinkedList {
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
        
        // Method : 1
        Node temp = a;//here a is head of linked list
        int size = 0;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        int idx = size/2;
        temp = a;
        for(int i=1;i<=idx;i++){
            temp=temp.next;
        }
        System.out.println(temp.data);

        //Method 2 : leetcode problem 876
        Node slow = a;//here a is head of linked list
        Node fast = a;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    }
}
