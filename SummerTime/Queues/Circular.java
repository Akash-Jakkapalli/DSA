public class Circular {
    public class Queue{
        static int arr[];
        static int rear;
        static int size;
        static int front;

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;

        }
        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }
        public static boolean isFull(){
            return (rear+1)% size == front;
        }
        // add fun
        public static void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
            }
            // add first element
            if (front==-1) {
                front = 0;
            }
            rear = (rear +1)%size; // update
            arr[rear] = data;
        }
        // remove 
        public static int remove(){
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int result = arr[front];
            // remove first element
            if (rear==front) {
                rear = front = -1;
            }else{
                front = (front+1)%size;
            }
            return result;
        }
        // peek
        public static int peek(){
            if (isEmpty()) {
                System.out.println("Queue is full");
                return -1;
            }
            return arr [front];   
        }
    }
    public static void main(String[] args) {
        Circular q = new Circular();
        
        
        
    }
}
