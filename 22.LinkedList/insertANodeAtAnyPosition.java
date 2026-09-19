public class insertANodeAtAnyPosition {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    // linkedlist class represents the linked list itself
    public static class linkedlist {
        Node head = null; 
        Node tail = null;
        // Method to insert a new node at the start of the linked list
        void inserAtStart(int val){
            Node temp = new Node(val);
           if(head==null){
            head = temp;
            tail = temp;
           }else{
            temp.next = head; 
            head = temp;
           }
        }
        // Method to insert a new node at the end of the linked list
        void inserAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
        }
        // Method to insert a node at any position in the linked list
        void insertAtAnyPosition(int idx,int val){
            Node temp = head;// Start from the head of the list
            // If the index is equal to the size of the list, insert at the end
            if(idx==size()){
                inserAtEnd(val);
                return;
            }
            if(idx==0){
                inserAtStart(val);
                return;
            }
            // Traverse the list to reach the node just before the insertion position
            for(int i=1;i<=idx-1;i++){
                temp = temp.next; // Move to the next node
            }
            // Create a new node with the given value
            Node t = new Node(val);
            t.next = temp.next; // Link the new node to the next node of the current node
            temp.next = t; // Link the current node to the new node
        }
        // Method to display the entire linked list
        void display() {
            Node tem = head;
            while (tem != null) {
                System.out.print(tem.data + " ");
                tem = tem.next; 
            }
            System.out.println();
        }
        // Method to return the size of the linked list (number of nodes)
        int size() {
            int count = 0; 
            Node tem = head;
            while (tem != null) {
                count++;
                tem = tem.next; 
            }
            return count;
        }
    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.inserAtEnd(4);//4
        ll.inserAtEnd(5);//4->5
        ll.inserAtEnd(7);//4->5->7
        ll.inserAtEnd(9);//4->5->7->9
        ll.inserAtEnd(12);//4->5->7->9->12
        ll.display();
        ll.insertAtAnyPosition(3, 100);// Insert 100 at index 3: 4 -> 5 -> 7 -> 100 -> 9 -> 12
        ll.display();
        System.out.println(ll.tail.data);//12

        ll.insertAtAnyPosition(6, 500);//4->5->7->100->9->12->500 pr is case me tail 9 ko hi point karege isiliye ham insertAtAnyPosition function me changes karenge { if(idx==size()) inserAtEnd(val); }
        ll.display();
        ll.insertAtAnyPosition(0, 999); //999->4->5->7->100->9->12->50
        ll.display();
    }
}
