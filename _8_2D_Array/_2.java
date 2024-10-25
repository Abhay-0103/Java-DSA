package _8_2D_Array;

import java.util.Scanner;

public class _2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("the the rows");
        int rows = sc.nextInt();
        System.out.println("enter the cols");
        int cols = sc.nextInt();


        int[][] numbers = new int[rows][cols];
        System.out.println("enter the all number");
// input
        // rows
        for (int i = 0; i < rows; i++) {
            // cols
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.println("number to be found");
        int x = sc.nextInt();

// output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // compare with x
                if (numbers[i][j] == x) {
                    System.out.println("x found at locations (" + i + "," + j + ")");
                }
            }
        }
    }
}

