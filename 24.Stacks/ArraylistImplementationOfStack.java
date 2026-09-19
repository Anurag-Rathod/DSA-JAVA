import java.util.ArrayList;
public class ArraylistImplementationOfStack {
    public static class stack{
        static ArrayList<Integer> arr = new ArrayList<>();
        //push
        void push(int val){
            arr.add(val);
        }
        //pop
        int pop(){
            if(size()==0){
                System.out.println("stack is empty");
                return -1;
            }
            int top = arr.get(arr.size()-1);
            arr.remove(arr.size()-1);
            return top;
        }
        //peek or top of stack
        int peek(){
            if(size()==0){
                System.out.println("stack is empty");
                return -1;
            }
            return arr.get(arr.size()-1);
        }
        //size of stack
        int size(){
            return arr.size();
        }
        boolean isEmpty(){
            return arr.size()==0;
        }
        //print stack
        void display(){
            for(int i=0;i<arr.size();i++){
                System.out.print(arr.get(i)+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        stack st = new stack();
        st.push(1);//1
        st.push(2);//1 2
        st.push(3);//1 2 3
        st.pop();// 1 2 
        st.peek();// 2
        
        st.display();
    }
}
