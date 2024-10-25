package _13_Recursion;
 // stack height =  logn
public class _7 {
     public static int calcpower(int x, int n) {
         if (n == 0) { // base class 1
             return 1;
         }
         if (x == 0) {  // base class 2
             return 0;
         }

         // if n is even
         if (n % 2 == 0) {
             return calcpower(x, n / 2) * calcpower(x, n / 2);
         } else {
             return calcpower(x, n / 2) * calcpower(x, n / 2) * x;
         }
     }

     public static void main(String[] args) {
         int x = 2, n = 5;
         int ans = calcpower(x,n);
         System.out.println(ans);
     }
}
