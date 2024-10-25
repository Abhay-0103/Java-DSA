package _13_Recursion_2;
// place tiles of size 1xm in a floor of size nxm
// n=4,m=2
public class _3 {
    public static int placeTiles(int n, int m) {
        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }
    // veertically
        int vertplacements = placeTiles(n-m, m);

        // horizontally
        int horplacements = placeTiles(n-1, m);

        return vertplacements + horplacements;
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println(placeTiles(n,m));
    }
}
