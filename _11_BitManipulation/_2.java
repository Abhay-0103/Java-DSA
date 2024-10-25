package _11_BitManipulation;

public class _2 {
    public static void main(String[] args) {
        // set bit
        int n = 5; //0101
        int pos = 1;
        int bitmask = 1<<pos;

        int newNumber = bitmask | n;
        System.out.println(newNumber);

    }
}
