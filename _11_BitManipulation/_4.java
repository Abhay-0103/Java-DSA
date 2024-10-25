package _11_BitManipulation;

import java.util.Scanner;

public class _4 {
    public static void main(String[] args) {
        // update bit
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        int n = 5; //0101
        int pos = 1;

        int bitMask = 1 << pos;
        if (oper == 1) {
            // set
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else {
            // clear
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }
    }
}