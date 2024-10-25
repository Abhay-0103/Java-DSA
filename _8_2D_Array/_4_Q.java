package _8_2D_Array;

import java.util.Scanner;

public class _4_Q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter thr n elemets");
        int n = sc.nextInt();
        System.out.println("emter thr m elements");
        int m = sc.nextInt();

        int matrix[][] = new int[n][m];
        System.out.println("enter thr matrix");
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("the transpose is : ");
        // to print transpose
        for (int j=0; j<m; j++) {
            for (int i=0; i<n; i++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
