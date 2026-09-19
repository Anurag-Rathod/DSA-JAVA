public class ArrayImplementationOfStack {
    public static class stack{
        private int[] arr = new int[10];
        private int idx = 0;
        void push(int x){
            if(isFull()){
                System.out.println("stack is full");
                return;
            }
            arr[idx] = x;
            idx++;
        }
        int pop(){
            if(idx==0){
                System.out.println("Stack is empty");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1] = 0;
            idx--;
            return top;
        }
        int peek(){
            if(idx==0){
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[idx-1];
        }
        int size(){
            return idx;
        }
        void display(){
            for(int i=0;i<idx;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        boolean isEmpty(){
            if(idx==0) return true;
            else return false;
        }
        boolean isFull(){
            if(idx==arr.length) return true;
            else return false;
        }
        int capacity(){
            return arr.length;
        }
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
        System.out.println(st.isFull());
        System.out.println(st.capacity());
    }
}
