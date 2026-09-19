public class LinkedList {
    public class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    void addAtFirst(int val){
        Node temp = new Node(val);
        if(head==null){
            head = temp;
            tail = temp;
            size++;
            return;
        }else{
            temp.next = head;
            head = temp;
            size++;
        }
    }
    void addAtLast(int val){
        Node temp = new Node(val);
        if(head==null){
            head = temp;
            tail = temp;
            size++;
            return;
        }else{
            tail.next = temp;
            tail = temp;
            size++;
        }
    }
    void addAtAnyPosition(int idx,int val){
        if(idx>size){
            System.out.println("Wrong index");
            return;
        }
        if(head==null){
            addAtFirst(val);
            return;
        }
        if(idx==size-1){
            addAtLast(val);
            return;
        }
        Node t = head;
        size++;
        for(int i=0;i<idx-1;i++){
            t = t.next;
        }
        Node temp = new Node(val);
        temp.next = t.next;
        t.next = temp;
    }
    // int size(){
    //     int length = 0;
    //     Node t = head;
    //     while (t!=null) {
    //         length++;
    //         t = t.next;
    //     }
    //     return length;
    // }
    void display(){
        Node t = head;
        while (t!=null) {
            System.out.print(t.data+"->");
            t =  t.next;
        }
        System.out.println("null");
    }
    int removeFromFirst(){
        if(head==null){
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        }
        size--;
        int val = head.data;
        head = head.next;
        return val;

    }
    int removeFromLast(){
        if(head==null){
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            size = 0;
            head = tail = null;
            return Integer.MIN_VALUE;
        }
        Node temp = head;
        for(int i=0;i<size-2;i++){
            temp = temp.next;
        }
        int val = temp.next.data;
        temp.next = null;
        tail = temp;
        size--;
        return val;

    }
    //function to search node in linkedlist using recursively
    public int search(Node temp,int key){
        if(temp==null){
            return -1;
        }
        if(temp.data==key){
            return 0;
        }
        int idx = search(temp.next, key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public  int recSearch(int key){
        return search(head,key);
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addAtFirst(1);//1
        ll.addAtLast(2);//1->2
        ll.addAtLast(3);//1->2->3
        ll.addAtLast(4);
        ll.addAtLast(5);
        ll.addAtLast(6);
        ll.addAtLast(7);//1->2->3->4->5->6->7
        ll.display();
        ll.addAtAnyPosition(1, 1000);//1->1000->2->3->4->5->6->7
        ll.display();
        ll.removeFromFirst();//1000->2->3->4->5->6->7
        ll.display();
        ll.removeFromLast();//1000->2->3->4->5->6
        ll.display();
        
        System.out.println(ll.recSearch(6));
    }
}