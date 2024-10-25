package _5_Function;

import java.util.Scanner;

public class _1 {
    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        System.out.println("enter the name : ");
        Scanner sc = new Scanner(System.in);
                String name =  sc.next();

                printMyName(name); // call kia functon ko bidu

    }
}
