public class lengthOfLinkedList {
    public static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    // method that find length of Linked list
    public static int length(Node temp){
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        // 5 3 6 9 8 16
        a.next = b;// 5->3 9 8 16
        b.next = c;// 5->3->9 8 16
        c.next = d;// 5->3->9->8 16
        d.next = e;// 5->3->9->8->16

        System.out.println(length(a));

    }
}
