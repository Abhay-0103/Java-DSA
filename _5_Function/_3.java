package _5_Function;
import java.util.Scanner;

public class _3 {
    public static int mul2numbers(int a, int b) {
//        int sum = a*b;
//        return sum;
        return a * b;
    }

    public static void main(String[] args) {
        System.out.println("enter the value a : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(" enter the value b: ");
        int b = sc.nextInt();

//        int sum = mul2numbers(a,b);
//        System.out.println("the sum is :"+ sum );


//for drect menthode
//        int sum  // nahi chahiye write this
//return a*b // thik hai it will come same output
//int sum = mul2numbers(a,b); // mat likho write this
        System.out.println("the sum is :" +mul2numbers(a, b));
    }
}
