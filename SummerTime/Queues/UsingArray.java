public class UsingArray{
    static class Queue{
        
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;  
            front = -1;
    
        }
        public static boolean isEmpty() {
            return rear == -1; // stack is empty (No element)
        }
        // add fun
        public static void add(int data ) {
            if (rear == size-1) {
                System.out.println("Queue is full");
            }
            rear = rear +1;
            arr[rear] = data;
        }

        // remove 
        public static int remove(){
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int result = arr[front];
            
            if (rear==front) {
                rear = front = -1;
            }else{
                front = (front+1)%size;
            }
            return result;
        }
        public static int peek(){
            if (isEmpty()) {
                System.out.println("Queue is full");
                return -1;
            }
            return arr [front];   
        }
    }
    public static void main(String[] args) {
        UsingArray u = new UsingArray();
        
        
    }
}