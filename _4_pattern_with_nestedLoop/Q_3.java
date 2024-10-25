package _4_pattern_with_nestedLoop;

public class Q_3 {

    public static void main(String[] args) {
        int n = 5;
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            // first part
            for (int j=i; j>=1; j--) {
                System.out.print(j);
            }
            // second part
            for (int j=2; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
