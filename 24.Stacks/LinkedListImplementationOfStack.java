public class LinkedListImplementationOfStack {
    public static class Node{//it is an user define data type
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class stack{//it is an user define data structure
        private Node head = null;
        private int size = 0;

        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }
        int pop(){
            if(head==null){
                System.out.println("stack is empty");
                return -1;
            }
            int num = head.data;
            head = head.next;
            size--;
            return num;
        }
        int peek(){
            if(head==null){
                System.out.println("stack is empty");
                return -1;
            }
            return head.data;
        }
        int size(){
            return size;
        }
        boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }
        void displayRev(Node h){//helper function which is use to print stack
            if(h==null) return;
            int x = h.data;
            displayRev(h.next);
            System.out.print(x+" ");
        }
        void display(){
            displayRev(head);
            System.out.println();
        }
        // void display(){ is method ke use se stack reverse order me print honga(ya linkedlist sequence me print hongi) 4 3 2 1 isiliye displayRev() method ka use kiya hai
        //     Node t = head;
        //     while (t!=null) {
        //         System.out.print(t.data+" ");
        //         t = t.next;
        //     }
        // }
    }
    public static void main(String[] args) {
        stack st = new stack();
        st.push(1);//1
        st.push(2);//1 2
        st.push(3);//1 2 3
        st.push(4);//1 2 3 4
        st.display();
        st.pop();
        st.display();
        System.out.println(st.peek());
        System.out.println(st.size());
        System.out.println(st.isEmpty());
    }
}
