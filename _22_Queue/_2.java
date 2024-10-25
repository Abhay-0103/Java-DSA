package _22_Queue;

// using circular queue

public class _2 {
    static class Queue {
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;

        Queue(int size) {
            arr = new int[size]; // size ko hum n bhi likh sakthe hai
            this.size = size;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        //  add in quene is called enquene
        public static void add(int data) {
            if (isFull()) {
                System.out.println("full queue");
                return;
            }
            //1st element add
            if (front == -1) {
                front = 0;
            }
            rear = (rear +1) % size;
            arr[rear] = data;
        }

        // dequeue i also called remove
        public static int remove() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            int result = arr[front];
            //single element condition

          if (rear == front) {
              rear = front = -1;
            } else {
              front = (front + 1) % size;
          }
            return result;
        }

        //peek
        public static int peek() {
            {
                if (isEmpty()) {
                    System.out.println("empty queue");
                    return -1;
                }
                return arr[front];

            }
        }


        public static void main(String[] args) {

            Queue Q = new Queue(5);
            Q.add(1);
            Q.add(2);
            Q.add(3);
            Q.add(4);
            Q.add(5);
            System.out.println(Q.remove());
            Q.add(6);
            System.out.println(Q.remove());
            Q.add(7);

            // 1 2 3
            while (!Q.isEmpty()) {
                System.out.println(Q.peek());
                Q.remove();
            }
        }
    }
}


