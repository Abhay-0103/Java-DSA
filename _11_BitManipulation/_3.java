package _11_BitManipulation;

public class _3 {
    public static void main(String[] args) {
        // clear bit
        int n = 5; //0101
        int pos = 2;
        int bitmask = 1<<pos;
        int notbitMask = ~(bitmask);

        int newNumber = notbitMask & n;
        System.out.println(newNumber);
    }
}
