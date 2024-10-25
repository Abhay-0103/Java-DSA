package _8_2D_Array;

import java.util.Scanner;

public class _1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter thr rows");
        int rows = sc.nextByte();
        System.out.println("enter thr cols");
        int cols = sc.nextByte();

        int [][] numbers =  new int[rows][cols];
        System.out.println("enter the all number");
// input
        // rows
        for (int i=0; i<rows; i++) {
            // cols
            for (int j=0; j<cols; j++) {
               numbers[i][j] = sc.nextInt();
            }
        }
        System.out.println("2D Array is");
// output
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
