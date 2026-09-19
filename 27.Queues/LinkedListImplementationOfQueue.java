public class LinkedListImplementationOfQueue {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class queue{
        private Node head = null;
        private Node tail = null;
        private int size = 0;

        void add(int val){
            Node temp = new Node(val);
            if(size==0){
                head = tail = temp;
            }
            else{
                tail.next = temp;
                tail = tail.next;
            }
            size++;
        }
        int peek(){
            if(size==0){
                System.out.println("Queue is empty!");
                return -1;
            }
            return head.data;
        }
        int remove(){
            if(size==0){
                System.out.println("Queue is empty!");
                return -1;
            }
            int x = head.data;
            head = head.next;
            size--;
            return x;
        }
        boolean isEmpty(){
            return (size==0);
        }
        void display(){
            Node t = head;
            while (t!=null) {
                System.out.print(t.data+" ");
                t = t.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        queue q = new queue();
        q.add(1); // Queue: 1
        q.add(2); // Queue: 1 2
        q.add(3); // Queue: 1 2 3
        q.add(4); // Queue: 1 2 3 4
        q.add(5); // Queue: 1 2 3 4 5  
        q.display();// 1 2 3 4 5

        q.remove();// 1

        q.display();//2 3 4 5

        System.out.println(q.peek());//2
    }
}
