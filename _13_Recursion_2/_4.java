package _13_Recursion_2;

// find the number of ways in which you can
// invite n people to party
public class _4 {
    public static int callguest(int n) {
if (n <= 1) {
    return 1;
}
        // single
        int ways1 = callguest(n-1);

        // pair
        int ways2 = (n-1) * callguest(n-2);

        return ways1 + ways2;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(callguest(n));
    }
}

