package _5_Function;
import java.util.Scanner;

public class _2 {
    public static int add2numbers(int a, int b) {
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(" enter the value a: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(" enter the value b: ");
        int b = sc.nextByte();

        int sum = add2numbers(a,b);
        System.out.println("sum is :"+ sum);
    }
}
