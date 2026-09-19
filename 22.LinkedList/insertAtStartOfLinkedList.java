public class insertAtStartOfLinkedList {
    // Node class represents each element in the linked list 
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }    
    }
    public static class linkedlist{
        Node head;
        Node tail;
        // Method to insert a node at the end of the linked list
        void inserAtEnd(int val){
            Node temp = new Node(val);
            if(head==null){
                head = temp;
                tail = temp;
            }else{
                tail.next = temp;
                tail = temp;
            }
            
        }
        // Method to display the elements of the linked list
        void display(){
            Node tem = head;
            while (tem!=null) {
                System.out.print(tem.data+" ");
                tem = tem.next;
            }
            System.out.println();
        }
        // Method to insert a node at the start of the linked list
        void inserAtStart(int val){
            Node temp = new Node(val); // Create a new node with the provided value
           if(head==null){
            head = temp; // Update the head to be the new node
            tail = temp; // Update the tail to be the new node
           }else{
            temp.next = head; // Point the new node to the current head of the list
            head = temp; // Update the head to be the new node
           }
        }
    }
    public static void main(String[] args) {
        linkedlist l = new linkedlist();
        l.inserAtEnd(4); // 4
        l.inserAtEnd(5); // 4->5
        l.display();
        l.inserAtStart(9); // 9->4->5
        l.display();
    }
}