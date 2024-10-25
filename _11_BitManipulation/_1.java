package _11_BitManipulation;

public class _1 {
    public static void main(String[] args) {
        // get the 3rd bit
        int n = 5; // 0101
        int pos = 3;
        int bitMask = 1 << pos;
        if ((bitMask & n) == 0) {
            System.out.println("bit was zero");
        } else {
            System.out.println("bit was one");
        }
    }
}