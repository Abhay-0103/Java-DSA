package _2_conditions;

import java.util.Scanner;

public class homework_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the a");
       int a = sc.nextInt();
        System.out.println("enter the b");
       int b = sc.nextInt();
        System.out.println("enter the case");
       int operator = sc.nextInt();

       switch(operator) {
            case 1 :
                System.out.println(a+b);
                break;
            case 2 :
                System.out.println(a-b);
                break;
           case 3 :
               System.out.println(a*b);
               break;
           case 4 :
               System.out.println(a/b);
               break;
           case 5 :
               System.out.println(a%b);
               break;
           default:
               System.out.println("a tu jaa ree ");

        }

    }
}
