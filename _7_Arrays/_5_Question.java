package _7_Arrays;

import javax.swing.*;
import java.util.Scanner;

public class _5_Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        System.out.println("enter the size");

        // input
        for (int i=0; i<size; i++) {
            numbers[i] = sc.nextInt();

        }
        System.out.println("enter the elemet to be found");
        int x = sc.nextInt();
            // output
            for(int i=0; i<numbers.length; i++) {
                if (numbers[i] == x) {
                    System.out.println("x found at indext : " + i);
                }
            }

        }
    }

