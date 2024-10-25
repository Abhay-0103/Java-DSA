package _5_Function;

import java.util.Scanner;

public class _4 {
    public static void printFactorial(int n) {
        // loop
        if (n<0) {
            System.out.println("invail hai bhai");
            return;
        }
        int factorial = 1;
        for(int i=n ; i>=1 ; i--){
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFactorial(n);

    }
}
