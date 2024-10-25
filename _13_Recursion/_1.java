package _13_Recursion;

// 5 to 1

public class _1 {
    public static void printnumber(int n) {
        if(n == 0) {
            return;
        }
        System.out.println(n);
        printnumber(n-1);

    }
    public static void main(String[] args) {
        int n =5;
        printnumber(n); //n=5
    }
}
