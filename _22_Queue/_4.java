package _22_Queue;
import java.util.*;
// java framwork
public class _4 {
    public static void main(String[] args) {
       //  Queue Q = new Queue();

        // java meh simple Queue hai isliye hum first integer hai
        // second LinkList hai

       // Queue<Integer> Q = new LinkedList<>();

        // now double arraydeque wala
        Queue<Integer> Q = new ArrayDeque<>();
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

