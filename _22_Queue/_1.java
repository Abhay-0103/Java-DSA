package _22_Queue;

// using array
public class _1 {
    static class Queue {
        static int arr[];
        static int size;
        static int rear = -1;

        Queue(int size) {
            arr = new int[size]; // size ko hum n bhi likh sakthe hai
            this.size = size;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        //  add in quene is called enquene
        public static void add(int data) {
            if (rear == size - 1) {
                System.out.println("full queue");
                return;
            }

            rear++;
            arr[rear] = data;
        }

        // dequeue i also called remove
        public static int remove() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        //peek
        public static int peek() {
            {
                if (isEmpty()) {
                    System.out.println("empty queue");
                    return -1;
                }
                return arr[0];

            }
        }


        public static void main(String[] args) {

            Queue Q = new Queue(5);
            Q.add(1);
            Q.add(2);
            Q.add(3);

            // 1 2 3
            while (!Q.isEmpty()) {
                System.out.println(Q.peek());
                Q.remove();
            }
        }
    }
}
