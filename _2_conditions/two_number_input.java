package _2_conditions;

import java.util.Scanner;

public class two_number_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        int a = sc.nextInt();
        System.out.println("enter b");
        int b = sc.nextInt();

        if(a==b) {
            System.out.println("equal");
        }
        else {
            if(a>b) {
                System.out.println("a is bada");
            }
            else {
                System.out.println("a is choto");
            }
        }

    }
}
