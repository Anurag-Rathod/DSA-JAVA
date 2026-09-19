public class arrayImplementationOfQueue {
    public static class queue{
        private int front = -1;
        private int rear = -1;
        private int[] arr = new int[10];
        int size = 0;
        void add(int val){
            if(front==-1){
                front=rear=0;
                arr[0] = val;
            }
            else{
                arr[++rear] = val; /*arr[rear+1] = val; raar++;*/
            }
            size++;
        }
        int peek(){
            if(size==0){
                System.out.println("Queue is empty!");
                return -1;
            }
            int x = arr[front];
            return x;
        }
        int remove(){
            if(size==0){
                System.out.println("Queue is empty!");
                return -1;
            }
            int x = arr[front];
            front++;
            return x;
        }
        boolean isEmpty(){
            return(size==0);
        }
        void display(){
            for(int i=front;i<=rear;i++){
                System.out.print(arr[i]+" ");
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
