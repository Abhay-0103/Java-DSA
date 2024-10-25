package _22_Queue;


public class _3 {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;


        public static boolean isEmpty() {
            return head == null & tail == null;
        }

        //  add in quene is called enquene
        public static void add(int data) {
            Node newNode = new Node(data);
            if (tail == null) {
                tail = head = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        // dequeue i also called remove
        public static int remove() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            int front = head.data;
            if (head == tail) {
                tail = null;
            }
            head = head.next;
            return front;
        }
            //peek
            public static int peek() {
                if (isEmpty()) {
                    System.out.println("empty queue");
                    return -1;
                }
                return head.data;

            }
        }


        public static void main(String[] args) {

            Queue Q = new Queue();
            Q.add(1);
            Q.add(2);
            Q.add(3);
            Q.add(4);
            Q.add(5);

            // 1 2 3
            while (!Q.isEmpty()) {
                System.out.println(Q.peek());
                Q.remove();
            }
        }
    }



