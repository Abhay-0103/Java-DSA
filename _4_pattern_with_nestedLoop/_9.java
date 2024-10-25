package _4_pattern_with_nestedLoop;

public class _9 {
    public static void main(String[] args) {
        int n = 5;
        // outer loop
        for (int i=1; i<=5; i++) {
            // inner loop
            for (int j=1; j<=i; j++) {
                int sum =i+j;
                if (sum % 2 == 0) {
                    // even
                    System.out.print("1 ");
                }
                else {
                    // odd
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}


//1
//0 1
//1 0 1
//0 1 0 1
//1 0 1 0 1