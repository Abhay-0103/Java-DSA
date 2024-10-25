package _13_Recursion;

   // stack

public class _6 {
    public static int calcpower(int x, int n) {
        if (n == 0) {     // base case 1
            return 1;
        }
        if (x == 0) {   // basde case 2
            return 0;
        }
        int xpownm1 = calcpower(x, n-1); // kaam
        int xpown = x * xpownm1;
        return xpown ;

    }
    public static void main(String[] args) {
       int x = 2, n = 5;
       int ans = calcpower(x, n);
        System.out.println(ans);

    }
}
