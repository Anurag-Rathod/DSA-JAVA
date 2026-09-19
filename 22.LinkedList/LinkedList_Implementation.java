public class LinkedList_Implementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class  linkedlist {
        Node head;
        Node tail;
        // Method to insert at the end
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
        // Method to insert at the start 
        void inserAtStart(int val){
            Node tem = new Node(val);
            if(head==null){
                head = tem;
                tail = tem;
            }else{
                tem.next = head;
                head = tem;
            }
        }
        // Method to insert at any position
        void insertAtAnyPostion(int idx,int val){
            if(idx==size()){
                inserAtEnd(val);
                return;
            }
            if(idx==0){
                inserAtStart(val);
                return;
            }
            if(idx<0 || idx>size()){
                System.out.println("wrong index");
                return;
            }

            Node temp = head;
            for(int i=1;i<idx;i++){
                temp = temp.next;
            }
            
            Node t = new Node(val);
            t.next = temp.next;
            temp.next = t;
        }
        // Method to get the element at a specific position
        int getElementAtPosition(int idx){
            if(idx<0 || idx>size()){
                System.out.println("wrong index");
                return -1;
            }
            Node tem = head;
            for(int i=1;i<=idx;i++){
                tem = tem.next;
            }
            return tem.data;
        }
        // Method to delete node of linked list at given index
        void delete(int idx){
            if(idx==0){
                head = head.next;
                return;
            }
            Node temp = head;
            for(int i=1;i<idx;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        // Method to display the linked list
        void display(){
            Node tem = head;
            while (tem!=null) {
                System.out.print(tem.data+" ");
                tem = tem.next;
            }
            System.out.println();
        }
        // Method to get the size of the linked list
        int size(){
            int count = 0;
            Node temp = head;
            while (temp!=null) {
                count++;
                temp = temp.next;
            }
            return count;
        }
    }
    public static void main(String[] args){
        linkedlist l = new linkedlist();
        l.inserAtEnd(4);
        l.inserAtEnd(5);
        l.inserAtEnd(9);
        l.display();
        l.inserAtStart(1);
        l.display();
        l.insertAtAnyPostion(1, 1000);
        
        l.display();
        
        // System.out.println(l.getElementAtPosition(1));
        l.delete(1);
        l.display();
    }
}
