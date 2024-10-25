package _21_Stack;
 import java.util.*;
// in framework bcz its already impilemt
// use for online are in interveiwe time thik
public class _3 {
        public static void main (String[] args) {
        Stack<Integer> s = new Stack<>();
            s.push(1);
            s.push(2);
            s.push(3);
            s.push(4);

            while(!s.isEmpty()) {
                System.out.println(s.peek());
                s.pop();
            }
        }
}