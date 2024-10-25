package _4_pattern_with_nestedLoop;

public class Q_1 {
    public static void main(String[] args) {
        int n = 5;
        // outer loop
        for (int i=1; i<=n; i++) {
            // inner loop
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            // inner loop
            for (int j=1; j<=5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//
//                *****
//               *****
//             *****
//          *****
//      *****