public class ArrayImplementationOfCircularQueue {
    public static class circulerQueue {
        int front = -1;
        int rear = -1;
        int size = 0;
        int[] arr = new int[10];

        void add(int val) throws Exception{ 
            if(size==arr.length){// agar size==arr.length honga to hame errror milenga "Queue is full"
                throw new Exception("Queue is full"); 
            }
            else if(size==0){
                front = rear = 0;
                arr[0] = val;
            }
            else if(rear<=arr.length-1){
                arr[++rear] = val;
            }
            else if(rear==arr.length-1){
                rear = 0;
            }
            size++;
        }
        int remove() throws Exception{
            if(size==0){
                throw new Exception("Queue is full");
            }
            else{
                int x = arr[front];
                if(front==arr.length-1) front=0;
                else front++;
                size--;
                return x;
            }
        }
        int peek() throws Exception{
            if(size==0){
                throw new Exception("Queue is full");
            }
            else return arr[front];
        }
        boolean isEmpty(){
            return (size==0);
        }
        void display(){
            if(size==0){
                System.out.println("Queue is empty");
                return;
            }
            else if(front<rear){
                for(int i=front;i<=rear;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            else if(front>rear){
                for(int i=front;i<arr.length;i++){
                    System.out.print(arr[i]+" ");
                }
                for(int i=0;i<=rear;i++){
                    System.out.print(arr[i]+" ");
                }
            }
                System.out.println();
        }
    }
    public static void main(String[] args) throws Exception{
        circulerQueue q = new circulerQueue();
        q.display(); // "Queue is empty"
        q.add(1); // Queue: 1
        q.add(2); // Queue: 1 2
        q.add(3); // Queue: 1 2 3
        q.add(4); // Queue: 1 2 3 4
        q.add(5); // Queue: 1 2 3 4 5
        q.display(); // 1 2 3 4 5

        q.remove();// 1
        q.display();// 2 3 4 5

    }
}
