package _22_Queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;
import java.util.*;

public class _5_Q {
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        public static void add(int data) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            s1.push(data);
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("is empty queue");
                return -1;
            }
          return s1.pop();
    }

    public static int peek() {
        if (isEmpty()) {
            System.out.println("is empty queue");
            return -1;
        }
        return s1.peek();
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

