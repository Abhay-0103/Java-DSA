package _7_Arrays;

public class _1 {
    public static void main(String[] args) {
//        int[] marks = new int[3];
        // can also write
        int marks[] = new int[3];
        marks[0] = 98; // english
        marks[1] = 67; // hindi
        marks[2] = 90; // coding
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
        // for single time


        // now for all at a time
        for (int i=0; i<3; i++) {
            System.out.println(marks[i]);
        }
    }
}
