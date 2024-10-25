package _4_pattern_with_nestedLoop;

public class _2 {
    public static void main(String[] args) {
        int n = 4;
        int m = 5;

        // outer loop
        for (int i=1; i<=n; i++) {

            // inner loop
            for (int j=1; j<=m; j++) {

                // cell
                if (i == 1 || j == 1 || i == n || j == m ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


//****
//*  *
//*  *
//****