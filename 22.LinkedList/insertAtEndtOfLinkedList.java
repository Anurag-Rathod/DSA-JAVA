public class insertAtEndtOfLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    // linkedlist class represents the linked list itself
    public static class linkedlist {
        Node head = null; // Points to the first node of the list
        Node tail = null; // Points to the last node of the list

        // Method to insert a new node at the end of the linked list
        void inserAtEnd(int val) {
            // Create a new node with the given value
            Node temp = new Node(val);
            // If the list is empty, the new node will be the head
            if (head == null) {
                head = temp;
            } else {
                // If the list is not empty, append the new node to the tail
                tail.next = temp;
            }
            // Update the tail to be the new node
            tail = temp;
        }
    
        // Method to display the entire linked list
        void display() {
            Node tem = head;
            while (tem != null) {
                System.out.print(tem.data + " ");
                tem = tem.next; 
            }
        }
    
         // Method to return the size of the linked list (number of nodes)
        int size() {
            int count = 0; 
            Node tem = head;
            // Traverse the list and increment count for each node
            while (tem != null) {
                count++;
                tem = tem.next; // Move to the next node
            }
            return count;
        }
    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.inserAtEnd(4);
        ll.inserAtEnd(5);
        ll.display();
        System.out.println();
        System.out.print("size of linked list is : "+ll.size());
    }
}
