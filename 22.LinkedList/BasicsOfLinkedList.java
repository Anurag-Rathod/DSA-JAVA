public class BasicsOfLinkedList {
    // Node class represents an element in the linked list
    public static class Node {
        int data; // Stores the data of the node
        Node next; // Points to the next node in the list

        // Constructor to initialize a node with data
        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        // System.out.println(a.next);//null
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        // 5 3 6 9 8 16

        a.next = b;// 5->3 9 8 16
        System.out.println(a.next);//now a contains address of b
        b.next = c;// 5->3->9 8 16
        c.next = d;// 5->3->9->8 16
        d.next = e;// 5->3->9->8->16

        // Displaying a linked list
        // System.out.println(a.data);//5
        // System.out.println(b.data);//3 
        // System.out.println(c.data);//9
        // System.out.println(d.data);//8
        // System.out.println(e.data);//16

        // System.out.println(a.data);//5
        // System.out.println(a.next.data);//3 
        // System.out.println(a.next.next.data);//9
        // System.out.println(a.next.next.next.data);//8
        // System.out.println(a.next.next.next.data);//16

        Node temp = a;//temp is pointing head of linked List
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();

        // Displaying a linked list using function/method
        print(a);
        System.out.println();
        // Displaying a linked list using recursively
        display(a);
        
    }
    
    // Displaying a linked list using function/method
    public static void print(Node head){
        while (head != null) {
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
    // Displaying a linked list using recursively
    public static void display(Node head){
        if(head == null) {
            return;
        }    
        System.out.print(head.data+" ");
        display(head.next);
    }
}
